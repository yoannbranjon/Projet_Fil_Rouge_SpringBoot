package fr.ibformaiton.CinemaMargoulin.controllers;

import java.util.List;

import javax.annotation.PostConstruct;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import fr.ibformaiton.CinemaMargoulin.Services.UsersService;
import fr.ibformaiton.CinemaMargoulin.beans.Users;

@RestController
public class UsersController {

	@Autowired
	private UsersService usersService;
	
	@PostConstruct
	@Transactional
	void init() {
		
		//Users user = new Users("Nezha","Bou", LocalDate.of(2007,10,12), "33, place st Mich", 3);
		//usersService.add(user);
	}
	
	  @GetMapping("/REST/recupusers")
	    public List<Users> getAllUsers() {
		  return usersService.getAll();
	    }
	  
	  @PostMapping("/REST/addNewUser")
	    @Transactional // A ajouter lorsqu'on modifie qqc en BDD
	    public void addUser(@RequestBody Users users) {
	        usersService.add(users);

	    }

}
