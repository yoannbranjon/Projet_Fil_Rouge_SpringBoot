package fr.ibformaiton.CinemaMargoulin.beans;

import java.time.LocalDateTime;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@NoArgsConstructor
public class Session {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int id;
	private int idFilm;
	private int idRoom;
	private LocalDateTime dateTime;
		
	public Session(int idFilm, int idRoom, LocalDateTime dateTime) {
		this.idFilm = idFilm;
		this.idRoom = idRoom;
		this.dateTime = dateTime;
	}
	
	
	
	
	
	

	

}
