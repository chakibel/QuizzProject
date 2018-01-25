package model;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the questions database table.
 * 
 */
@Entity
@Table(name="questions")
@NamedQuery(name="Question.findAll", query="SELECT q FROM Question q")
public class Question implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	private int idQuestion;

	@Column(name="distractor_1")
	private String distractor1;

	@Column(name="distractor_2")
	private String distractor2;

	@Column(name="distractor_3")
	private String distractor3;

	@Column(name="good_answer")
	private String goodAnswer;

	@Column(name="question_nlg")
	private String questionNlg;

	//bi-directional many-to-one association to Topic
	@ManyToOne
	@JoinColumn(name="idTopic")
	private Topic topic;

	public Question() {
	}

	public int getIdQuestion() {
		return this.idQuestion;
	}

	public void setIdQuestion(int idQuestion) {
		this.idQuestion = idQuestion;
	}

	public String getDistractor1() {
		return this.distractor1;
	}

	public void setDistractor1(String distractor1) {
		this.distractor1 = distractor1;
	}

	public String getDistractor2() {
		return this.distractor2;
	}

	public void setDistractor2(String distractor2) {
		this.distractor2 = distractor2;
	}

	public String getDistractor3() {
		return this.distractor3;
	}

	public void setDistractor3(String distractor3) {
		this.distractor3 = distractor3;
	}

	public String getGoodAnswer() {
		return this.goodAnswer;
	}

	public void setGoodAnswer(String goodAnswer) {
		this.goodAnswer = goodAnswer;
	}

	public String getQuestionNlg() {
		return this.questionNlg;
	}

	public void setQuestionNlg(String questionNlg) {
		this.questionNlg = questionNlg;
	}

	public Topic getTopic() {
		return this.topic;
	}

	public void setTopic(Topic topic) {
		this.topic = topic;
	}

}