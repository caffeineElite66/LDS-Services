package service.lds.web.data.filter;

import service.lds.domain.dom.Question;
import service.lds.domain.dom.Tag;

import java.util.List;


public interface DataFilter {

    public void execute(List<Question> questions, List<String> tags);

}
