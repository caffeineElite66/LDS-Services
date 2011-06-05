package service.lds.web.servlet.filter;

import java.io.IOException;
import java.io.OutputStream;
import java.util.Map;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.log4j.Logger;

/**
 * In this filter, the only method I’m really implementing is the doFilter
 * method. If I needed to implement the other methods required by the Filter
 * class, I would need to add another init-param to my filter in web.xml called
 * “targetFilterLifecycle” and set it to true. That will force the init and
 * destroy methods to be called. Since I don’t need them right now, then I’ve
 * left them blank.
 */
public class JsonpCallbackFilter implements Filter {

	private static Logger logger = Logger.getLogger(JsonpCallbackFilter.class);

	public void init(FilterConfig fConfig) throws ServletException {
	}

	public void doFilter(ServletRequest request, ServletResponse response,
			FilterChain chain) throws IOException, ServletException {

		HttpServletRequest httpRequest = (HttpServletRequest) request;
		HttpServletResponse httpResponse = (HttpServletResponse) response;

		Map<String, String[]> parms = httpRequest.getParameterMap();

		if (parms.containsKey("callback")) {
			if (logger.isDebugEnabled())
				logger.debug("Wrapping response with JSONP callback '"
						+ parms.get("callback")[0] + "'");

			OutputStream out = httpResponse.getOutputStream();

			GenericResponseWrapper wrapper = new GenericResponseWrapper(
					httpResponse);

			chain.doFilter(request, wrapper);

			out.write(new String(parms.get("callback")[0] + "(").getBytes());
			out.write(wrapper.getData());
			out.write(new String(");").getBytes());

			wrapper.setContentType("text/javascript;charset=UTF-8");

			out.close();
		} else {
			chain.doFilter(request, response);
		}
	}

	public void destroy() {
	}
}