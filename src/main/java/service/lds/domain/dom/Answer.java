package service.lds.domain.dom;

import java.io.Serializable;

import javax.persistence.*;

@SuppressWarnings("serial")
@Entity
@Table(name = "MemberAnswer")
public class Answer implements Serializable {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;

	@ManyToOne(fetch = FetchType.EAGER)
	@JoinColumn(name = "member_question_id")
	private Question question;

	@Column(name = "answer_text")
	private String answerText;

	@Column(name = "answer_value")
	private String answerValue;

	@Column(name = "applicable")
	private Boolean applicable;

	@Column(name = "default_answer")
	private Boolean defaultAnswer;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Question getQuestion() {
		return question;
	}

	public void setQuestion(Question question) {
		this.question = question;
	}

	public String getAnswerText() {
		return answerText;
	}

	public void setAnswerText(String answerText) {
		this.answerText = answerText;
	}

	public String getAnswerValue() {
		return answerValue;
	}

	public void setAnswerValue(String answerValue) {
		this.answerValue = answerValue;
	}

	public Boolean isApplicable() {
		return applicable;
	}

	public void setApplicable(Boolean applicable) {
		this.applicable = applicable;
	}

	public boolean isDefaultAnswer() {
		return defaultAnswer;
	}

	public void setDefaultAnswer(Boolean defaultAnswer) {
		this.defaultAnswer = defaultAnswer;
	}

}
