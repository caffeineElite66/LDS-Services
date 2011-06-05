package service.lds.domain.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;
import service.lds.domain.dao.QuestionDao;
import service.lds.domain.dom.Question;
import service.lds.domain.dom.Tag;
import service.lds.web.data.filter.FilterManager;

import java.util.List;

@Service("questionService")
@Repository
public class JpaQuestionService implements QuestionService {

	@Autowired
	private QuestionDao questionDao;

    @Autowired
    private FilterManager filterManager;

	public void setQuestionDao(QuestionDao questionDao) {
		this.questionDao = questionDao;
	}

	@Override
	public List<Question> findQuestionsByTag(List<String> tags) {
		//return questionDao.findQuestionsByTag(tags);

        // get init dataset
        // config filter manager with filter chain
        // process data and return data set

        List<Question> dataSet = questionDao.findQuestionsByActiveUncapped();
        filterManager.process(dataSet, tags);
        return dataSet;
	}

}
