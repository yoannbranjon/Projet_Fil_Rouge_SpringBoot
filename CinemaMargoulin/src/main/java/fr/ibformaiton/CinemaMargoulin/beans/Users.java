package fr.ibformaiton.CinemaMargoulin.beans;

import java.time.LocalDate;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@NoArgsConstructor
public class Users {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int id;
	private String mail;
	private String password;
	private String firstName;
	private String lastName;
	private LocalDate birthday;
	private String adress;
	
	
	public Users(int id, String mail, String password, String firstName, String lastName, LocalDate birthday,
			String adress) {
		super();
		this.id = id;
		this.mail = mail;
		this.password = password;
		this.firstName = firstName;
		this.lastName = lastName;
		this.birthday = birthday;
		this.adress = adress;
	}
	
	

}
