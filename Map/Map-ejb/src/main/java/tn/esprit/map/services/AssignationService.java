package tn.esprit.map.services;

import java.util.List;

import javax.ejb.LocalBean;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.ws.rs.client.Client;
import javax.ws.rs.client.ClientBuilder;
import javax.ws.rs.client.Entity;
import javax.ws.rs.client.Invocation;
import javax.ws.rs.client.WebTarget;
import javax.ws.rs.core.GenericType;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

import tn.esprit.map.entities.Holiday;

@Stateless
@LocalBean
public class AssignationService implements AssignationServiceRemote{
	
	@PersistenceContext
	EntityManager em ; 
	
	@Override
	public void ajouterAssignation(Holiday m) {
	
		em.persist(m);
		
	}

	@Override
	public List<Holiday> AffichageHoliday() {
	
		Client client = ClientBuilder.newClient();
		WebTarget target =client.target("http://localhost:4054/api/Holiday/GetHoliday");
		Response reponse = target.request().get();
		List<Holiday> result = reponse.readEntity(new GenericType<List<Holiday>>(){});
		System.err.println("result :: " +result);
		return result;
	}

	@Override
	public int ajouterMandat(Holiday m) {
		Client client = ClientBuilder.newClient();
		WebTarget target =client.target("http://localhost:4054/HolidayApi/CreateMandat");
		Invocation.Builder invocationBuilder=target.request(MediaType.APPLICATION_JSON);
		Response response =invocationBuilder.post(Entity.entity(m, MediaType.APPLICATION_JSON));
		System.out.println(response.readEntity(String.class));
		return 0;}
	
	
	
	@Override
	public void DeleteAssignationById(int AssignationId) {
		em.remove(em.find(Holiday.class, AssignationId));

	}
	
	@Override
	public void ModifierAssignationById(Holiday AssignationId) {
		em.merge(AssignationId);

	}

}
