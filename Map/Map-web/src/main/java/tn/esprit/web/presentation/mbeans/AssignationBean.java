package tn.esprit.web.presentation.mbeans;

import java.util.List;

import javax.annotation.PostConstruct;
import javax.ejb.EJB;
import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.context.FacesContext;

import tn.esprit.map.entities.Holiday;
import tn.esprit.map.services.AssignationService;

@ManagedBean
public class AssignationBean {

	private int holidayId;
	
	private int tobeUpdate ; 
	
	public int getTobeUpdate() {
		return tobeUpdate;
	}

	public void setTobeUpdate(int tobeUpdate) {
		this.tobeUpdate = tobeUpdate;
	}
	private String description;
	
	private java.util.Date end_Date;
	
	private java.util.Date stard_Date;
	
	private List<Holiday> Holidays;
	

	public int getHolidayId() {
		return holidayId;
	}

	public void setHolidayId(int holidayId) {
		this.holidayId = holidayId;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public java.util.Date getEnd_Date() {
		return end_Date;
	}

	public void setEnd_Date(java.util.Date end_Date) {
		this.end_Date = end_Date;
	}

	public java.util.Date getStard_Date() {
		return stard_Date;
	}

	public void setStard_Date(java.util.Date stard_Date) {
		this.stard_Date = stard_Date;
	}
	
	
	public List<Holiday> getHolidays() {
		return Holidays;
	}

	public void setHolidays(List<Holiday> holidays) {
		Holidays = holidays;
	}
	@EJB
	AssignationService as ; 
	
	@PostConstruct
	public void init() {
		
	Holidays =  as.AffichageHoliday() ; 
	
	
	}
	
	
	
	public void  addAssign(){

		FacesContext.getCurrentInstance().addMessage(null,
				new FacesMessage("Cette Assignation est ajouté avec succes."));
	as.ajouterAssignation(new Holiday(description ,end_Date , stard_Date ));	
	
	}
	
	
	public void supprimer(int ReclamationId) {
		FacesContext.getCurrentInstance().addMessage(null,
				new FacesMessage("Cette Assignation est supprimer avec succes."));
		as.DeleteAssignationById(ReclamationId) ; 
		
	}
	
	
	public void modifier(Holiday id) {
		this.setTobeUpdate(id.getHolidayId());
		this.setDescription(id.getDescription());
		this.setEnd_Date(id.getEnd_Date());
		this.setStard_Date(id.getStard_Date());
	}
	
	
	public void mettreajour(){
		as.ModifierAssignationById(new Holiday(description , end_Date , stard_Date, tobeUpdate ));
		
	}

	
	
}
