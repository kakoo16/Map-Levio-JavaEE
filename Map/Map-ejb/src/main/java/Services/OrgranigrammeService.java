package Services;

import java.util.List;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLConnection;
import java.net.URLEncoder;
import javax.ejb.LocalBean;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import tn.esprit.map.entities.Organizational_Chart;




@Stateless
@LocalBean
public class OrgranigrammeService implements OrganigrammeServiceRemote {
	
@PersistenceContext(unitName="Map-ejb")
	
	EntityManager em;

@Override
public void ajouterEmploye(Organizational_Chart o) {
	em.persist(o);
	
	
}

@Override
public void addorganigramme(String directionnal_level, String program_Name, String project_responsable,
		String client_Name, String manager_account, String name_assignment_manager_client) {
	Organizational_Chart o=new Organizational_Chart();
	o.setDirectionnalLevel(directionnal_level);
	o.setProgram_Name(program_Name);
	o.setProjectResponsable(project_responsable);
	o.setClient_Name(client_Name);
	o.setManagerAccount(manager_account);
	o.setNameAssignmentManagerClient(name_assignment_manager_client);
	
	em.persist(o);
	
	
}

@Override
public List<Organizational_Chart> getAllorganigrammes() {
return em.createQuery("from Organizational_Chart",Organizational_Chart.class).getResultList();
}

@Override
public void DeleteById(int Id) {
	Organizational_Chart employe = em.find(Organizational_Chart.class, Id);
	
	em.remove(employe);
	
}

@Override
public void update(Organizational_Chart o) {
	em.merge(o);
	
}

public String sendSms() {
	try {
		// Construct data
		String apiKey = "apikey=" + "Z7WJqHKp93o-VM1tlkLH19fFPMzMLPkNDvkXHJO59P";
		String message = "&message=" + "votre organigramme a ete crée";
		String sender = "&sender=" + "Map Levio";
		String numbers = "&numbers=" + "+21623169697";
		
		// Send data
		HttpURLConnection conn = (HttpURLConnection) new URL("https://api.txtlocal.com/send/?").openConnection();
		String data = apiKey + numbers + message + sender;
		conn.setDoOutput(true);
		conn.setRequestMethod("POST");
		conn.setRequestProperty("Content-Length", Integer.toString(data.length()));
		conn.getOutputStream().write(data.getBytes("UTF-8"));
		final BufferedReader rd = new BufferedReader(new InputStreamReader(conn.getInputStream()));
		final StringBuffer stringBuffer = new StringBuffer();
		String line;
		while ((line = rd.readLine()) != null) {
			stringBuffer.append(line);
		}
		rd.close();
		
		return stringBuffer.toString();
	} catch (Exception e) {
		System.out.println("Error SMS "+e);
		return "Error "+e;
	}
}
}




