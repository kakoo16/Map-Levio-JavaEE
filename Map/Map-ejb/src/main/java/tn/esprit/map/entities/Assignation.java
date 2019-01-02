package tn.esprit.map.entities;

import java.io.Serializable;
import javax.persistence.*;

/**
 * Entity implementation class for Entity: Assignation
 *
 */
@Entity

public class Assignation implements Serializable {

	@Id
	@GeneratedValue( strategy = GenerationType.IDENTITY )
	private int idA  ;
	
	
	public int getIdA() {
		return idA;
	}

	public void setIdA(int idA) {
		this.idA = idA;
	}

	private static final long serialVersionUID = 1L;

	public Assignation() {
		super();
	}
   
}
