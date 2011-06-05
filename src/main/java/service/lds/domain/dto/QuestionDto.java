package service.lds.domain.dto;

import java.io.Serializable;
import java.util.List;
import java.util.Map;

@SuppressWarnings("serial")
public class QuestionDto implements Serializable {

	private long id;
	private String name;
	private String questionText;
    // TODO: not able to implement this field because the priority is base on question set as of now.
	private int priority;
	private List<Map<String, Object>> answers;
	private List<String> tags;

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public int getPriority() {
		return priority;
	}

	public void setPriority(int priority) {
		this.priority = priority;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getQuestionText() {
		return questionText;
	}

	public void setQuestionText(String questionText) {
		this.questionText = questionText;
	}

	public List<Map<String, Object>> getAnswers() {
		return answers;
	}

	public void setAnswers(List<Map<String, Object>> answers) {
		this.answers = answers;
	}

	public List<String> getTags() {
		return tags;
	}

	public void setTags(List<String> tags) {
		this.tags = tags;
	}

}
