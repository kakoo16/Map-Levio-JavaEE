package tn.esprit.map.entities;

import java.io.Serializable;
import javax.persistence.*;
import java.sql.Timestamp;


/**
 * The persistent class for the DayOffs database table.
 * 
 */
@Entity
@Table(name="DayOffs")
@NamedQuery(name="DayOff.findAll", query="SELECT d FROM DayOff d")
public class DayOff implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="DayoffId")
	private int dayoffId;

	private Timestamp end_Date;

	private Object raison;

	private Timestamp start_Date;

	//bi-directional many-to-one association to AspNetUser
	@ManyToOne
	@JoinColumn(name="Ressource_Id")
	private AspNetUser aspNetUser;

	public DayOff() {
	}

	public int getDayoffId() {
		return this.dayoffId;
	}

	public void setDayoffId(int dayoffId) {
		this.dayoffId = dayoffId;
	}

	public Timestamp getEnd_Date() {
		return this.end_Date;
	}

	public void setEnd_Date(Timestamp end_Date) {
		this.end_Date = end_Date;
	}

	public Object getRaison() {
		return this.raison;
	}

	public void setRaison(Object raison) {
		this.raison = raison;
	}

	public Timestamp getStart_Date() {
		return this.start_Date;
	}

	public void setStart_Date(Timestamp start_Date) {
		this.start_Date = start_Date;
	}

	public AspNetUser getAspNetUser() {
		return this.aspNetUser;
	}

	public void setAspNetUser(AspNetUser aspNetUser) {
		this.aspNetUser = aspNetUser;
	}

}