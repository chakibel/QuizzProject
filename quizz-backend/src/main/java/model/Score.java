package model;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the score database table.
 * 
 */
@Entity
@NamedQuery(name="Score.findAll", query="SELECT s FROM Score s")
public class Score implements Serializable {
	private static final long serialVersionUID = 1L;

	@EmbeddedId
	private ScorePK id;

	private int score;

	//bi-directional many-to-one association to Topic
	@ManyToOne
	@JoinColumn(name="idTopic")
	private Topic topic;

	//bi-directional many-to-one association to User
	@ManyToOne
	@JoinColumn(name="idUser")
	private User user;

	public Score() {
	}

	public ScorePK getId() {
		return this.id;
	}

	public void setId(ScorePK id) {
		this.id = id;
	}

	public int getScore() {
		return this.score;
	}

	public void setScore(int score) {
		this.score = score;
	}

	public Topic getTopic() {
		return this.topic;
	}

	public void setTopic(Topic topic) {
		this.topic = topic;
	}

	public User getUser() {
		return this.user;
	}

	public void setUser(User user) {
		this.user = user;
	}

}