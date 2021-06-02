package fr.ibformaiton.CinemaMargoulin.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import fr.ibformaiton.CinemaMargoulin.Services.FilmService;
import fr.ibformaiton.CinemaMargoulin.beans.Film;

@RestController
@CrossOrigin(origins = "*")
public class FilmController {

	@Autowired
	private FilmService filmService;

	@GetMapping("/hello")
	public String bonjour() {
		return "Bonjour bonjour du cinema Margoulin";
	}

	@GetMapping("/REST/recupfilm")
	public List<Film> getAll() {
		return filmService.getAll();
	}
	
	 @PostMapping("/REST/addNewFilm")
	    @Transactional // A ajouter lorsqu'on modifie qqc en BDD
	    public void addFilm(@RequestBody Film film) {
	        filmService.add(film);

	    }
	 
	 @PostMapping("/REST/deleteFilm")
	    @Transactional // A ajouter lorsqu'on modifie qqc en BDD
	    public void deleteFilm(@RequestBody Film film) {
	        filmService.delete(film);

	    }
	 
	 @DeleteMapping("/REST/deleteFilmById")
	    @Transactional // A ajouter lorsqu'on modifie qqc en BDD
	    public void deleteFilmById(@RequestParam("id") int id) {
	        filmService.deleteFilmById(id);

	    }
	  

}