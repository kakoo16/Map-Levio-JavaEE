package tn.esprit.map.entities;

import java.io.Serializable;
import javax.persistence.*;
import java.util.List;


/**
 * The persistent class for the Inboxes database table.
 * 
 */
@Entity
@Table(name="Inboxes")
@NamedQuery(name="Inboxe.findAll", query="SELECT i FROM Inboxe i")
public class Inboxe implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="InboxId")
	private int inboxId;

	private String sender;

	//bi-directional many-to-one association to AspNetUser
	@ManyToOne
	@JoinColumn(name="MyPerson_Id")
	private AspNetUser aspNetUser;

	//bi-directional many-to-many association to Message
	@ManyToMany(mappedBy="inboxes")
	private List<Message> messages;

	public Inboxe() {
	}

	public int getInboxId() {
		return this.inboxId;
	}

	public void setInboxId(int inboxId) {
		this.inboxId = inboxId;
	}

	public String getSender() {
		return this.sender;
	}

	public void setSender(String sender) {
		this.sender = sender;
	}

	public AspNetUser getAspNetUser() {
		return this.aspNetUser;
	}

	public void setAspNetUser(AspNetUser aspNetUser) {
		this.aspNetUser = aspNetUser;
	}

	public List<Message> getMessages() {
		return this.messages;
	}

	public void setMessages(List<Message> messages) {
		this.messages = messages;
	}

}