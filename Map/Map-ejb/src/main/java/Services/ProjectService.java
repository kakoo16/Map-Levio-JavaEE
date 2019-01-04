package Services;

import java.util.List;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.TypedQuery;
import javax.ws.rs.client.Client;
import javax.ws.rs.client.ClientBuilder;
import javax.ws.rs.client.WebTarget;
import javax.ws.rs.core.GenericType;
import javax.ws.rs.core.Response;

import tn.esprit.map.entities.Address;
import tn.esprit.map.entities.Organizational_Chart;
import tn.esprit.map.entities.Project;



@Stateless
public class ProjectService implements ProjectServiceRemote {

@PersistenceContext(unitName="Map-ejb")
	
	EntityManager em;
	@Override
	public String getallProjet()
	{
		Client client=ClientBuilder.newClient();
		WebTarget target=client.target("http://127.0.0.1:18080/WebService1-0.0.1-SNAPSHOT/application/projets");
		Response response=target.request().get();
		String result=response.readEntity(String.class);
		response.close();
		
		return result;
		}

	@Override
	public List<Project> getallProjets() {
		
		Client client=ClientBuilder.newClient();
		WebTarget target=client.target("http://127.0.0.1:18080/WebService1-0.0.1-SNAPSHOT/application/projets");
		Response response=target.request().get();
		 List<Project> result = response.readEntity(new GenericType<List<Project>>() {});
		//String result=response.readEntity(String.class);
		response.close();
		return result;
	}

	@Override
	public List<Project> getall() {
		return em.createQuery("from Project",Project.class).getResultList();
	}

	@Override
	public List<Project> getProjetaddress(int id) {
		TypedQuery<Project> query=em.createQuery("Select e from Address e  join fetch e.projets p where p.projectId=:id ",Project.class);
		query.setParameter("id", id);
		List<Project> skills=query.getResultList();
		return skills;	
	}

	
	
	
	
	
	

}
