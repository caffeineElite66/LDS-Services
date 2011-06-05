package service.lds.web.data.filter;

import service.lds.domain.dom.Question;
import service.lds.domain.dom.Tag;

import java.util.ArrayList;
import java.util.List;
import java.util.logging.Filter;


public class DataFilterChain {

    private List<DataFilter> filters = new ArrayList<DataFilter>();

    public DataFilterChain(List<DataFilter> filters) {
        this.filters = filters;
    }

    public void processFilter(List<Question> dataSet, List<String> tags) {
        for (DataFilter f : filters) {
            f.execute(dataSet, tags);
        }
    }
}
