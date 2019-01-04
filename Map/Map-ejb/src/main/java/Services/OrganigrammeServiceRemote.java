package Services;

import java.util.List;

import javax.ejb.Remote;

import tn.esprit.map.entities.Organizational_Chart;


@Remote
public interface OrganigrammeServiceRemote {
	
	
	public void ajouterEmploye(Organizational_Chart o);
	public void addorganigramme(String directionnal_level,String program_Name,String project_responsable,String client_Name,String manager_account,String name_assignment_manager_client);
	
	public List<Organizational_Chart> getAllorganigrammes() ;
	public void DeleteById(int id);
	public void update(Organizational_Chart o);
}
