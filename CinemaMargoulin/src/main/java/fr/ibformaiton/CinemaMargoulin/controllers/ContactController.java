package fr.ibformaiton.CinemaMargoulin.controllers;

import java.util.List;

import javax.annotation.PostConstruct;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import fr.ibformaiton.CinemaMargoulin.Services.ContactService;
import fr.ibformaiton.CinemaMargoulin.beans.Contact;


@RestController
@CrossOrigin(origins = "*")
public class ContactController {
	
	@Autowired
	private ContactService contactService;
	
	@PostConstruct
	@Transactional
	
	@GetMapping("/REST/recupcontact")
	public List<Contact> getAll() {
		return contactService.getAll();
	}
	
	 @PostMapping("/REST/addNewContact")
	    @Transactional // A ajouter lorsqu'on modifie qqc en BDD
	    public void addContact(@RequestBody Contact contact) {
		 contactService.add(contact);

	    }
}
