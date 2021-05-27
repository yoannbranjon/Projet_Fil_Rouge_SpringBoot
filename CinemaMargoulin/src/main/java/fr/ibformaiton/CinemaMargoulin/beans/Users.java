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
	private String firstName;
	private String lastName;
	private LocalDate birthday;
	private String address;
	private int idAcoount;
	
	public Users(String firstName, String lastName, LocalDate birthday, String address, int idAcoount) {
		this.firstName = firstName;
		this.lastName = lastName;
		this.birthday = birthday;
		this.address = address;
		this.idAcoount = idAcoount;
	}
	
}
