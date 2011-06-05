package service.lds.web.data.filter;

import service.lds.domain.dom.Question;
import service.lds.domain.dom.Tag;

import javax.servlet.jsp.tagext.TagSupport;
import java.util.List;
import java.util.Set;

public class SystemDataFilter extends PrefixDataFilter implements DataFilter  {

    public SystemDataFilter() {
        this.prefix = "S_";
    }

}
