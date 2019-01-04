package Services;

import java.util.List;
import java.util.Map;

import javax.ejb.Remote;

import tn.esprit.map.entities.AspNetUser;
import tn.esprit.map.entities.Clientnotapproveds;
import tn.esprit.map.entities.rolesid;

@Remote
public interface UsersServiceRemote {
	public List<Clientnotapproveds> getallusers();
	public List<AspNetUser> getallusers1();
	public AspNetUser getuserBynameandPassword(String userName);
	public void inscription(AspNetUser user);
	public AspNetUser getClientsByEmailAndPassword(String username);
	public List<rolesid> getrole();
	
	public rolesid getrolebyid(String id);



}
