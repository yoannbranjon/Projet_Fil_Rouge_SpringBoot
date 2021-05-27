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
public class Reservation {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int id;
	private String name;
	private int price;
	private int idSession;
	private int idUser;
	private int idAccount;
	
	
	public Reservation(String name, int price, int idSession, int idUser, int idAccount) {
		this.name = name;
		this.price = price;
		this.idSession = idSession;
		this.idUser = idUser;
		this.idAccount = idAccount;
	}

	
	

}
