package tn.esprit.map.entities;

import java.io.Serializable;
import javax.persistence.*;
import java.sql.Timestamp;
import java.util.List;


/**
 * The persistent class for the AspNetUsers database table.
 * 
 */
@Entity
@Table(name="AspNetUsers")
@NamedQuery(name="AspNetUser.findAll", query="SELECT a FROM AspNetUser a")
public class AspNetUser implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="Id")
	private String id;

	@Column(name="AccessFailedCount")
	private int accessFailedCount;

	@Column(name="AdministratorId")
	private int administratorId;

	@Column(name="availibity_type")
	private int availibityType;

	@Column(name="Business_sector")
	private Object business_sector;

	@Column(name="CandidatId")
	private int candidatId;

	private int client_Type;

	@Column(name="ClientId")
	private int clientId;

	private int contract_Type;

	@Column(name="DaysoffFK")
	private int daysoffFK;

	@Column(name="Discriminator")
	private Object discriminator;

	@Column(name="Email")
	private Object email;

	@Column(name="EmailConfirmed")
	private boolean emailConfirmed;

	private boolean etat;

	@Column(name="EtatResource")
	private Object etatResource;

	@Column(name="First_name")
	private Object first_name;

	@Column(name="FirstName")
	private Object firstName;

	@Column(name="HolidayFk")
	private int holidayFk;

	@Column(name="JobType")
	private Object jobType;

	private Object lang;

	@Column(name="Last_name")
	private Object last_name;

	@Column(name="LastName")
	private Object lastName;

	private Object lat;

	@Column(name="LockoutEnabled")
	private boolean lockoutEnabled;

	@Column(name="LockoutEndDateUtc")
	private Timestamp lockoutEndDateUtc;

	private Object logo;

	private Object nameClient;

	@Column(name="Note")
	private float note;

	@Column(name="Organizational_ChartFk")
	private int organizational_ChartFk;

	@Column(name="PasswordHash")
	private Object passwordHash;

	@Column(name="PhoneNumber")
	private Object phoneNumber;

	@Column(name="PhoneNumberConfirmed")
	private boolean phoneNumberConfirmed;

	private Object picture;

	@Column(name="RessourceId")
	private int ressourceId;

	@Column(name="Role")
	private Object role;

	@Column(name="Salary")
	private float salary;

	@Column(name="SecurityStamp")
	private Object securityStamp;

	@Column(name="Seniority")
	private Object seniority;

	@Column(name="SkiFk")
	private int skiFk;

	private int state_Type;

	@Column(name="TwoFactorEnabled")
	private boolean twoFactorEnabled;

	@Column(name="UserName")
	private Object userName;

	@Column(name="Work_profil")
	private Object work_profil;

	//bi-directional many-to-one association to AspNetUserClaim
	@OneToMany(mappedBy="aspNetUser")
	private List<AspNetUserClaim> aspNetUserClaims;

	//bi-directional many-to-one association to AspNetUserLogin
	@OneToMany(mappedBy="aspNetUser")
	private List<AspNetUserLogin> aspNetUserLogins;

	//bi-directional many-to-many association to AspNetRole
	@ManyToMany
	@JoinTable(
		name="AspNetUserRoles"
		, joinColumns={
			@JoinColumn(name="UserId")
			}
		, inverseJoinColumns={
			@JoinColumn(name="RoleId")
			}
		)
	private List<AspNetRole> aspNetRoles;

	//bi-directional many-to-one association to AspNetUser
	@ManyToOne
	@JoinColumn(name="MyAdminstrator_Id")
	private AspNetUser aspNetUser;

	//bi-directional many-to-one association to AspNetUser
	@OneToMany(mappedBy="aspNetUser")
	private List<AspNetUser> aspNetUsers;

	//bi-directional many-to-one association to Organizational_Chart
	@ManyToOne
	@JoinColumn(name="Organizational_Chart_ChartId")
	private Organizational_Chart organizationalChart;

	//bi-directional many-to-one association to DayOff
	@OneToMany(mappedBy="aspNetUser")
	private List<DayOff> dayOffs;

	//bi-directional many-to-one association to Holiday
	@OneToMany(mappedBy="aspNetUser")
	private List<Holiday> holidays;

	//bi-directional many-to-one association to Inboxe
	@OneToMany(mappedBy="aspNetUser")
	private List<Inboxe> inboxes;

	//bi-directional many-to-one association to Job_Request
	@OneToMany(mappedBy="aspNetUser")
	private List<Job_Request> jobRequests;

	//bi-directional many-to-one association to Mandate
	@OneToMany(mappedBy="aspNetUser")
	private List<Mandate> mandates;

	//bi-directional many-to-one association to Message
	@OneToMany(mappedBy="aspNetUser1")
	private List<Message> messages1;

	//bi-directional many-to-one association to Message
	@OneToMany(mappedBy="aspNetUser2")
	private List<Message> messages2;

	//bi-directional many-to-many association to Organizational_Chart
	@ManyToMany(mappedBy="aspNetUsers2")
	private List<Organizational_Chart> organizationalCharts;

	//bi-directional many-to-one association to Project
	@OneToMany(mappedBy="aspNetUser")
	private List<Project> projects;

	//bi-directional many-to-one association to Request
	@OneToMany(mappedBy="aspNetUser1")
	private List<Request> requests1;

	//bi-directional many-to-one association to Request
	@OneToMany(mappedBy="aspNetUser2")
	private List<Request> requests2;

	//bi-directional many-to-one association to Request
	@OneToMany(mappedBy="aspNetUser3")
	private List<Request> requests3;

	//bi-directional many-to-one association to Skill
	@OneToMany(mappedBy="aspNetUser")
	private List<Skill> skills;

	public AspNetUser() {
	}

	public String getId() {
		return this.id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public int getAccessFailedCount() {
		return this.accessFailedCount;
	}

	public void setAccessFailedCount(int accessFailedCount) {
		this.accessFailedCount = accessFailedCount;
	}

	public int getAdministratorId() {
		return this.administratorId;
	}

	public void setAdministratorId(int administratorId) {
		this.administratorId = administratorId;
	}

	public int getAvailibityType() {
		return this.availibityType;
	}

	public void setAvailibityType(int availibityType) {
		this.availibityType = availibityType;
	}

	public Object getBusiness_sector() {
		return this.business_sector;
	}

	public void setBusiness_sector(Object business_sector) {
		this.business_sector = business_sector;
	}

	public int getCandidatId() {
		return this.candidatId;
	}

	public void setCandidatId(int candidatId) {
		this.candidatId = candidatId;
	}

	public int getClient_Type() {
		return this.client_Type;
	}

	public void setClient_Type(int client_Type) {
		this.client_Type = client_Type;
	}

	public int getClientId() {
		return this.clientId;
	}

	public void setClientId(int clientId) {
		this.clientId = clientId;
	}

	public int getContract_Type() {
		return this.contract_Type;
	}

	public void setContract_Type(int contract_Type) {
		this.contract_Type = contract_Type;
	}

	public int getDaysoffFK() {
		return this.daysoffFK;
	}

	public void setDaysoffFK(int daysoffFK) {
		this.daysoffFK = daysoffFK;
	}

	public Object getDiscriminator() {
		return this.discriminator;
	}

	public void setDiscriminator(Object discriminator) {
		this.discriminator = discriminator;
	}

	public Object getEmail() {
		return this.email;
	}

	public void setEmail(Object email) {
		this.email = email;
	}

	public boolean getEmailConfirmed() {
		return this.emailConfirmed;
	}

	public void setEmailConfirmed(boolean emailConfirmed) {
		this.emailConfirmed = emailConfirmed;
	}

	public boolean getEtat() {
		return this.etat;
	}

	public void setEtat(boolean etat) {
		this.etat = etat;
	}

	public Object getEtatResource() {
		return this.etatResource;
	}

	public void setEtatResource(Object etatResource) {
		this.etatResource = etatResource;
	}

	public Object getFirst_name() {
		return this.first_name;
	}

	public void setFirst_name(Object first_name) {
		this.first_name = first_name;
	}

	public Object getFirstName() {
		return this.firstName;
	}

	public void setFirstName(Object firstName) {
		this.firstName = firstName;
	}

	public int getHolidayFk() {
		return this.holidayFk;
	}

	public void setHolidayFk(int holidayFk) {
		this.holidayFk = holidayFk;
	}

	public Object getJobType() {
		return this.jobType;
	}

	public void setJobType(Object jobType) {
		this.jobType = jobType;
	}

	public Object getLang() {
		return this.lang;
	}

	public void setLang(Object lang) {
		this.lang = lang;
	}

	public Object getLast_name() {
		return this.last_name;
	}

	public void setLast_name(Object last_name) {
		this.last_name = last_name;
	}

	public Object getLastName() {
		return this.lastName;
	}

	public void setLastName(Object lastName) {
		this.lastName = lastName;
	}

	public Object getLat() {
		return this.lat;
	}

	public void setLat(Object lat) {
		this.lat = lat;
	}

	public boolean getLockoutEnabled() {
		return this.lockoutEnabled;
	}

	public void setLockoutEnabled(boolean lockoutEnabled) {
		this.lockoutEnabled = lockoutEnabled;
	}

	public Timestamp getLockoutEndDateUtc() {
		return this.lockoutEndDateUtc;
	}

	public void setLockoutEndDateUtc(Timestamp lockoutEndDateUtc) {
		this.lockoutEndDateUtc = lockoutEndDateUtc;
	}

	public Object getLogo() {
		return this.logo;
	}

	public void setLogo(Object logo) {
		this.logo = logo;
	}

	public Object getNameClient() {
		return this.nameClient;
	}

	public void setNameClient(Object nameClient) {
		this.nameClient = nameClient;
	}

	public float getNote() {
		return this.note;
	}

	public void setNote(float note) {
		this.note = note;
	}

	public int getOrganizational_ChartFk() {
		return this.organizational_ChartFk;
	}

	public void setOrganizational_ChartFk(int organizational_ChartFk) {
		this.organizational_ChartFk = organizational_ChartFk;
	}

	public Object getPasswordHash() {
		return this.passwordHash;
	}

	public void setPasswordHash(Object passwordHash) {
		this.passwordHash = passwordHash;
	}

	public Object getPhoneNumber() {
		return this.phoneNumber;
	}

	public void setPhoneNumber(Object phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

	public boolean getPhoneNumberConfirmed() {
		return this.phoneNumberConfirmed;
	}

	public void setPhoneNumberConfirmed(boolean phoneNumberConfirmed) {
		this.phoneNumberConfirmed = phoneNumberConfirmed;
	}

	public Object getPicture() {
		return this.picture;
	}

	public void setPicture(Object picture) {
		this.picture = picture;
	}

	public int getRessourceId() {
		return this.ressourceId;
	}

	public void setRessourceId(int ressourceId) {
		this.ressourceId = ressourceId;
	}

	public Object getRole() {
		return this.role;
	}

	public void setRole(Object role) {
		this.role = role;
	}

	public float getSalary() {
		return this.salary;
	}

	public void setSalary(float salary) {
		this.salary = salary;
	}

	public Object getSecurityStamp() {
		return this.securityStamp;
	}

	public void setSecurityStamp(Object securityStamp) {
		this.securityStamp = securityStamp;
	}

	public Object getSeniority() {
		return this.seniority;
	}

	public void setSeniority(Object seniority) {
		this.seniority = seniority;
	}

	public int getSkiFk() {
		return this.skiFk;
	}

	public void setSkiFk(int skiFk) {
		this.skiFk = skiFk;
	}

	public int getState_Type() {
		return this.state_Type;
	}

	public void setState_Type(int state_Type) {
		this.state_Type = state_Type;
	}

	public boolean getTwoFactorEnabled() {
		return this.twoFactorEnabled;
	}

	public void setTwoFactorEnabled(boolean twoFactorEnabled) {
		this.twoFactorEnabled = twoFactorEnabled;
	}

	public Object getUserName() {
		return this.userName;
	}

	public void setUserName(Object userName) {
		this.userName = userName;
	}

	public Object getWork_profil() {
		return this.work_profil;
	}

	public void setWork_profil(Object work_profil) {
		this.work_profil = work_profil;
	}

	public List<AspNetUserClaim> getAspNetUserClaims() {
		return this.aspNetUserClaims;
	}

	public void setAspNetUserClaims(List<AspNetUserClaim> aspNetUserClaims) {
		this.aspNetUserClaims = aspNetUserClaims;
	}

	public AspNetUserClaim addAspNetUserClaim(AspNetUserClaim aspNetUserClaim) {
		getAspNetUserClaims().add(aspNetUserClaim);
		aspNetUserClaim.setAspNetUser(this);

		return aspNetUserClaim;
	}

	public AspNetUserClaim removeAspNetUserClaim(AspNetUserClaim aspNetUserClaim) {
		getAspNetUserClaims().remove(aspNetUserClaim);
		aspNetUserClaim.setAspNetUser(null);

		return aspNetUserClaim;
	}

	public List<AspNetUserLogin> getAspNetUserLogins() {
		return this.aspNetUserLogins;
	}

	public void setAspNetUserLogins(List<AspNetUserLogin> aspNetUserLogins) {
		this.aspNetUserLogins = aspNetUserLogins;
	}

	public AspNetUserLogin addAspNetUserLogin(AspNetUserLogin aspNetUserLogin) {
		getAspNetUserLogins().add(aspNetUserLogin);
		aspNetUserLogin.setAspNetUser(this);

		return aspNetUserLogin;
	}

	public AspNetUserLogin removeAspNetUserLogin(AspNetUserLogin aspNetUserLogin) {
		getAspNetUserLogins().remove(aspNetUserLogin);
		aspNetUserLogin.setAspNetUser(null);

		return aspNetUserLogin;
	}

	public List<AspNetRole> getAspNetRoles() {
		return this.aspNetRoles;
	}

	public void setAspNetRoles(List<AspNetRole> aspNetRoles) {
		this.aspNetRoles = aspNetRoles;
	}

	public AspNetUser getAspNetUser() {
		return this.aspNetUser;
	}

	public void setAspNetUser(AspNetUser aspNetUser) {
		this.aspNetUser = aspNetUser;
	}

	public List<AspNetUser> getAspNetUsers() {
		return this.aspNetUsers;
	}

	public void setAspNetUsers(List<AspNetUser> aspNetUsers) {
		this.aspNetUsers = aspNetUsers;
	}

	public AspNetUser addAspNetUser(AspNetUser aspNetUser) {
		getAspNetUsers().add(aspNetUser);
		aspNetUser.setAspNetUser(this);

		return aspNetUser;
	}

	public AspNetUser removeAspNetUser(AspNetUser aspNetUser) {
		getAspNetUsers().remove(aspNetUser);
		aspNetUser.setAspNetUser(null);

		return aspNetUser;
	}

	public Organizational_Chart getOrganizationalChart() {
		return this.organizationalChart;
	}

	public void setOrganizationalChart(Organizational_Chart organizationalChart) {
		this.organizationalChart = organizationalChart;
	}

	public List<DayOff> getDayOffs() {
		return this.dayOffs;
	}

	public void setDayOffs(List<DayOff> dayOffs) {
		this.dayOffs = dayOffs;
	}

	public DayOff addDayOff(DayOff dayOff) {
		getDayOffs().add(dayOff);
		dayOff.setAspNetUser(this);

		return dayOff;
	}

	public DayOff removeDayOff(DayOff dayOff) {
		getDayOffs().remove(dayOff);
		dayOff.setAspNetUser(null);

		return dayOff;
	}

	public List<Holiday> getHolidays() {
		return this.holidays;
	}

	public void setHolidays(List<Holiday> holidays) {
		this.holidays = holidays;
	}

	public Holiday addHoliday(Holiday holiday) {
		getHolidays().add(holiday);
		holiday.setAspNetUser(this);

		return holiday;
	}

	public Holiday removeHoliday(Holiday holiday) {
		getHolidays().remove(holiday);
		holiday.setAspNetUser(null);

		return holiday;
	}

	public List<Inboxe> getInboxes() {
		return this.inboxes;
	}

	public void setInboxes(List<Inboxe> inboxes) {
		this.inboxes = inboxes;
	}

	public Inboxe addInboxe(Inboxe inboxe) {
		getInboxes().add(inboxe);
		inboxe.setAspNetUser(this);

		return inboxe;
	}

	public Inboxe removeInboxe(Inboxe inboxe) {
		getInboxes().remove(inboxe);
		inboxe.setAspNetUser(null);

		return inboxe;
	}

	public List<Job_Request> getJobRequests() {
		return this.jobRequests;
	}

	public void setJobRequests(List<Job_Request> jobRequests) {
		this.jobRequests = jobRequests;
	}

	public Job_Request addJobRequest(Job_Request jobRequest) {
		getJobRequests().add(jobRequest);
		jobRequest.setAspNetUser(this);

		return jobRequest;
	}

	public Job_Request removeJobRequest(Job_Request jobRequest) {
		getJobRequests().remove(jobRequest);
		jobRequest.setAspNetUser(null);

		return jobRequest;
	}

	public List<Mandate> getMandates() {
		return this.mandates;
	}

	public void setMandates(List<Mandate> mandates) {
		this.mandates = mandates;
	}

	public Mandate addMandate(Mandate mandate) {
		getMandates().add(mandate);
		mandate.setAspNetUser(this);

		return mandate;
	}

	public Mandate removeMandate(Mandate mandate) {
		getMandates().remove(mandate);
		mandate.setAspNetUser(null);

		return mandate;
	}

	public List<Message> getMessages1() {
		return this.messages1;
	}

	public void setMessages1(List<Message> messages1) {
		this.messages1 = messages1;
	}

	public Message addMessages1(Message messages1) {
		getMessages1().add(messages1);
		messages1.setAspNetUser1(this);

		return messages1;
	}

	public Message removeMessages1(Message messages1) {
		getMessages1().remove(messages1);
		messages1.setAspNetUser1(null);

		return messages1;
	}

	public List<Message> getMessages2() {
		return this.messages2;
	}

	public void setMessages2(List<Message> messages2) {
		this.messages2 = messages2;
	}

	public Message addMessages2(Message messages2) {
		getMessages2().add(messages2);
		messages2.setAspNetUser2(this);

		return messages2;
	}

	public Message removeMessages2(Message messages2) {
		getMessages2().remove(messages2);
		messages2.setAspNetUser2(null);

		return messages2;
	}

	public List<Organizational_Chart> getOrganizationalCharts() {
		return this.organizationalCharts;
	}

	public void setOrganizationalCharts(List<Organizational_Chart> organizationalCharts) {
		this.organizationalCharts = organizationalCharts;
	}

	public List<Project> getProjects() {
		return this.projects;
	}

	public void setProjects(List<Project> projects) {
		this.projects = projects;
	}

	public Project addProject(Project project) {
		getProjects().add(project);
		project.setAspNetUser(this);

		return project;
	}

	public Project removeProject(Project project) {
		getProjects().remove(project);
		project.setAspNetUser(null);

		return project;
	}

	public List<Request> getRequests1() {
		return this.requests1;
	}

	public void setRequests1(List<Request> requests1) {
		this.requests1 = requests1;
	}

	public Request addRequests1(Request requests1) {
		getRequests1().add(requests1);
		requests1.setAspNetUser1(this);

		return requests1;
	}

	public Request removeRequests1(Request requests1) {
		getRequests1().remove(requests1);
		requests1.setAspNetUser1(null);

		return requests1;
	}

	public List<Request> getRequests2() {
		return this.requests2;
	}

	public void setRequests2(List<Request> requests2) {
		this.requests2 = requests2;
	}

	public Request addRequests2(Request requests2) {
		getRequests2().add(requests2);
		requests2.setAspNetUser2(this);

		return requests2;
	}

	public Request removeRequests2(Request requests2) {
		getRequests2().remove(requests2);
		requests2.setAspNetUser2(null);

		return requests2;
	}

	public List<Request> getRequests3() {
		return this.requests3;
	}

	public void setRequests3(List<Request> requests3) {
		this.requests3 = requests3;
	}

	public Request addRequests3(Request requests3) {
		getRequests3().add(requests3);
		requests3.setAspNetUser3(this);

		return requests3;
	}

	public Request removeRequests3(Request requests3) {
		getRequests3().remove(requests3);
		requests3.setAspNetUser3(null);

		return requests3;
	}

	public List<Skill> getSkills() {
		return this.skills;
	}

	public void setSkills(List<Skill> skills) {
		this.skills = skills;
	}

	public Skill addSkill(Skill skill) {
		getSkills().add(skill);
		skill.setAspNetUser(this);

		return skill;
	}

	public Skill removeSkill(Skill skill) {
		getSkills().remove(skill);
		skill.setAspNetUser(null);

		return skill;
	}

}