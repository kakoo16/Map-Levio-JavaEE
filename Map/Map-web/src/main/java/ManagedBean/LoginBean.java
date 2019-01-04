package ManagedBean;

import javax.ejb.EJB;
import javax.enterprise.context.ApplicationScoped;
import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.context.FacesContext;

import Services.UsersService;
import tn.esprit.map.entities.AspNetUser;
import tn.esprit.map.entities.rolesid;


@ManagedBean
@ApplicationScoped
public class LoginBean {
	private AspNetUser user;
	private String password;
	private String userName;
	private boolean loggedIn;
	private rolesid role;
	public rolesid getRole() {
		return role;
	}



	public void setRole(rolesid role) {
		this.role = role;
	}



	@EJB
	UsersService usersevice;
	UsersService roleservice;
	
	
	
	
	
	public String doLogin(){
		String navigateTo="null";
		
		user=usersevice.getClientsByEmailAndPassword(userName);
		
		
		
		
		
		if(user!=null & user.getUserName().equals("amine")){ 
			System.out.println("admin welcome");
			navigateTo="Bindex?faces-redirect=true"; 
		
			loggedIn=true;
		
			
		 
		//	mat=agriculteur.getMatricule();
			
		}
		else if(user!=null ){
		 System.out.println("welcome client");
			navigateTo="Findex?faces-redirect=true";
			loggedIn=true;		
		}
		
		else{
			
			FacesContext.getCurrentInstance().addMessage("form:btn", new FacesMessage("bad credentials"));
		}
	return navigateTo;
	}
	
	

	public String doLogout(){
		FacesContext.getCurrentInstance().getExternalContext().invalidateSession();
		System.out.println("ok14");
		return "login?faces-redirect=true";
		
	}
	
	
	
	
	
	
	
	public String getUserName() {
		return userName;
	}



	public void setUserName(String userName) {
		this.userName = userName;
	}
}