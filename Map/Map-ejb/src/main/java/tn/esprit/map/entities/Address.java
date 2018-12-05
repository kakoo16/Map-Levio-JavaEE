package tn.esprit.map.entities;

import java.io.Serializable;
import javax.persistence.*;
import java.util.List;


/**
 * The persistent class for the Addresses database table.
 * 
 */
@Entity
@Table(name="Addresses")
@NamedQuery(name="Address.findAll", query="SELECT a FROM Address a")
public class Address implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="AddressId")
	private int addressId;

	private Object city;

	private Object country;

	private Object postal_Code;

	//bi-directional many-to-one association to Project
	@OneToMany(mappedBy="address")
	private List<Project> projects;

	public Address() {
	}

	public int getAddressId() {
		return this.addressId;
	}

	public void setAddressId(int addressId) {
		this.addressId = addressId;
	}

	public Object getCity() {
		return this.city;
	}

	public void setCity(Object city) {
		this.city = city;
	}

	public Object getCountry() {
		return this.country;
	}

	public void setCountry(Object country) {
		this.country = country;
	}

	public Object getPostal_Code() {
		return this.postal_Code;
	}

	public void setPostal_Code(Object postal_Code) {
		this.postal_Code = postal_Code;
	}

	public List<Project> getProjects() {
		return this.projects;
	}

	public void setProjects(List<Project> projects) {
		this.projects = projects;
	}

	public Project addProject(Project project) {
		getProjects().add(project);
		project.setAddress(this);

		return project;
	}

	public Project removeProject(Project project) {
		getProjects().remove(project);
		project.setAddress(null);

		return project;
	}

}