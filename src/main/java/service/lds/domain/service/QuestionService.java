package service.lds.domain.service;

import service.lds.domain.dom.Question;
import service.lds.domain.dom.Tag;

import java.util.List;

public interface QuestionService {

	public List<Question> findQuestionsByTag(List<String> tags);
}
