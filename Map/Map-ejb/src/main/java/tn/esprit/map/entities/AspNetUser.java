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
		
		

	public AspNetUser(String id, Integer accessFailedCount, Integer administratorId, Integer availibityType,
				String business_sector, Integer candidatId, Integer client_Type, Integer clientId,
				Integer contract_Type, Integer daysoffFK, String discriminator, String email, Boolean emailConfirmed,
				Boolean etat, String etatResource, String first_name, String firstName, Integer holidayFk,
				String jobType, String lang, String last_name, String lastName, String lat, Boolean lockoutEnabled,
				Timestamp lockoutEndDateUtc, String logo, String nameClient, Float note, Integer organizational_ChartFk,
				String passwordHash, String phoneNumber, Boolean phoneNumberConfirmed, String picture,
				Integer ressourceId, String role, Float salary, String securityStamp, String seniority, Integer skiFk,
				Integer state_Type, Boolean twoFactorEnabled, String userName, String work_profil,
				List<AspNetUserClaim> aspNetUserClaims, List<AspNetUserLogin> aspNetUserLogins,
				List<AspNetRole> aspNetRoles, AspNetUser aspNetUser, List<AspNetUser> aspNetUsers,
				Organizational_Chart organizationalChart, List<DayOff> dayOffs, List<Holiday> holidays,
				List<Inboxe> inboxes, List<Job_Request> jobRequests, List<Mandate> mandates, List<Message> messages1,
				List<Message> messages2, List<Organizational_Chart> organizationalCharts, List<Project> projects,
				List<Request> requests1, List<Request> requests2, List<Request> requests3, List<Skill> skills) {
			super();
			this.id = id;
			this.accessFailedCount = accessFailedCount;
			this.administratorId = administratorId;
			this.availibityType = availibityType;
			this.business_sector = business_sector;
			this.candidatId = candidatId;
			this.client_Type = client_Type;
			this.clientId = clientId;
			this.contract_Type = contract_Type;
			this.daysoffFK = daysoffFK;
			this.discriminator = discriminator;
			this.email = email;
			this.emailConfirmed = emailConfirmed;
			this.etat = etat;
			this.etatResource = etatResource;
			this.first_name = first_name;
			this.firstName = firstName;
			this.holidayFk = holidayFk;
			this.jobType = jobType;
			this.lang = lang;
			this.last_name = last_name;
			this.lastName = lastName;
			this.lat = lat;
			this.lockoutEnabled = lockoutEnabled;
			this.lockoutEndDateUtc = lockoutEndDateUtc;
			this.logo = logo;
			this.nameClient = nameClient;
			this.note = note;
			this.organizational_ChartFk = organizational_ChartFk;
			this.passwordHash = passwordHash;
			this.phoneNumber = phoneNumber;
			this.phoneNumberConfirmed = phoneNumberConfirmed;
			this.picture = picture;
			this.ressourceId = ressourceId;
			this.role = role;
			this.salary = salary;
			this.securityStamp = securityStamp;
			this.seniority = seniority;
			this.skiFk = skiFk;
			this.state_Type = state_Type;
			this.twoFactorEnabled = twoFactorEnabled;
			this.userName = userName;
			this.work_profil = work_profil;
			this.aspNetUserClaims = aspNetUserClaims;
			this.aspNetUserLogins = aspNetUserLogins;
			this.aspNetRoles = aspNetRoles;
			this.aspNetUser = aspNetUser;
			this.aspNetUsers = aspNetUsers;
			this.organizationalChart = organizationalChart;
			this.dayOffs = dayOffs;
			this.holidays = holidays;
			this.inboxes = inboxes;
			this.jobRequests = jobRequests;
			this.mandates = mandates;
			this.messages1 = messages1;
			this.messages2 = messages2;
			this.organizationalCharts = organizationalCharts;
			this.projects = projects;
			this.requests1 = requests1;
			this.requests2 = requests2;
			this.requests3 = requests3;
			this.skills = skills;
		}

	public AspNetUser(String email) {
			super();
			this.email = email;
		}

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="Id")
	private String   id;

	@Column(name="AccessFailedCount")
	private Integer  accessFailedCount;

	@Column(name="AdministratorId")
	private Integer  administratorId;

	@Column(name="availibity_type")
	private Integer  availibityType;

	@Column(name="Business_sector")
	private String   business_sector;

	@Column(name="CandidatId")
	private Integer candidatId;

	@Column(name="client_Type")
	private Integer client_Type;

	@Column(name="ClientId")
	private Integer clientId;

	@Column(name="contract_Type")
	private Integer contract_Type;

	@Column(name="DaysoffFK")
	private Integer  daysoffFK;

	@Column(name="Discriminator")
	private String   discriminator;

	@Column(name="Email")
	private String   email;

	@Column(name="EmailConfirmed")
	private Boolean emailConfirmed;
	
	@Column(name="etat")
	private Boolean etat;

	@Column(name="EtatResource")
	private String   etatResource;

	@Column(name="First_name")
	private String   first_name;

	@Column(name="FirstName")
	private String   firstName;

	@Column(name="HolidayFk")
	private Integer  holidayFk;

	@Column(name="JobType")
	private String   jobType;

	private String   lang;

	@Column(name="Last_name")
	private String   last_name;

	@Column(name="LastName")
	private String   lastName;

	private String   lat;

	@Column(name="LockoutEnabled")
	private Boolean lockoutEnabled;

	@Column(name="LockoutEndDateUtc")
	private Timestamp lockoutEndDateUtc;

	private String   logo;

	private String   nameClient;

	@Column(name="Note")
	private Float note;

	@Column(name="Organizational_ChartFk")
	private Integer  organizational_ChartFk;

	@Column(name="PasswordHash")
	private String   passwordHash;

	@Column(name="PhoneNumber")
	private String   phoneNumber;

	@Column(name="PhoneNumberConfirmed")
	private Boolean phoneNumberConfirmed;

	private String   picture;

	@Column(name="RessourceId")
	private Integer  ressourceId;

	@Column(name="Role")
	private String   role;

	@Column(name="Salary")
	private Float salary;

	@Column(name="SecurityStamp")
	private String   securityStamp;

	@Column(name="Seniority")
	private String   seniority;

	@Column(name="SkiFk")
	private Integer  skiFk;

	@Column(name="state_Type")
	private Integer  state_Type;

	@Column(name="TwoFactorEnabled")
	private Boolean twoFactorEnabled;

	@Column(name="UserName")
	
	private String   userName;

	@Column(name="Work_profil")
	private String   work_profil;

	//bi-directional many-to-one association to AspNetUserClaim
	@OneToMany(mappedBy="aspNetUser" , fetch=FetchType.EAGER)
	private List<AspNetUserClaim> aspNetUserClaims;

	//bi-directional many-to-one association to AspNetUserLogin
	@OneToMany(mappedBy="aspNetUser" , fetch=FetchType.EAGER)
	private List<AspNetUserLogin> aspNetUserLogins;

	//bi-directional many-to-many association to AspNetRole
	@ManyToMany( fetch=FetchType.EAGER)
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
	@OneToMany(mappedBy="aspNetUser", fetch=FetchType.EAGER)
	private List<AspNetUser> aspNetUsers;

	//bi-directional many-to-one association to Organizational_Chart
	@ManyToOne
	@JoinColumn(name="Organizational_Chart_ChartId")
	private Organizational_Chart organizationalChart;

	//bi-directional many-to-one association to DayOff
	@OneToMany(mappedBy="aspNetUser" , fetch=FetchType.EAGER)
	private List<DayOff> dayOffs;

	//bi-directional many-to-one association to Holiday
	@OneToMany(mappedBy="aspNetUser" , fetch=FetchType.EAGER)
	private List<Holiday> holidays;

	//bi-directional many-to-one association to Inboxe
	@OneToMany(mappedBy="aspNetUser", fetch=FetchType.EAGER)
	private List<Inboxe> inboxes;

	//bi-directional many-to-one association to Job_Request
	@OneToMany(mappedBy="aspNetUser" , fetch=FetchType.EAGER)
	private List<Job_Request> jobRequests;

	//bi-directional many-to-one association to Mandate
	@OneToMany(mappedBy="aspNetUser", fetch=FetchType.EAGER)
	private List<Mandate> mandates;

	//bi-directional many-to-one association to Message
	@OneToMany(mappedBy="aspNetUser1", fetch=FetchType.EAGER)
	private List<Message> messages1;

	//bi-directional many-to-one association to Message
	@OneToMany(mappedBy="aspNetUser2", fetch=FetchType.EAGER)
	private List<Message> messages2;

	//bi-directional many-to-many association to Organizational_Chart
	@ManyToMany(mappedBy="aspNetUsers2", fetch=FetchType.EAGER)
	private List<Organizational_Chart> organizationalCharts;

	//bi-directional many-to-one association to Project
	@OneToMany(mappedBy="aspNetUser", fetch=FetchType.EAGER)
	private List<Project> projects;

	//bi-directional many-to-one association to Request
	@OneToMany(mappedBy="aspNetUser1", fetch=FetchType.EAGER)
	private List<Request> requests1;

	//bi-directional many-to-one association to Request
	@OneToMany(mappedBy="aspNetUser2", fetch=FetchType.EAGER)
	private List<Request> requests2;

	//bi-directional many-to-one association to Request
	@OneToMany(mappedBy="aspNetUser3", fetch=FetchType.EAGER)
	private List<Request> requests3;

	//bi-directional many-to-one association to Skill
	@OneToMany(mappedBy="aspNetUser", fetch=FetchType.EAGER)
	private List<Skill> skills;

	public AspNetUser() {
	}

	public String   getId() {
		return this.id;
	}

	public void setId(String   id) {
		this.id = id;
	}

	public Integer  getAccessFailedCount() {
		return this.accessFailedCount;
	}

	public void setAccessFailedCount(Integer  accessFailedCount) {
		this.accessFailedCount = accessFailedCount;
	}

	public Integer  getAdministratorId() {
		return this.administratorId;
	}

	public void setAdministratorId(Integer  administratorId) {
		this.administratorId = administratorId;
	}

	public Integer  getAvailibityType() {
		return this.availibityType;
	}

	public void setAvailibityType(Integer  availibityType) {
		this.availibityType = availibityType;
	}

	public String   getBusiness_sector() {
		return this.business_sector;
	}

	public void setBusiness_sector(String   business_sector) {
		this.business_sector = business_sector;
	}

	public Integer  getCandidatId() {
		return this.candidatId;
	}

	public void setCandidatId(Integer  candidatId) {
		this.candidatId = candidatId;
	}

	public Integer  getClient_Type() {
		return this.client_Type;
	}

	public void setClient_Type(Integer  client_Type) {
		this.client_Type = client_Type;
	}

	public Integer  getClientId() {
		return this.clientId;
	}

	public void setClientId(Integer  clientId) {
		this.clientId = clientId;
	}

	public Integer  getContract_Type() {
		return this.contract_Type;
	}

	public void setContract_Type(Integer  contract_Type) {
		this.contract_Type = contract_Type;
	}

	public Integer  getDaysoffFK() {
		return this.daysoffFK;
	}

	public void setDaysoffFK(Integer  daysoffFK) {
		this.daysoffFK = daysoffFK;
	}

	public String   getDiscriminator() {
		return this.discriminator;
	}

	public void setDiscriminator(String   discriminator) {
		this.discriminator = discriminator;
	}

	public String   getEmail() {
		return this.email;
	}

	public void setEmail(String   email) {
		this.email = email;
	}

	public Boolean getEmailConfirmed() {
		return this.emailConfirmed;
	}

	public void setEmailConfirmed(Boolean emailConfirmed) {
		this.emailConfirmed = emailConfirmed;
	}

	public Boolean getEtat() {
		return this.etat;
	}

	public void setEtat(Boolean etat) {
		this.etat = etat;
	}

	public String   getEtatResource() {
		return this.etatResource;
	}

	public void setEtatResource(String   etatResource) {
		this.etatResource = etatResource;
	}

	public String   getFirst_name() {
		return this.first_name;
	}

	public void setFirst_name(String   first_name) {
		this.first_name = first_name;
	}

	public String   getFirstName() {
		return this.firstName;
	}

	public void setFirstName(String   firstName) {
		this.firstName = firstName;
	}

	public Integer  getHolidayFk() {
		return this.holidayFk;
	}

	public void setHolidayFk(Integer  holidayFk) {
		this.holidayFk = holidayFk;
	}

	public String   getJobType() {
		return this.jobType;
	}

	public void setJobType(String   jobType) {
		this.jobType = jobType;
	}

	public String   getLang() {
		return this.lang;
	}

	public void setLang(String   lang) {
		this.lang = lang;
	}

	public String   getLast_name() {
		return this.last_name;
	}

	public void setLast_name(String   last_name) {
		this.last_name = last_name;
	}

	public String   getLastName() {
		return this.lastName;
	}

	public void setLastName(String   lastName) {
		this.lastName = lastName;
	}

	public String   getLat() {
		return this.lat;
	}

	public void setLat(String   lat) {
		this.lat = lat;
	}

	public Boolean getLockoutEnabled() {
		return this.lockoutEnabled;
	}

	public void setLockoutEnabled(Boolean lockoutEnabled) {
		this.lockoutEnabled = lockoutEnabled;
	}

	public Timestamp getLockoutEndDateUtc() {
		return this.lockoutEndDateUtc;
	}

	public void setLockoutEndDateUtc(Timestamp lockoutEndDateUtc) {
		this.lockoutEndDateUtc = lockoutEndDateUtc;
	}

	public String   getLogo() {
		return this.logo;
	}

	public void setLogo(String   logo) {
		this.logo = logo;
	}

	public String   getNameClient() {
		return this.nameClient;
	}

	public void setNameClient(String   nameClient) {
		this.nameClient = nameClient;
	}

	public Float getNote() {
		return this.note;
	}

	public void setNote(Float note) {
		this.note = note;
	}

	public Integer  getOrganizational_ChartFk() {
		return this.organizational_ChartFk;
	}

	public void setOrganizational_ChartFk(Integer  organizational_ChartFk) {
		this.organizational_ChartFk = organizational_ChartFk;
	}

	public String   getPasswordHash() {
		return this.passwordHash;
	}

	public void setPasswordHash(String   passwordHash) {
		this.passwordHash = passwordHash;
	}

	public String   getPhoneNumber() {
		return this.phoneNumber;
	}

	public void setPhoneNumber(String   phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

	public Boolean getPhoneNumberConfirmed() {
		return this.phoneNumberConfirmed;
	}

	public void setPhoneNumberConfirmed(Boolean phoneNumberConfirmed) {
		this.phoneNumberConfirmed = phoneNumberConfirmed;
	}

	public String   getPicture() {
		return this.picture;
	}

	public void setPicture(String   picture) {
		this.picture = picture;
	}

	public Integer  getRessourceId() {
		return this.ressourceId;
	}

	public void setRessourceId(Integer  ressourceId) {
		this.ressourceId = ressourceId;
	}

	public String   getRole() {
		return this.role;
	}

	public void setRole(String   role) {
		this.role = role;
	}

	public Float getSalary() {
		return this.salary;
	}

	public void setSalary(Float salary) {
		this.salary = salary;
	}

	public String   getSecurityStamp() {
		return this.securityStamp;
	}

	public void setSecurityStamp(String   securityStamp) {
		this.securityStamp = securityStamp;
	}

	public String   getSeniority() {
		return this.seniority;
	}

	public void setSeniority(String   seniority) {
		this.seniority = seniority;
	}

	public Integer  getSkiFk() {
		return this.skiFk;
	}

	public void setSkiFk(Integer  skiFk) {
		this.skiFk = skiFk;
	}

	public Integer  getState_Type() {
		return this.state_Type;
	}

	public void setState_Type(Integer  state_Type) {
		this.state_Type = state_Type;
	}

	public Boolean getTwoFactorEnabled() {
		return this.twoFactorEnabled;
	}

	public void setTwoFactorEnabled(Boolean twoFactorEnabled) {
		this.twoFactorEnabled = twoFactorEnabled;
	}

	public String   getUserName() {
		return this.userName;
	}

	public void setUserName(String   userName) {
		this.userName = userName;
	}

	public String   getWork_profil() {
		return this.work_profil;
	}

	public void setWork_profil(String   work_profil) {
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