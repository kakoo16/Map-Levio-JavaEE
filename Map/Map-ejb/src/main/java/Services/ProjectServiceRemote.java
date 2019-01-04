package Services;

import java.util.List;

import javax.ejb.Remote;

import tn.esprit.map.entities.Organizational_Chart;
import tn.esprit.map.entities.Project;

@Remote
public interface ProjectServiceRemote {
	
	public String getallProjet();
	public List<Project> getallProjets();
	public List<Project> getall() ;
	public List<Project> getProjetaddress(int id) ;
	

}