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
public class Film {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int id ;
	private String name ;
	private int duration;
	private String filmVersion;
	private String display;
	
	
	public Film(String name, int duration, String filmVersion, String display) {
		this.name = name;
		this.duration = duration;
		this.filmVersion = filmVersion;
		this.display = display;
	}



	
	
	
	
	

}
