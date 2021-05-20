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
	private int filmId;
	private int roomId;
	private LocalDateTime dateTime;
	
	
	public Session(int id, int filmId, int roomId, LocalDateTime dateTime) {
		super();
		this.id = id;
		this.filmId = filmId;
		this.roomId = roomId;
		this.dateTime = dateTime;
	}
	
	

	

}
