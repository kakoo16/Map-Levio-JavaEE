package tn.esprit.map.interfaces;

import java.util.List;

import javax.ejb.Local;

import tn.esprit.map.entities.Skill;

@Local
public interface SkillsLocal {
	public List<Skill> getAllSkill();
	}
