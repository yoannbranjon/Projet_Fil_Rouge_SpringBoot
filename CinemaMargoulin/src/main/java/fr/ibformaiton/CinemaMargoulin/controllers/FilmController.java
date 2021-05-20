package fr.ibformaiton.CinemaMargoulin.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
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
	  

}
