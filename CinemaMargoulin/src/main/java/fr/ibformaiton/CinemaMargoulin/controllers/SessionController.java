package fr.ibformaiton.CinemaMargoulin.controllers;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.List;

import javax.annotation.PostConstruct;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import fr.ibformaiton.CinemaMargoulin.Services.SessionService;
import fr.ibformaiton.CinemaMargoulin.beans.Film;
import fr.ibformaiton.CinemaMargoulin.beans.Session;
import fr.ibformaiton.CinemaMargoulin.beans.Users;

@RestController
@CrossOrigin(origins = "*")
public class SessionController {

	@Autowired
	private SessionService sessionService;

	@PostConstruct
	@Transactional
	void init() {
	}

	@GetMapping("/REST/recupsession")
	public List<Session> getAll() {
		return sessionService.getAll();
	}
	
	 @PostMapping("/REST/addNewSession")
	    @Transactional // A ajouter lorsqu'on modifie qqc en BDD
	    public void addSession(@RequestBody Session session) {
	        sessionService.add(session);
	    }
	 
	 @DeleteMapping("/REST/deleteSessionById")
	    @Transactional // A ajouter lorsqu'on modifie qqc en BDD
	    public void deleteSessionById(@RequestParam("id") int id) {
	        sessionService.deleteSessionById(id);

	    }
	 
	 @PutMapping("/REST/updateSession")
	    @Transactional // A ajouter lorsqu'on modifie qqc en BDD
	    public void updateFilm(@RequestBody Session session) {
	        sessionService.update(session);

	    }
	  
	
	
}
