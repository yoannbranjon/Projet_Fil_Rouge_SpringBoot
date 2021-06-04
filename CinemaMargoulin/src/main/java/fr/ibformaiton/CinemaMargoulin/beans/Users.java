package fr.ibformaiton.CinemaMargoulin.beans;

import java.time.LocalDate;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import lombok.Data;
import lombok.NoArgsConstructor;

@Entity // geré par Hibernate
@Data
@NoArgsConstructor

@Table(name = "users")
public class Users {

	@Id // clé primaire
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int id;
	private String firstName;
	private String lastName;

	@OneToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "account_id")
	private Account account;

	private LocalDate birthday;
	private String address;
	private int postalCode;
	private String city;
	

	
	public Users(String firstName, String lastName, Account account, LocalDate birthday, String address, int postalCode,
			String city) {
		super();
		this.firstName = firstName;
		this.lastName = lastName;
		this.account = account;
		this.birthday = birthday;
		this.address = address;
		this.postalCode = postalCode;
		this.city = city;
	}

		
}
