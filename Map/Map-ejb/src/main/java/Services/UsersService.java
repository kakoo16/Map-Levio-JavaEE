package Services;

import java.util.List;
import java.util.Map;

import javax.ejb.LocalBean;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.NoResultException;
import javax.persistence.PersistenceContext;
import javax.persistence.TypedQuery;
import javax.ws.rs.client.Client;
import javax.ws.rs.client.ClientBuilder;
import javax.ws.rs.client.WebTarget;
import javax.ws.rs.core.GenericType;
import javax.ws.rs.core.Response;

import tn.esprit.map.entities.AspNetUser;
import tn.esprit.map.entities.Clientnotapproveds;
import tn.esprit.map.entities.rolesid;

@Stateless
@LocalBean

public class UsersService implements UsersServiceRemote{

	@Override
	
	public List<Clientnotapproveds> getallusers() {
		Client client=ClientBuilder.newClient();
		WebTarget target=client.target("http://127.0.0.1:18080/WebService1-0.0.1-SNAPSHOT/application/clients");
		Response response=target.request().get();
		 List<Clientnotapproveds> result = response.readEntity(new GenericType<List<Clientnotapproveds>>() {});
		//String result=response.readEntity(String.class);
		response.close();
		return result;
	}

	@Override
	public List<AspNetUser> getallusers1() {
		Client client=ClientBuilder.newClient();
		WebTarget target=client.target("http://127.0.0.1:18080/WebService1-0.0.1-SNAPSHOT/application/users");
		Response response=target.request().get();
		 List<AspNetUser> result = response.readEntity(new GenericType<List<AspNetUser>>() {});
		//String result=response.readEntity(String.class);
		response.close();
		return result;
	}
	
	@PersistenceContext(unitName="Map-ejb")

	EntityManager em;

	@Override
	public AspNetUser getuserBynameandPassword(String userName) {
		TypedQuery<AspNetUser> query = em.createQuery("SELECT a FROM AspNetUser a WHERE a.userName =:userName ",
				AspNetUser.class);
		query.setParameter("userName", userName);
		
		AspNetUser user = null;
		try {
			user = (AspNetUser) query.getSingleResult();
		} catch (NoResultException  e) {
			System.out.println("Erreur : " + e);
		}
		return user;
	}

	@Override
	public void inscription(AspNetUser user) {
		em.persist(user);
		
	}

	@Override
	public AspNetUser getClientsByEmailAndPassword(String username) {
		// TODO Auto-generated method stub
				 List<AspNetUser> result =getallusers1();
				 for(int i=0;i<result.size();i++){
					 if((result.get(i).getUserName().equals(username))){
						 return result.get(i);
					 }else {
						 AspNetUser asp=new AspNetUser();
						 asp.setUserName("azerty");
						 return asp;
					 }
				 }
				return null;
			}

	@Override
	public List<rolesid> getrole() {
		Client client=ClientBuilder.newClient();
		WebTarget target=client.target("http://127.0.0.1:18080/WebService1-0.0.1-SNAPSHOT/application/roles");
		Response response=target.request().get();
		 List<rolesid> result = response.readEntity(new GenericType<List<rolesid>>() {});
		//String result=response.readEntity(String.class);
		response.close();
		return result;

	}

	@Override
	public rolesid getrolebyid(String id) {
		 List<rolesid> result =getrole();
		 for(int i=0;i<result.size();i++){
			 if((result.get(i).getUserId().equals(id))){
				 return result.get(i);
			 }
		 }
		return null;
	}
	

}
