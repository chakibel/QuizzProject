package model;

import java.io.Serializable;
import javax.persistence.*;

/**
 * The primary key class for the score database table.
 * 
 */
@Embeddable
public class ScorePK implements Serializable {
	//default serial version id, required for serializable classes.
	private static final long serialVersionUID = 1L;

	@Column(insertable=false, updatable=false)
	private int idUser;

	@Column(insertable=false, updatable=false)
	private int idTopic;

	public ScorePK() {
	}
	public int getIdUser() {
		return this.idUser;
	}
	public void setIdUser(int idUser) {
		this.idUser = idUser;
	}
	public int getIdTopic() {
		return this.idTopic;
	}
	public void setIdTopic(int idTopic) {
		this.idTopic = idTopic;
	}

	public boolean equals(Object other) {
		if (this == other) {
			return true;
		}
		if (!(other instanceof ScorePK)) {
			return false;
		}
		ScorePK castOther = (ScorePK)other;
		return 
			(this.idUser == castOther.idUser)
			&& (this.idTopic == castOther.idTopic);
	}

	public int hashCode() {
		final int prime = 31;
		int hash = 17;
		hash = hash * prime + this.idUser;
		hash = hash * prime + this.idTopic;
		
		return hash;
	}
}