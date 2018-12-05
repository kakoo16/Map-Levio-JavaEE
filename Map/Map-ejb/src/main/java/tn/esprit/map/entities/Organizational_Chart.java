package tn.esprit.map.entities;

import java.io.Serializable;
import javax.persistence.*;
import java.util.List;


/**
 * The persistent class for the Organizational_Chart database table.
 * 
 */
@Entity
@NamedQuery(name="Organizational_Chart.findAll", query="SELECT o FROM Organizational_Chart o")
public class Organizational_Chart implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="ChartId")
	private int chartId;

	private Object client_Name;

	@Column(name="directionnal_level")
	private Object directionnalLevel;

	@Column(name="manager_account")
	private Object managerAccount;

	@Column(name="name_assignment_manager_client")
	private Object nameAssignmentManagerClient;

	private Object program_Name;

	@Column(name="project_responsable")
	private Object projectResponsable;

	//bi-directional many-to-one association to AspNetUser
	@OneToMany(mappedBy="organizationalChart")
	private List<AspNetUser> aspNetUsers1;

	//bi-directional many-to-many association to AspNetUser
	@ManyToMany
	@JoinTable(
		name="Organizational_ChartRessource"
		, joinColumns={
			@JoinColumn(name="Organizational_Chart_ChartId")
			}
		, inverseJoinColumns={
			@JoinColumn(name="Ressource_Id")
			}
		)
	private List<AspNetUser> aspNetUsers2;

	//bi-directional many-to-one association to Project
	@OneToMany(mappedBy="organizationalChart")
	private List<Project> projects;

	public Organizational_Chart() {
	}

	public int getChartId() {
		return this.chartId;
	}

	public void setChartId(int chartId) {
		this.chartId = chartId;
	}

	public Object getClient_Name() {
		return this.client_Name;
	}

	public void setClient_Name(Object client_Name) {
		this.client_Name = client_Name;
	}

	public Object getDirectionnalLevel() {
		return this.directionnalLevel;
	}

	public void setDirectionnalLevel(Object directionnalLevel) {
		this.directionnalLevel = directionnalLevel;
	}

	public Object getManagerAccount() {
		return this.managerAccount;
	}

	public void setManagerAccount(Object managerAccount) {
		this.managerAccount = managerAccount;
	}

	public Object getNameAssignmentManagerClient() {
		return this.nameAssignmentManagerClient;
	}

	public void setNameAssignmentManagerClient(Object nameAssignmentManagerClient) {
		this.nameAssignmentManagerClient = nameAssignmentManagerClient;
	}

	public Object getProgram_Name() {
		return this.program_Name;
	}

	public void setProgram_Name(Object program_Name) {
		this.program_Name = program_Name;
	}

	public Object getProjectResponsable() {
		return this.projectResponsable;
	}

	public void setProjectResponsable(Object projectResponsable) {
		this.projectResponsable = projectResponsable;
	}

	public List<AspNetUser> getAspNetUsers1() {
		return this.aspNetUsers1;
	}

	public void setAspNetUsers1(List<AspNetUser> aspNetUsers1) {
		this.aspNetUsers1 = aspNetUsers1;
	}

	public AspNetUser addAspNetUsers1(AspNetUser aspNetUsers1) {
		getAspNetUsers1().add(aspNetUsers1);
		aspNetUsers1.setOrganizationalChart(this);

		return aspNetUsers1;
	}

	public AspNetUser removeAspNetUsers1(AspNetUser aspNetUsers1) {
		getAspNetUsers1().remove(aspNetUsers1);
		aspNetUsers1.setOrganizationalChart(null);

		return aspNetUsers1;
	}

	public List<AspNetUser> getAspNetUsers2() {
		return this.aspNetUsers2;
	}

	public void setAspNetUsers2(List<AspNetUser> aspNetUsers2) {
		this.aspNetUsers2 = aspNetUsers2;
	}

	public List<Project> getProjects() {
		return this.projects;
	}

	public void setProjects(List<Project> projects) {
		this.projects = projects;
	}

	public Project addProject(Project project) {
		getProjects().add(project);
		project.setOrganizationalChart(this);

		return project;
	}

	public Project removeProject(Project project) {
		getProjects().remove(project);
		project.setOrganizationalChart(null);

		return project;
	}

}