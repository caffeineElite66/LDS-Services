package service.lds.web.data.filter;

/**
 * Created by IntelliJ IDEA.
 * User: kevin
 * Date: 6/2/11
 * Time: 12:19 PM
 * To change this template use File | Settings | File Templates.
 */
public class StateDataFilter extends PrefixDataFilter implements DataFilter {

    public StateDataFilter() {
        this.prefix = "ST_";
    }
}
