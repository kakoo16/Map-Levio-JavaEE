package tn.esprit.map.services;

import java.util.List;

import javax.ejb.Remote;

import tn.esprit.map.entities.Holiday;



@Remote
public interface AssignationServiceRemote {
	public int ajouterMandat(Holiday m)  ;
	public void  ajouterAssignation(Holiday m);
	public List<Holiday> AffichageHoliday()  ; 
	public void DeleteAssignationById(int AssignationId) ; 
	public void ModifierAssignationById(Holiday AssignationId)  ; 
}
