package tn.esprit.map.services;


import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.util.Date;
import java.util.List;
import java.util.Timer;

import javax.ejb.EJB;
import javax.ejb.LocalBean;
import javax.ejb.Schedule;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.TemporalType;
import javax.persistence.TypedQuery;
import javax.ws.rs.client.Client;
import javax.ws.rs.client.ClientBuilder;
import javax.ws.rs.client.Entity;
import javax.ws.rs.client.Invocation;
import javax.ws.rs.client.WebTarget;
import javax.ws.rs.core.GenericType;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import tn.esprit.map.entities.AspNetUser;
import tn.esprit.map.entities.Mandate;
import tn.esprit.map.entities.MandatePK;
import tn.esprit.map.entities.Project;

@Stateless
@LocalBean
public class MandateService implements MandateServiceRemote{

	@PersistenceContext
	EntityManager em ; 
	
	@Override
	public int ajouterMandat(Mandate m) {
			Client client = ClientBuilder.newClient();
			WebTarget target =client.target("http://localhost:4054/Restful/CreateMandat");
			Invocation.Builder invocationBuilder=target.request(MediaType.APPLICATION_JSON);
			Response response =invocationBuilder.post(Entity.entity(m, MediaType.APPLICATION_JSON));
			System.out.println(response.readEntity(String.class));
			return 0;
		}
	
	
	@Override
	public List<Mandate> AffichageMandat() {
		// TODO Auto-generated method stub
		Client client = ClientBuilder.newClient();
		WebTarget target =client.target("http://localhost:4054/api/Mandat/GetMandats");
		Response reponse = target.request().get();
		List<Mandate> result = reponse.readEntity(new GenericType<List<Mandate>>(){});
		System.err.println("result :: " +result);
		return result;
	}

	@Override
	public void ajouterEmployee(int ProjectId, String Id, Date start_date, Date end_date) {
	
		Mandate m = new Mandate() ; 
		MandatePK mp = new MandatePK() ;  
		final long MILLISECONDS_PER_DAY = 1000 * 60 * 60 * 24;
		 Long diffMS = ((end_date.getTime() -start_date.getTime()));
		 Long diffdays=(diffMS / (MILLISECONDS_PER_DAY));
         float costfloat = 1F;
         if (diffdays < 60F)
         {
             costfloat = diffdays * 5F;
         }
         else if (diffdays > 60F)
         {
             costfloat = diffdays * 7.5F;
         }
       
		
		mp.setEnd_Date(end_date);
		mp.setStart_Date(start_date);
		mp.setProjectId(ProjectId);
		mp.setId(Id);
		m.setFees(costfloat);
		m.setId(mp);
		
		em.persist(m);
		
		
		
	
	}
	
	@EJB 
	MailService mail ; 
	
	@Override
	public void NotifyCandidate(String id) {
		AspNetUser candidate = em.find(AspNetUser.class, id);
		mail.send(candidate.getEmail(), "Alert About A New Mandate",
				"We Levio company inform you Mr" + candidate.getFirstName()
						+ " that you have to be in a mandate  please check your application"
						+ " to know more",
				"", "", "", "", "", "", "");

	}

	@Override
	public List<Project> getProjets() {
		TypedQuery<Project> query=em.createQuery("Select e from Project e ",Project.class);
		List<Project> e=query.getResultList();
		return e;
	}

	@Override
	public List<AspNetUser> getRessources() {
		TypedQuery<AspNetUser> query=em.createQuery("Select e from AspNetUser e ",AspNetUser.class);
		List<AspNetUser> e=query.getResultList();
		return e;
	}
	
	
	@Override
	public List<Mandate> findAll() {
		// TODO Auto-generated method stub
		
		return em.createQuery("Select e from Mandate e" ,Mandate.class).getResultList();
	}
	
	
	public String getDate() {
		String DATE_FORMAT = "yyyy-MM-dd";
		DateFormat dateFormat = new SimpleDateFormat(DATE_FORMAT);
		// Get current date
		Date currentDate = new Date();
		LocalDateTime localDateTime = currentDate.toInstant().atZone(ZoneId.systemDefault()).toLocalDateTime();

		// plus one
		localDateTime = localDateTime.plusDays(40);

		// convert LocalDateTime to date
		Date currentDatePlus = Date.from(localDateTime.atZone(ZoneId.systemDefault()).toInstant());

		return dateFormat.format(currentDatePlus);

	}
	public String convertDate(Date date)
	{
		String DATE_FORMAT = "yyyy-MM-dd";
		DateFormat dateFormat = new SimpleDateFormat(DATE_FORMAT);
		return dateFormat.format(date);
	}

	
	@Schedule(second = "00", minute = "00", hour = "00")
	public void AlertEndMandate(Timer timer) {
		System.out.println(getDate());
		String pattern = "yyyy-MM-dd";
		SimpleDateFormat simpleDateFormat = new SimpleDateFormat(pattern);
		TypedQuery<Mandate> query = em.createQuery(
				"SELECT  m FROM Mandate m where m.mandateId.dateFin = :d ", Mandate.class);

		try {
			query.setParameter("d", simpleDateFormat.parse(getDate()), TemporalType.DATE);
			List<Mandate> mandates = query.getResultList();
			if (!mandates.isEmpty()) {
				mandates.forEach(e -> {
			System.out.println(" hani lena");
				});

			} else
				System.out.println("liste vide");

		} catch (Exception e) {
			System.out.println("liste vide");
		}

	}
	
}
