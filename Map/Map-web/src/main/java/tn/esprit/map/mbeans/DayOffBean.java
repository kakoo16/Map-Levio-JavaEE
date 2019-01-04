package tn.esprit.map.mbeans;

import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

import javax.annotation.PostConstruct;
import javax.ejb.EJB;
import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.context.FacesContext;
import javax.mail.MessagingException;

import org.primefaces.context.RequestContext;
import org.primefaces.event.SelectEvent;

import tn.esprit.map.impl.Dayoff;
import tn.esprit.map.interfaces.DayoffLocal;
import tn.esprit.map.entities.DayOff;
import tn.esprit.map.entities.Skill;

@ManagedBean

public class DayOffBean {
	@EJB
	private DayoffLocal dayoff;
	 Dayoff doo;
	private DayOff d = new DayOff();
	private List<DayOff> LDayOff;
	private int tobeupdated;
	public int getTobeupdated() {
		return tobeupdated;
	}

	public void setTobeupdated(int tobeupdated) {
		this.tobeupdated = tobeupdated;
	}

	public List<DayOff> getLDayOff() {
		return LDayOff;
	}

	public void setLDayOff(List<DayOff> lDayOff) {
		LDayOff = lDayOff;
	}

	String navigateTo = "";

	public String doAddDayoff() throws IOException, MessagingException {

		/*
		 * d.setStart_Date(new java.util.Date()); d.setEnd_Date(new
		 * java.util.Date());
		 */
		dayoff.ajouterDayoff(d);

		navigateTo = "";

		return navigateTo;
	}

	public void DoRemove(DayOff d) {
		dayoff.supprimerDayoff(d);
	}

	@PostConstruct
	public void init() {

		LDayOff = dayoff.getAllDayoff();
	}

	private Date date = new Date();

	public Date getDate() {
		return date;
	}

	public void setDate(Date date) {
		this.date = date;
	}

	public DayoffLocal getDayoff() {
		return dayoff;
	}

	public void setDayoff(DayoffLocal dayoff) {
		this.dayoff = dayoff;
	}

	public DayOff getD() {
		return d;
	}

	public void setD(DayOff d) {
		this.d = d;
	}
	public void modifier(DayOff dayoff) {
		this.setTobeupdated(dayoff.getDayoffId());
		this.d.setStart_Date(dayoff.getStart_Date());
		this.d.setEnd_Date(dayoff.getEnd_Date());
		this.d.setRaison(dayoff.getRaison());
			}
	
	
	public void mettreajour(){
		doo.editDayoff(new DayOff(tobeupdated, d.getStart_Date(),d.getEnd_Date(), d.getRaison()));
		
	}

}
