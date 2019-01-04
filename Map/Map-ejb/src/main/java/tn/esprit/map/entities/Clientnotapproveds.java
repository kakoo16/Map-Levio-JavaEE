package tn.esprit.map.entities;

import java.io.Serializable;


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQuery;
import javax.persistence.Table;

@Entity
@Table(name="Clientnotapproveds")
@NamedQuery(name="Clientnotapproveds.findAll", query="SELECT p FROM Clientnotapproveds p")
public class Clientnotapproveds  implements Serializable{
	private static final long serialVersionUID = 1L;
	
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="ClientId")
	private int ClientId;
	
	@Column(name="NomClient")
	private String NomClient;
	
	@Column(name="Email")
	private String Email;
	
	@Column(name="Password")
	private String Password;
	
	@Column(name="IsApproved")
	private Boolean IsApproved;
	
	@Column(name="client_Type")
	private String client_Type;
	
	@Column(name="logo")
	private String logo;

	public int getClientId() {
		return ClientId;
	}

	public void setClientId(int clientid) {
		ClientId = clientid;
	}

	public String getNomClient() {
		return NomClient;
	}

	public void setNomClient(String nomClient) {
		NomClient = nomClient;
	}

	public String getEmail() {
		return Email;
	}

	public void setEmail(String email) {
		Email = email;
	}

	public String getPassword() {
		return Password;
	}

	public void setPassword(String password) {
		Password = password;
	}

	public Boolean getIsApproved() {
		return IsApproved;
	}

	public void setIsApproved(Boolean isApproved) {
		IsApproved = isApproved;
	}

	public String getClient_Type() {
		return client_Type;
	}

	public void setClient_Type(String client_Type) {
		this.client_Type = client_Type;
	}

	public String getLogo() {
		return logo;
	}

	public void setLogo(String logo) {
		this.logo = logo;
	}

	@Override
	public String toString() {
		return "Clientnotapproveds [ClientId=" + ClientId + ", NomClient=" + NomClient + ", Email=" + Email
				+ ", Password=" + Password + ", IsApproved=" + IsApproved + ", client_Type=" + client_Type + ", logo="
				+ logo + "]";
	}
	
	
	

}
