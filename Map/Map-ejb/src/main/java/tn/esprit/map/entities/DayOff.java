package tn.esprit.map.entities;

import java.io.Serializable;
import javax.persistence.*;
import java.sql.Timestamp;
import java.util.Date;


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

	private Date end_Date;

	private String raison;

	private Date start_Date;

	//bi-directional many-to-one association to AspNetUser
	@ManyToOne
	@JoinColumn(name="Ressource_Id")
	private AspNetUser aspNetUser;

	public DayOff() {
	}

	
	public DayOff(Timestamp end_Date, String raison, Timestamp start_Date) {
		super();
		this.end_Date = end_Date;
		this.raison = raison;
		this.start_Date = start_Date;
	}


	public int getDayoffId() {
		return this.dayoffId;
	}

	public void setDayoffId(int dayoffId) {
		this.dayoffId = dayoffId;
	}

	@Temporal(TemporalType.TIMESTAMP)
	public Date getEnd_Date() {
		return this.end_Date;
	}

	public void setEnd_Date(Date end_Date) {
		this.end_Date = end_Date;
	}

	public String getRaison() {
		return this.raison;
	}

	public void setRaison(String raison) {
		this.raison = raison;
	}

	@Temporal(TemporalType.TIMESTAMP)
	public Date getStart_Date() {
		return this.start_Date;
	}

	public void setStart_Date(Date start_Date) {
		this.start_Date = start_Date;
	}

	public AspNetUser getAspNetUser() {
		return this.aspNetUser;
	}

	public void setAspNetUser(AspNetUser aspNetUser) {
		this.aspNetUser = aspNetUser;
	}


	public DayOff(int dayoffId,Date start_Date, Date end_Date, String raison) {
		super();
		this.dayoffId = dayoffId;
		this.end_Date = end_Date;
		this.raison = raison;
		this.start_Date = start_Date;
	}

}