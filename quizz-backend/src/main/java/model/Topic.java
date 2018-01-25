package model;

import java.io.Serializable;
import javax.persistence.*;
import java.util.List;


/**
 * The persistent class for the topic database table.
 * 
 */
@Entity
@NamedQuery(name="Topic.findAll", query="SELECT t FROM Topic t")
public class Topic implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	private int idTopic;

	private String descriptionTopic;

	private String nameTopic;

	//bi-directional many-to-one association to Question
	@OneToMany(mappedBy="topic")
	private List<Question> questions;

	//bi-directional many-to-one association to Score
	@OneToMany(mappedBy="topic")
	private List<Score> scores;

	public Topic() {
	}

	public int getIdTopic() {
		return this.idTopic;
	}

	public void setIdTopic(int idTopic) {
		this.idTopic = idTopic;
	}

	public String getDescriptionTopic() {
		return this.descriptionTopic;
	}

	public void setDescriptionTopic(String descriptionTopic) {
		this.descriptionTopic = descriptionTopic;
	}

	public String getNameTopic() {
		return this.nameTopic;
	}

	public void setNameTopic(String nameTopic) {
		this.nameTopic = nameTopic;
	}

	public List<Question> getQuestions() {
		return this.questions;
	}

	public void setQuestions(List<Question> questions) {
		this.questions = questions;
	}

	public Question addQuestion(Question question) {
		getQuestions().add(question);
		question.setTopic(this);

		return question;
	}

	public Question removeQuestion(Question question) {
		getQuestions().remove(question);
		question.setTopic(null);

		return question;
	}

	public List<Score> getScores() {
		return this.scores;
	}

	public void setScores(List<Score> scores) {
		this.scores = scores;
	}

	public Score addScore(Score score) {
		getScores().add(score);
		score.setTopic(this);

		return score;
	}

	public Score removeScore(Score score) {
		getScores().remove(score);
		score.setTopic(null);

		return score;
	}

}