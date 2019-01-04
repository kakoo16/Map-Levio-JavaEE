package tn.esprit.map.mbeans;

import java.util.List;

import javax.annotation.PostConstruct;
import javax.ejb.EJB;
import javax.faces.bean.ManagedBean;
import tn.esprit.map.impl.*;
import tn.esprit.map.entities.*;

@ManagedBean
public class SkillBean {
  
	@EJB
	private Skills Skills;
	private List<Skill> LSkill;
	private String text1;   
    private String text2;
 
    public String getText1() {
        return text1;
    }
 
    public void setText1(String text1) {
        this.text1 = text1;
    }
 
    public String getText2() {
        return text2;
    }
 
    public void setText2(String text2) {
        this.text2 = text2;
    }
	public Skills getSkills() {
		return Skills;
	}
	public void setSkills(Skills skills) {
		Skills = skills;
	}
	public List<Skill> getLSkill() {
		return LSkill;
	}
	public void setLSkill(List<Skill> lSkill) {
		LSkill = lSkill;
	}
	@PostConstruct
	public void init() {
		
		LSkill = Skills.getAllSkill() ; 
		}
	

}
