package ManagedBean;

import java.util.Date;
import java.util.List;

import javax.annotation.PostConstruct;
import javax.ejb.EJB;
import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.context.FacesContext;

import tn.esprit.map.entities.AspNetUser;
import tn.esprit.map.entities.Mandate;
import tn.esprit.map.entities.Project;
import Services.MandateService;

@ManagedBean
public class MandateBean {
     
	private int ProjectId ;  
	private double fees ;  
	private String Id ; 
	private Date start_date ; 
	private Date end_date ;
	private List<Project> projets;
	private List<AspNetUser> ressources;
	private List<Mandate> mandates;


	public List<Mandate> getMandates() {
		return mandates;
	}
	public void setMandates(List<Mandate> mandates) {
		this.mandates = mandates;
	}
	
	
	public List<AspNetUser> getRessources() {
		return ressources;
	}
	public void setRessources(List<AspNetUser> ressources) {
		this.ressources = ressources;
	}
	public List<Project> getProjets() {
		return projets;
	}
	public void setProjets(List<Project> projets) {
		this.projets = projets;
	}
	public int getProjectId() {
		return ProjectId;
	}
	public void setProjectId(int projectId) {
		ProjectId = projectId;
	}
	public double getFees() {
		return fees;
	}
	public void setFees(double fees) {
		this.fees = fees;
	}
	public String getId() {
		return Id;
	}
	public void setId(String id) {
		Id = id;
	}
	public Date getStart_date() {
		return start_date;
	}
	public void setStart_date(Date start_date) {
		this.start_date = start_date;
	}
	public Date getEnd_date() {
		return end_date;
	}
	public void setEnd_date(Date end_date) {
		this.end_date = end_date;
	} 
	
	
	
	
	
	@EJB
	MandateService ms ; 
	   
	@PostConstruct
	public void init() {
		mandates = ms.findAll(); 
		projets=ms.getProjets() ;
		ressources = ms.getRessources() ; 
		}
	
	
	
	public void  addMandate(){
		FacesContext.getCurrentInstance().addMessage(null,
				new FacesMessage("Ce mandat est ajouté avec succes."));
		ms.ajouterEmployee(ProjectId,Id , start_date, end_date);
		
	}

	
	
	
	
	
	
	
	
	
}
