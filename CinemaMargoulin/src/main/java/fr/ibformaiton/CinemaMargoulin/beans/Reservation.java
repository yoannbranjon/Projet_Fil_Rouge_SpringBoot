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
	private int reservationId;
	private String name;
	private int price;
	private int sessionId;
	private int userId;

	public Reservation(String name, int price, int sessionId, int userId) {
		this.name = name;
		this.price = price;
		this.sessionId = sessionId;
		this.userId = userId;
	
	}
	

}
