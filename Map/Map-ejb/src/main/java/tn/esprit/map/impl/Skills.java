package tn.esprit.map.impl;

import java.util.List;

import javax.ejb.LocalBean;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import org.omg.PortableServer.ImplicitActivationPolicyOperations;

import tn.esprit.map.interfaces.SkillsLocal;
import tn.esprit.map.interfaces.SkillsRemote;
import tn.esprit.map.entities.Skill;

/**
 * Session Bean implementation class Skills
 */
@Stateless
@LocalBean
public class Skills implements SkillsRemote, SkillsLocal {

    /**
     * Default constructor. 
     */
	@PersistenceContext
	EntityManager em;
    public Skills() {
        // TODO Auto-
    	
    }

	@Override
	public List<Skill> getAllSkill(){
		Query query = em.createQuery("select s from Skill s" ,Skill.class);
		
		return query.getResultList();
	}
	
	
		

}
