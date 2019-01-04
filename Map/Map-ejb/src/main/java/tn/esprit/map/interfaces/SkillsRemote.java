package tn.esprit.map.interfaces;

import java.util.List;

import javax.ejb.Remote;

import tn.esprit.map.entities.Skill;

@Remote
public interface SkillsRemote {
	public List<Skill> getAllSkill();
	
}
