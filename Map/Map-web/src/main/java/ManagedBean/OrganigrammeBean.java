package ManagedBean;


import java.util.List;

import javax.ejb.EJB;
import javax.faces.bean.ApplicationScoped;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

import Services.OrgranigrammeService;
import tn.esprit.map.entities.Organizational_Chart;
@SessionScoped
@ManagedBean
public class OrganigrammeBean {
	
	private int chartId;
	private String directionnal_level;
	private String program_Name;
	private String project_responsable;
	private String client_Name;	
	private String manager_account;
	private String name_assignment_manager_client;
	private List<Organizational_Chart> org;
	private int tobeupdated;
	public int getTobeupdated() {
		return tobeupdated;
	}
	public void setTobeupdated(int tobeupdated) {
		this.tobeupdated = tobeupdated;
	}






	@EJB
	OrgranigrammeService OrganigrammeService;
	
	public List<Organizational_Chart> getorganigrammes(){
		org=OrganigrammeService.getAllorganigrammes();
		return org;	
	}
	public OrgranigrammeService getOrganigrammeService() {
		return OrganigrammeService;
	}
	public void setOrganigrammeService(OrgranigrammeService organigrammeService) {
		OrganigrammeService = organigrammeService;
	}
	public void supprimer (int id){
		OrganigrammeService.DeleteById(id);
	}
	
	public List<Organizational_Chart> getOrg() {
		return org;
	}
	public void setOrg(List<Organizational_Chart> org) {
		this.org = org;
	}
	public int getChartId() {
		return chartId;
	}
	public void setChartId(int chartId) {
		this.chartId = chartId;
	}
	public String getDirectionnal_level() {
		return directionnal_level;
	}
	public void setDirectionnal_level(String directionnal_level) {
		this.directionnal_level = directionnal_level;
	}
	public String getProgram_Name() {
		return program_Name;
	}
	public void setProgram_Name(String program_Name) {
		this.program_Name = program_Name;
	}
	
	public String getClient_Name() {
		return client_Name;
	}
	public void setClient_Name(String client_Name) {
		this.client_Name = client_Name;
	}
	
	
	
	
	



	
	public String getProject_responsable() {
		return project_responsable;
	}
	public void setProject_responsable(String project_responsable) {
		this.project_responsable = project_responsable;
	}
	public String getManager_account() {
		return manager_account;
	}
	public void setManager_account(String manager_account) {
		this.manager_account = manager_account;
	}
	public String getName_assignment_manager_client() {
		return name_assignment_manager_client;
	}
	public void setName_assignment_manager_client(String name_assignment_manager_client) {
		this.name_assignment_manager_client = name_assignment_manager_client;
	}




	public void modifier(Organizational_Chart organirammme) {
		this.setTobeupdated(organirammme.getChartId());
		this.setClient_Name(organirammme.getClient_Name());
		this.setDirectionnal_level(organirammme.getDirectionnalLevel());
		this.setManager_account(organirammme.getManagerAccount());
		this.setName_assignment_manager_client(organirammme.getNameAssignmentManagerClient());
		this.setProgram_Name(organirammme.getProgram_Name());
		this.setProject_responsable(organirammme.getProjectResponsable());
	}
	
	
	public void mettreajour(){
		OrganigrammeService.update(new Organizational_Chart(directionnal_level, program_Name, project_responsable, client_Name, manager_account, name_assignment_manager_client,tobeupdated));
		
	}
	public void sms(){
		OrganigrammeService.sendSms();
	}




	
	
	public void addorganigramme(){
		
		OrganigrammeService.addorganigramme(directionnal_level, program_Name, project_responsable, client_Name, manager_account, name_assignment_manager_client);
	OrganigrammeService.sendSms();
	System.out.println("okkkkkkkk");
	}
	
	
	
	
	
}
