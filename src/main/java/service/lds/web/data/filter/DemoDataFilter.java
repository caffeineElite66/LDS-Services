package service.lds.web.data.filter;

/**
 * Created by IntelliJ IDEA.
 * User: kevin
 * Date: 6/2/11
 * Time: 12:19 PM
 * To change this template use File | Settings | File Templates.
 */
public class DemoDataFilter extends PrefixDataFilter implements DataFilter  {

    public DemoDataFilter(){
        this.prefix = "D_";
    }
}
