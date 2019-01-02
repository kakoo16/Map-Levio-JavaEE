package tn.esprit.map.services;

import java.util.Date;
import java.util.List;
import javax.ejb.Timer;
import javax.ejb.Remote;

import tn.esprit.map.entities.AspNetUser;
import tn.esprit.map.entities.Mandate;
import tn.esprit.map.entities.Project;


@Remote
public interface MandateServiceRemote {

	public void ajouterEmployee(int ProjectId   ,String Id  , Date start_date , Date end_date) ; 
	public int ajouterMandat(Mandate m);
	public List<Mandate> AffichageMandat() ; 
	public List<Project> getProjets();
	public List<AspNetUser> getRessources();
	public List<Mandate> findAll()  ; 
	public void NotifyCandidate(String id)  ; 
	public String getDate() ;
	public String convertDate(Date date) ; 
	public void AlertEndMandate(Timer timer) ;
	
	
}
