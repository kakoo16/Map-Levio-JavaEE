package tn.esprit.map.entities;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the Mandates database table.
 * 
 */
@Entity
@Table(name="Mandates")
@NamedQuery(name="Mandate.findAll", query="SELECT m FROM Mandate m")
public class Mandate implements Serializable {
	private static final long serialVersionUID = 1L;

	@EmbeddedId
	private MandatePK id;

	@Column(name="Fees")
	private double fees;

	//bi-directional many-to-one association to AspNetUser
	@ManyToOne
	@JoinColumn(name="Id")
	private AspNetUser aspNetUser;

	//bi-directional many-to-one association to Project
	@ManyToOne
	@JoinColumn(name="ProjectId")
	private Project project;

	public Mandate() {
	}

	public MandatePK getId() {
		return this.id;
	}

	public void setId(MandatePK id) {
		this.id = id;
	}

	public double getFees() {
		return this.fees;
	}

	public void setFees(double fees) {
		this.fees = fees;
	}

	public AspNetUser getAspNetUser() {
		return this.aspNetUser;
	}

	public void setAspNetUser(AspNetUser aspNetUser) {
		this.aspNetUser = aspNetUser;
	}

	public Project getProject() {
		return this.project;
	}

	public void setProject(Project project) {
		this.project = project;
	}

}