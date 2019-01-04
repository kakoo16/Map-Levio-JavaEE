package tn.esprit.map.impl;

import java.util.Date;
import java.util.List;

import javax.ejb.LocalBean;
import javax.ejb.Stateless;
import javax.mail.MessagingException;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

import tn.esprit.map.interfaces.DayoffLocal;
import tn.esprit.map.interfaces.DayoffRemote;
import tn.esprit.map.entities.DayOff;
import tn.esprit.map.entities.Skill;

/**
 * Session Bean implementation class Dayoff
 */
@Stateless
@LocalBean
public class Dayoff implements DayoffRemote, DayoffLocal {

    /**
     * Default constructor. 
     */
	@PersistenceContext
	EntityManager em;
	Mail_API sm;
	
    public Dayoff() {
        // TODO Auto-generated constructor stub
    }
    
   

	@Override
    public void ajouterDayoff(DayOff d) throws MessagingException
    {
    	//d.setStart_Date(new java.util.Date());
    	//d.setEnd_Date(new java.util.Date());
    	em.persist(d);
    	Mail_API.sendMail("leviolevio2019@gmail.com", "A Holiday has been added", "A resource has added a Holiday please check the Holiday lists");
    	
    }
    
    public void supprimerDayoff(DayOff d)
    {
    	em.remove(em.contains(d) ? d : em.merge(d));
    }
    
    @Override
	public List<DayOff> getAllDayoff()
    {
		Query query = em.createQuery("select d from DayOff d" ,DayOff.class);
		
		return query.getResultList();
	}
@Override
public void editDayoff(DayOff d)
{
	em.merge(d);
}

}
