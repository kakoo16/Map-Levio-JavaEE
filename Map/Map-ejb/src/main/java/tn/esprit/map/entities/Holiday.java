package tn.esprit.map.entities;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.*;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * The persistent class for the Holidays database table.
 * 
 */
@Entity
@JsonIgnoreProperties(ignoreUnknown=true)
@Table(name="Holidays")
@NamedQuery(name="Holiday.findAll", query="SELECT h FROM Holiday h")
public class Holiday implements Serializable {
	private static final long serialVersionUID = 1L;

	@JsonProperty("HolidayId")
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="HolidayId")
	private int holidayId;

	@Column(name="Description")
	@JsonProperty("Description")
	private String description;
	
	@JsonProperty("end_Date")
	@Temporal(TemporalType.DATE)
	private java.util.Date end_Date;
	
	@JsonProperty("stard_Date")
	@Temporal(TemporalType.DATE)
	private java.util.Date stard_Date;

	//bi-directional many-to-one association to AspNetUser
	@ManyToOne
	@JoinColumn(name="Ressource_Id")
	private AspNetUser aspNetUser;

	public Holiday() {
	}

	public int getHolidayId() {
		return this.holidayId;
	}

	public void setHolidayId(int holidayId) {
		this.holidayId = holidayId;
	}

	public String getDescription() {
		return this.description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public java.util.Date getEnd_Date() {
		return this.end_Date;
	}

	public void setEnd_Date(java.util.Date end_Date) {
		this.end_Date = end_Date;
	}

	public java.util.Date getStard_Date() {
		return this.stard_Date;
	}

	public void setStard_Date(java.util.Date stard_Date) {
		this.stard_Date = stard_Date;
	}

	public AspNetUser getAspNetUser() {
		return this.aspNetUser;
	}

	public void setAspNetUser(AspNetUser aspNetUser) {
		this.aspNetUser = aspNetUser;
	}

	public Holiday(String description, Date end_Date, Date stard_Date) {
		super();
		this.description = description;
		this.end_Date = end_Date;
		this.stard_Date = stard_Date;
	}

	public Holiday(int holidayId, String description, Date end_Date, Date stard_Date) {
		super();
		this.holidayId = holidayId;
		this.description = description;
		this.end_Date = end_Date;
		this.stard_Date = stard_Date;
	}

	public Holiday( String description, Date end_Date, Date stard_Date , int holidayId) {
		super();
		this.holidayId = holidayId;
		this.description = description;
		this.end_Date = end_Date;
		this.stard_Date = stard_Date;
	}	
	
}