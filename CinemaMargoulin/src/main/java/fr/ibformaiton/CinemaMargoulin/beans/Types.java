package fr.ibformaiton.CinemaMargoulin.beans;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;


import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@NoArgsConstructor
public class Types {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int id;
	private String designation;
	private int pegi;
	
	
	public Types(int id, String designation, int pegi) {
		super();
		this.id = id;
		this.designation = designation;
		this.pegi = pegi;
	}
	
	
	
	
	
	

}
