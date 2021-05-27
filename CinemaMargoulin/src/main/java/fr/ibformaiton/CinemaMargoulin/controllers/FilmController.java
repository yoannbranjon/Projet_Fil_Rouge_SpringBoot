package fr.ibformaiton.CinemaMargoulin.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import fr.ibformaiton.CinemaMargoulin.Services.FilmService;
import fr.ibformaiton.CinemaMargoulin.beans.Film;

@RestController
public class FilmController {
	
	@Autowired
	private FilmService filmService;
	
	  @GetMapping("/hello")
	    public String bonjour() {
	        return "Bonjour bonjour du cinema Margoulin";
	    }
	  
	  @GetMapping("/REST/recupfilm")
		public List<Film> getAll(){
			return filmService.getAll();
		}
<<<<<<< HEAD
=======
	  
	  
	  
>>>>>>> 8914a9174afcca46edb81d04d599adc3e9ad4ec9

}