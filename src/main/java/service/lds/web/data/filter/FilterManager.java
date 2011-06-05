package service.lds.web.data.filter;


import service.lds.domain.dom.Question;
import service.lds.domain.dom.Tag;

import java.util.List;

public class FilterManager {

    private List<DataFilterChain> filterChains;

    public FilterManager(List<DataFilterChain> filterChains) {
        this.filterChains = filterChains;
    }

    public void process(List<Question> questions, List<String> tags) {
        for (DataFilterChain f : filterChains) {
            f.processFilter(questions, tags);
        }
    }


}
