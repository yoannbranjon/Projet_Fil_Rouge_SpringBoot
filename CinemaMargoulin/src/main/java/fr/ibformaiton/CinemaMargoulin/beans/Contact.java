package fr.ibformaiton.CinemaMargoulin.beans;

import java.time.LocalDate;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import lombok.Data;
import lombok.NoArgsConstructor;

@Entity // geré par Hibernate
@Data
@NoArgsConstructor
public class Contact {
	
	@Id // clé primaire
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int id;
	private String firstName;
	private String lastName;
	private String email;
	private String comment;
	
	
	
	public Contact(String firstName, String lastName, String email, String comment) {

		this.firstName = firstName;
		this.lastName = lastName;
		this.email = email;
		this.comment = comment;
	}
	
	
	
	

}
