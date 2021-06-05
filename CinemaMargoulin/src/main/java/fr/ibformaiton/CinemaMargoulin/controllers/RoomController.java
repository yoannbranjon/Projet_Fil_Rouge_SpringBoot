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

import fr.ibformaiton.CinemaMargoulin.Services.RoomService;

import fr.ibformaiton.CinemaMargoulin.beans.Room;
import fr.ibformaiton.CinemaMargoulin.beans.Session;
import fr.ibformaiton.CinemaMargoulin.beans.Users;

@RestController
@CrossOrigin(origins = "*")
public class RoomController {

	@Autowired
	private RoomService roomService;

	@PostConstruct
	@Transactional
	void init() {
		Room room = new Room("Margou", 100, 50, "Dolby");
		roomService.add(room);
	}

	@GetMapping("/REST/recuproom")
	public List<Room> getAll() {
		return roomService.getAll();
	}


	@PostMapping("/REST/addNewRoom")
	@Transactional // A ajouter lorsqu'on modifie qqc en BDD
	public void addRoom(@RequestBody Room room) {
		roomService.add(room);
	}
	
	 
	 @DeleteMapping("/REST/deleteRoomById")
	    @Transactional // A ajouter lorsqu'on modifie qqc en BDD
	    public void deleteRoomById(@RequestParam("id") int id) {
	        roomService.deleteRoomById(id);

	    }



}
