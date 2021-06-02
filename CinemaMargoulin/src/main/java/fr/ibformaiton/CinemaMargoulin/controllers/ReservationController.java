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

import fr.ibformaiton.CinemaMargoulin.Services.ReservationService;
import fr.ibformaiton.CinemaMargoulin.beans.Reservation;
import fr.ibformaiton.CinemaMargoulin.beans.Users;




@RestController
@CrossOrigin(origins = "*")
public class ReservationController {

	@Autowired
	private ReservationService reservationService;


	@PostConstruct
	@Transactional


	@GetMapping("/REST/recupreservation")
	public List<Reservation> getAll() {
		return reservationService.getAll();
	}
	
	 @PostMapping("/REST/addNewReservation")
	    @Transactional // A ajouter lorsqu'on modifie qqc en BDD
	    public void addReservation(@RequestBody Reservation reservation) {
	        reservationService.add(reservation);

	    }
	  

}
