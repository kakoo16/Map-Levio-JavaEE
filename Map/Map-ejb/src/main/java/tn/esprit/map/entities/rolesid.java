package tn.esprit.map.entities;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQuery;
import javax.persistence.Table;


@Entity
@Table(name="AspNetUserRoles")
@NamedQuery(name="AspNetUserRoles.findAll", query="SELECT p FROM rolesid p")
public class rolesid  implements Serializable{
	private static final long serialVersionUID = 1L;
	
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="ClientId")
	private String Person_Id;
	
	@Column(name="UserId")
	private String UserId;
	
	@Override
	public String toString() {
		return "rolesid [Person_Id=" + Person_Id + ", UserId=" + UserId + ", RoleId=" + RoleId + "]";
	}

	@Column(name="RoleId")
	private String RoleId;

	public String getPerson_Id() {
		return Person_Id;
	}

	public void setPerson_Id(String person_Id) {
		Person_Id = person_Id;
	}

	public String getUserId() {
		return UserId;
	}

	public void setUserId(String userId) {
		UserId = userId;
	}

	public String getRoleId() {
		return RoleId;
	}

	public void setRoleId(String roleId) {
		RoleId = roleId;
	}
	
	

}
