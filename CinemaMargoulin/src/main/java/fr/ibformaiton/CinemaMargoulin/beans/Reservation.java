package fr.ibformaiton.CinemaMargoulin.beans;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import lombok.Data;
import lombok.NoArgsConstructor;

@Table(name = "reservation")
@Entity
@Data
@NoArgsConstructor
public class Reservation {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int id;
	private String name;
	private int price;
	
	@ManyToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "session_id")
	private Session session;
	
	@ManyToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "users_id")
	private Users users;
	
	private int seatNumber;

	public Reservation(String name, int price, Session session, Users users, int seatNumber) {
		this.name = name;
		this.price = price;
		this.session = session;
		this.users = users;
		this.seatNumber = seatNumber;
	}

	
	

	
	
	
	
	
	

	
	

}
