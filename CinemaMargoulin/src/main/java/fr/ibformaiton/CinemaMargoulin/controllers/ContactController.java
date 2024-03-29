package fr.ibformaiton.CinemaMargoulin.controllers;

import java.util.List;

import javax.annotation.PostConstruct;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
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
//	void init() {
//		Contact contact = new Contact("Nezha", "bouhafs", "bouhafsn@gmail.com", "Doléance : je voudrais plus de séance le matin svp!");
//		contactService.add(contact);
//	}
	
	@GetMapping("/REST/recupcontact")
	public List<Contact> getAll() {
		return contactService.getAll();
	}
	
	 @PostMapping("/REST/addNewContact")
	    @Transactional // A ajouter lorsqu'on modifie qqc en BDD
	    public void addContact(@RequestBody Contact contact) {
		 contactService.add(contact);

	    }
	 
	 @DeleteMapping("/REST/deleteContactById")
	    @Transactional // A ajouter lorsqu'on modifie qqc en BDD
	    public void deleteContactById(@RequestParam("id") int id) {
	        contactService.deleteContactById(id);

	    }
}
