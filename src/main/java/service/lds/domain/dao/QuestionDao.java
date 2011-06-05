package service.lds.domain.dao;

import service.lds.domain.dom.Question;

import java.util.List;
import java.util.ListIterator;

public interface QuestionDao {
	public Question findQuestionById(long id);

	public List<Question> findQuestionsByTag(List<String> tags);

    public List<Question> findQuestionsByActiveUncapped();
}
