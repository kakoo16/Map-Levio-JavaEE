package tn.esprit.map.entities;

import java.io.Serializable;
import java.sql.Timestamp;

import javax.persistence.*;


/**
 * The persistent class for the Commentaires database table.
 * 
 */
@Entity
@Table(name="Commentaire")
@NamedQuery(name="Commentaire.findAll", query="SELECT r FROM Commentaire r")
public class Commentaire implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="CommentaireId")
	private int CommentaireId;

	@Column(name="Message_content")
	private String message_content;
	
	@Column(name="Date")
	private Timestamp datee;
	@Column(name="etat")
	private boolean etat;

	@Column(name="username")
	private String Username;

	public Commentaire() {
	}

	public Commentaire(int commentaireId, String message_content, Timestamp datee, boolean etat, String username) {
		super();
		CommentaireId = commentaireId;
		this.message_content = message_content;
		this.datee = datee;
		this.etat = etat;
		Username = username;
	}

	public Commentaire(String message_content, Timestamp datee, boolean etat, String Username) {
		super();
		this.message_content = message_content;
		this.datee = datee;
		this.etat = etat;
		this.Username = Username;
	}

	public int getCommentaireId() {
		return this.CommentaireId;
	}

	public void setCommentaireId(int CommentaireId) {
		this.CommentaireId = CommentaireId;
	}

	public String getMessage_content() {
		return this.message_content;
	}

	public void setMessage_content(String message_content) {
		this.message_content = message_content;
	}

	public String getUsername() {
		return this.Username;
	}

	public void setUsername(String Username) {
		this.Username = Username;
	}

	public Timestamp getDatee() {
		return datee;
	}

	public void setDatee(Timestamp datee) {
		this.datee = datee;
	}

	public boolean isEtat() {
		return etat;
	}

	public void setEtat(boolean etat) {
		this.etat = etat;
	}

	@Override
	public String toString() {
		return "Commentaire [CommentaireId=" + CommentaireId + ", message_content=" + message_content + ", datee="
				+ datee + ", etat=" + etat + ", Username=" + Username + "]";
	}

	

}