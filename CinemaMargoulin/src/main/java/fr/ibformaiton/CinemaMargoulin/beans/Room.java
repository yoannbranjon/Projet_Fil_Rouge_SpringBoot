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
	private int sit_number;
	private int max_capacity;
	private String audio_system;
	
	
	public Room(int id, String name, int sit_number, int max_capacity, String audio_system) {
		this.id = id;
		this.name = name;
		this.sit_number = sit_number;
		this.max_capacity = max_capacity;
		this.audio_system = audio_system;
	}	
	

}
