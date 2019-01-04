package tn.esprit.map.entities;

import java.io.Serializable;
import javax.persistence.*;
import java.sql.Timestamp;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import java.util.List;
import com.fasterxml.jackson.annotation.JsonProperty;


/**
 * The persistent class for the Projects database table.
 * 
 */
@Entity
@Table(name="Projects")
@NamedQuery(name="Project.findAll", query="SELECT p FROM Project p")
@JsonIgnoreProperties(ignoreUnknown=true)
public class Project implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="ProjectId")
	private int projectId;

	@Column(name="category_type")
	private String categoryType;

	@Column(name="end_date")
	private Timestamp endDate;

	@Column(name="levio_number_ressources")
	private int levioNumberRessources;

	private String picture;

	@Column(name="project_name")
	private String projectName;

	@Column(name="project_type")
	private int projectType;

	@Column(name="start_date")
	private Timestamp startDate;

	@Column(name="total_number_ressources")
	private int totalNumberRessources;

	//bi-directional many-to-one association to Mandate
	@OneToMany(mappedBy="project" ,fetch=FetchType.EAGER)
	private List<Mandate> mandates;

	//bi-directional many-to-one association to Address
	@JsonProperty("address")
	@ManyToOne
	@JoinColumn(name="addresse_AddressId")
	private Address address;

	//bi-directional many-to-one association to AspNetUser
	@ManyToOne
	@JoinColumn(name="MyClient_Id")
	private AspNetUser aspNetUser;

	//bi-directional many-to-one association to Organizational_Chart
	@ManyToOne
	@JoinColumn(name="MyOrgChart_ChartId")
	private Organizational_Chart organizationalChart;

	//bi-directional many-to-one association to Skill
	@ManyToOne
	@JoinColumn(name="SkillFk_SkillId")
	private Skill skill;

	public Project() {
	}

	public int getProjectId() {
		return this.projectId;
	}

	public void setProjectId(int projectId) {
		this.projectId = projectId;
	}

	public String getCategoryType() {
		return this.categoryType;
	}

	public void setCategoryType(String categoryType) {
		this.categoryType = categoryType;
	}

	public Timestamp getEndDate() {
		return this.endDate;
	}

	public void setEndDate(Timestamp endDate) {
		this.endDate = endDate;
	}

	public int getLevioNumberRessources() {
		return this.levioNumberRessources;
	}

	public void setLevioNumberRessources(int levioNumberRessources) {
		this.levioNumberRessources = levioNumberRessources;
	}

	public String getPicture() {
		return this.picture;
	}

	public void setPicture(String picture) {
		this.picture = picture;
	}

	public String getProjectName() {
		return this.projectName;
	}

	public void setProjectName(String projectName) {
		this.projectName = projectName;
	}

	public int getProjectType() {
		return this.projectType;
	}

	public void setProjectType(int projectType) {
		this.projectType = projectType;
	}

	public Timestamp getStartDate() {
		return this.startDate;
	}

	public void setStartDate(Timestamp startDate) {
		this.startDate = startDate;
	}

	public int getTotalNumberRessources() {
		return this.totalNumberRessources;
	}

	public void setTotalNumberRessources(int totalNumberRessources) {
		this.totalNumberRessources = totalNumberRessources;
	}

	public List<Mandate> getMandates() {
		return this.mandates;
	}

	public void setMandates(List<Mandate> mandates) {
		this.mandates = mandates;
	}

	public Mandate addMandate(Mandate mandate) {
		getMandates().add(mandate);
		mandate.setProject(this);

		return mandate;
	}

	public Mandate removeMandate(Mandate mandate) {
		getMandates().remove(mandate);
		mandate.setProject(null);

		return mandate;
	}
	
	public Address getAddress() {
		return this.address;
	}

	public void setAddress(Address address) {
		this.address = address;
	}

	public AspNetUser getAspNetUser() {
		return this.aspNetUser;
	}

	public void setAspNetUser(AspNetUser aspNetUser) {
		this.aspNetUser = aspNetUser;
	}

	public Organizational_Chart getOrganizationalChart() {
		return this.organizationalChart;
	}

	public void setOrganizationalChart(Organizational_Chart organizationalChart) {
		this.organizationalChart = organizationalChart;
	}

	public Skill getSkill() {
		return this.skill;
	}

	public void setSkill(Skill skill) {
		this.skill = skill;
	}

	@Override
	public String toString() {
		return "Project [projectId=" + projectId + ", categoryType=" + categoryType + ", endDate=" + endDate
				+ ", levioNumberRessources=" + levioNumberRessources + ", picture=" + picture + ", projectName="
				+ projectName + ", projectType=" + projectType + ", startDate=" + startDate + ", totalNumberRessources="
				+ totalNumberRessources + ", mandates=" + mandates + ", address=" + address + ", aspNetUser="
				+ aspNetUser + ", organizationalChart=" + organizationalChart + ", skill=" + skill + "]";
	}

}