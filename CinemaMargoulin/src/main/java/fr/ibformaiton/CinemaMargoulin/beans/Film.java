package fr.ibformaiton.CinemaMargoulin.beans;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@NoArgsConstructor
@Table(name = "film")
public class Film {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int id ;
	private String name ;
	private int duration; //temps en minute
	private String filmVersion;
	private String display;
	private String typeFilm;
	private String synopsis;
	private String userComment;
	private String director; // realisateur
	private int pegi;
	
	
	public Film(String name, int duration, String filmVersion, String display, String typeFilm, String synopsis,
			String userComment, String director, int pegi) {

		this.name = name;
		this.duration = duration;
		this.filmVersion = filmVersion;
		this.display = display;
		this.typeFilm = typeFilm;
		this.synopsis = synopsis;
		this.userComment = userComment;
		this.director = director;
		this.pegi = pegi;
	}
	
	
	
	
	
	
	

	
	




	
	
	
	
	

}
