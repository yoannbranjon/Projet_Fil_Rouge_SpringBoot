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
public class Room {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int id;
	private String name;
	private int sitNumber;
	private int maxCapacity;
	private String audioSystem;
	
	public Room(String name, int sitNumber, int maxCapacity, String audioSystem) {
		this.name = name;
		this.sitNumber = sitNumber;
		this.maxCapacity = maxCapacity;
		this.audioSystem = audioSystem;
	}
	
	

	

}
