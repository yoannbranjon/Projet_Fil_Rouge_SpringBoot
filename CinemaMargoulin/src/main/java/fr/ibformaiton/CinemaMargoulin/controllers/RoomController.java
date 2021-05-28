package fr.ibformaiton.CinemaMargoulin.controllers;

import java.util.List;

import javax.annotation.PostConstruct;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import fr.ibformaiton.CinemaMargoulin.Services.RoomService;

import fr.ibformaiton.CinemaMargoulin.beans.Room;

@RestController
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
}
