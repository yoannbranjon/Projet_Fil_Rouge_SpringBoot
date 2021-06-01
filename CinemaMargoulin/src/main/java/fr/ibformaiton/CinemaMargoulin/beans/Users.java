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

@Table(name = "user")
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

	public Users(String firstName, String lastName, Account account, LocalDate birthday, String address) {
		super();
		this.firstName = firstName;
		this.lastName = lastName;
		this.account = account;
		this.birthday = birthday;
		this.address = address;
	}

	@Override
	public String toString() {
		return "Users [firstName=" + firstName + ", lastName=" + lastName + ", account=" + account + ", birthday="
				+ birthday + ", address=" + address + "]";
	}

}
