package fr.ibformaiton.CinemaMargoulin.controllers;

import java.util.List;
import javax.annotation.PostConstruct;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import fr.ibformaiton.CinemaMargoulin.Services.ReservationService;
import fr.ibformaiton.CinemaMargoulin.beans.Reservation;

@RestController
@CrossOrigin(origins = "*")
public class ReservationController {

	@Autowired
	private ReservationService reservationService;

	@PostConstruct
	@Transactional
	void init() {
		Reservation reservation = new Reservation("NezhaResa", 8, 2, 12, 13);
		reservationService.add(reservation);
	}

	@GetMapping("/REST/recupreservation")
	public List<Reservation> getAll() {
		return reservationService.getAll();
	}

}
