package fr.ibformaiton.CinemaMargoulin.beans;


import java.time.LocalDateTime;

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
	private String message;
	
	
	// create an LocalDateTime object
    private LocalDateTime dateTimeContact
        	= LocalDateTime.now();


	public Contact(String firstName, String lastName, String email, String message) {
		super();
		this.firstName = firstName;
		this.lastName = lastName;
		this.email = email;
		this.message = message;
	}



	
	

	
	
	
	

}
