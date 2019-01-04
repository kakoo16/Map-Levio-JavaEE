package tn.esprit.map.entities;

import java.io.Serializable;
import javax.persistence.*;
import java.sql.Timestamp;
import java.util.List;


/**
 * The persistent class for the Messages database table.
 * 
 */
@Entity
@Table(name="Messages")
@NamedQuery(name="Message.findAll", query="SELECT m FROM Message m")
public class Message implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="MessageId")
	private int messageId;

	@Column(name="Cost")
	private float cost;

	@Column(name="Date_message")
	private Timestamp date_message;

	@Column(name="DateDebutMessage")
	private Timestamp dateDebutMessage;

	@Column(name="DateFinMessage")
	private Timestamp dateFinMessage;

	@Column(name="EtatMessage")
	private boolean etatMessage;

	@Column(name="Message_content")
	private String message_content;

	@Column(name="Message_String")
	private String message_String;

	//bi-directional many-to-many association to Inboxe
	@ManyToMany
	@JoinTable(
		name="MessageInboxes"
		, joinColumns={
			@JoinColumn(name="Message_MessageId")
			}
		, inverseJoinColumns={
			@JoinColumn(name="Inbox_InboxId")
			}
		)
	private List<Inboxe> inboxes;

	//bi-directional many-to-one association to AspNetUser
	@ManyToOne
	@JoinColumn(name="RessourceMsgFK_Id")
	private AspNetUser aspNetUser1;

	//bi-directional many-to-one association to AspNetUser
	@ManyToOne
	@JoinColumn(name="Administrator_Id")
	private AspNetUser aspNetUser2;

	public Message() {
	}

	public int getMessageId() {
		return this.messageId;
	}

	public void setMessageId(int messageId) {
		this.messageId = messageId;
	}

	public float getCost() {
		return this.cost;
	}

	public void setCost(float cost) {
		this.cost = cost;
	}

	public Timestamp getDate_message() {
		return this.date_message;
	}

	public void setDate_message(Timestamp date_message) {
		this.date_message = date_message;
	}

	public Timestamp getDateDebutMessage() {
		return this.dateDebutMessage;
	}

	public void setDateDebutMessage(Timestamp dateDebutMessage) {
		this.dateDebutMessage = dateDebutMessage;
	}

	public Timestamp getDateFinMessage() {
		return this.dateFinMessage;
	}

	public void setDateFinMessage(Timestamp dateFinMessage) {
		this.dateFinMessage = dateFinMessage;
	}

	public boolean getEtatMessage() {
		return this.etatMessage;
	}

	public void setEtatMessage(boolean etatMessage) {
		this.etatMessage = etatMessage;
	}

	public String getMessage_content() {
		return this.message_content;
	}

	public void setMessage_content(String message_content) {
		this.message_content = message_content;
	}

	public String getMessage_String() {
		return this.message_String;
	}

	public void setMessage_String(String message_String) {
		this.message_String = message_String;
	}

	public List<Inboxe> getInboxes() {
		return this.inboxes;
	}

	public void setInboxes(List<Inboxe> inboxes) {
		this.inboxes = inboxes;
	}

	public AspNetUser getAspNetUser1() {
		return this.aspNetUser1;
	}

	public void setAspNetUser1(AspNetUser aspNetUser1) {
		this.aspNetUser1 = aspNetUser1;
	}

	public AspNetUser getAspNetUser2() {
		return this.aspNetUser2;
	}

	public void setAspNetUser2(AspNetUser aspNetUser2) {
		this.aspNetUser2 = aspNetUser2;
	}

}