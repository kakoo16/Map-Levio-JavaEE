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
	public Organizational_Chart(int chartId, String client_Name, String directionnalLevel, String managerAccount,
			String nameAssignmentManagerClient, String program_Name, String projectResponsable,
			List<AspNetUser> aspNetUsers1, List<AspNetUser> aspNetUsers2, List<Project> projects) {
		super();
		this.chartId = chartId;
		this.client_Name = client_Name;
		this.directionnalLevel = directionnalLevel;
		this.managerAccount = managerAccount;
		this.nameAssignmentManagerClient = nameAssignmentManagerClient;
		this.program_Name = program_Name;
		this.projectResponsable = projectResponsable;
		this.aspNetUsers1 = aspNetUsers1;
		this.aspNetUsers2 = aspNetUsers2;
		this.projects = projects;
	}

	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="ChartId")
	private int chartId;

	private String client_Name;

	@Column(name="directionnal_level")
	private String directionnalLevel;

	@Column(name="manager_account")
	private String managerAccount;

	@Column(name="name_assignment_manager_client")
	private String nameAssignmentManagerClient;

	private String program_Name;

	@Column(name="project_responsable")
	private String projectResponsable;

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

	

	public Organizational_Chart(String client_Name, String directionnalLevel, String managerAccount,
			String nameAssignmentManagerClient, String program_Name, String projectResponsable) {
		super();
		this.client_Name = client_Name;
		this.directionnalLevel = directionnalLevel;
		this.managerAccount = managerAccount;
		this.nameAssignmentManagerClient = nameAssignmentManagerClient;
		this.program_Name = program_Name;
		this.projectResponsable = projectResponsable;
	}



	public Organizational_Chart(String directionnal_level, String program_Name, String project_responsable,
			String client_Name, String manager_account, String name_assignment_manager_client, int tobeupdated) {
		
		this.client_Name = client_Name;
		this.directionnalLevel = directionnal_level;
		this.managerAccount = manager_account;
		this.nameAssignmentManagerClient = name_assignment_manager_client;
		this.program_Name = program_Name;
		this.projectResponsable = project_responsable;
		this.chartId=tobeupdated;
	}



	public int getChartId() {
		return this.chartId;
	}

	public void setChartId(int chartId) {
		this.chartId = chartId;
	}

	public String getClient_Name() {
		return this.client_Name;
	}

	public void setClient_Name(String client_Name) {
		this.client_Name = client_Name;
	}

	public String getDirectionnalLevel() {
		return this.directionnalLevel;
	}

	public void setDirectionnalLevel(String directionnalLevel) {
		this.directionnalLevel = directionnalLevel;
	}

	public String getManagerAccount() {
		return this.managerAccount;
	}

	public void setManagerAccount(String managerAccount) {
		this.managerAccount = managerAccount;
	}

	public String getNameAssignmentManagerClient() {
		return this.nameAssignmentManagerClient;
	}

	public void setNameAssignmentManagerClient(String nameAssignmentManagerClient) {
		this.nameAssignmentManagerClient = nameAssignmentManagerClient;
	}

	public String getProgram_Name() {
		return this.program_Name;
	}

	public void setProgram_Name(String program_Name) {
		this.program_Name = program_Name;
	}

	public String getProjectResponsable() {
		return this.projectResponsable;
	}

	public void setProjectResponsable(String projectResponsable) {
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