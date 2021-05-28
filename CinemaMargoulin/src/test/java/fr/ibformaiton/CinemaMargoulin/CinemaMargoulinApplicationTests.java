package fr.ibformaiton.CinemaMargoulin;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.Month;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import fr.ibformaiton.CinemaMargoulin.Services.AccountService;
import fr.ibformaiton.CinemaMargoulin.Services.FilmService;
import fr.ibformaiton.CinemaMargoulin.Services.ReservationService;
import fr.ibformaiton.CinemaMargoulin.Services.RoomService;
import fr.ibformaiton.CinemaMargoulin.Services.SessionService;
import fr.ibformaiton.CinemaMargoulin.Services.TypesService;
import fr.ibformaiton.CinemaMargoulin.Services.UsersService;
import fr.ibformaiton.CinemaMargoulin.beans.Account;
import fr.ibformaiton.CinemaMargoulin.beans.Film;
import fr.ibformaiton.CinemaMargoulin.beans.Reservation;
import fr.ibformaiton.CinemaMargoulin.beans.Room;
import fr.ibformaiton.CinemaMargoulin.beans.Session;
import fr.ibformaiton.CinemaMargoulin.beans.Types;
import fr.ibformaiton.CinemaMargoulin.beans.Users;

@SpringBootTest
class CinemaMargoulinApplicationTests {

	@Autowired
	FilmService filmService;
	
	@Autowired
	UsersService usersService;
	
	@Autowired
	ReservationService reservationService;
	
	@Autowired
	AccountService accountService;
	
	@Autowired
	RoomService roomService;
	
	@Autowired
	SessionService sessionService;
	
	@Autowired
	TypesService typesService;
	
	@Test
	void testServiceFilm() {
		Film a = new Film("kill bill",1,"Vo","dispaly");
		filmService.add(a);
		
		a.setDisplay("C'était bien");
		filmService.update(a);
		
		filmService.delete(a);
		
		filmService.add(new Film("kill Loic",1,"Vo","dispaly"));
		filmService.add(new Film("kill Nezha",1,"Vo","dispaly"));
		filmService.add(new Film("kill Anthony",1,"Vo","dispaly"));
		filmService.add(new Film("il reste Yoann, the survivor",1,"Vo","dispaly"));
		
		System.out.println(filmService.getAll());
		
	}
	
	@Test
	void testServiceUsers() {
		Users user = new Users("Nezha","Bou", LocalDate.of(2007,10,12), "33, place st Mich", 3);
		usersService.add(user);
		
		user.setAddress("rue de la merde");
		usersService.update(user);
		
		usersService.delete(user);
		
		usersService.add(new Users("Yoann","Bron",LocalDate.of(2008,11,13), "rue de la paix", 4));
		
		System.out.println(usersService.getAll());
		
	}
	
	@Test
	void testServiceReservation() {
		Reservation reservation = new Reservation("NezhaResa", 8, 2, 12, 13);
		reservationService.add(reservation);
		
		reservation.setName("YoannResa");
		reservationService.update(reservation);
		
		reservationService.delete(reservation);
		
		reservationService.add(new Reservation("YoannResa", 9,3, 13, 14));
		reservationService.add(new Reservation("AnthonyResa", 10,4, 14, 15));
		
		System.out.println(reservationService.getAll());		
	}
	
	@Test
	void testServiceAccount() {
		Account account = new Account("nezha@gmail.com", "password");
		accountService.add(account);
		
		account.setEmail("yoann@gmail.com");
		accountService.update(account);
		
		accountService.delete(account);
		
		accountService.add(new Account("Rmain@gmail.com", "password"));
		accountService.add(new Account("renaud@gmail.com", "password"));
		
		accountService.getAll();
		
		System.out.println(accountService.getAll());		
	}
	
	@Test
	void testServiceRoom() {
		Room room = new Room("Margou", 100, 50, "Dolby");
		roomService.add(room);
		
		room.setMaxCapacity(80);
		roomService.update(room);
		
		roomService.delete(room);
		
		roomService.add(new Room("Atlante", 100, 50, "Dolby"));
		roomService.add(new Room("Beaujoire", 100, 50, "Dolby"));
		
		System.out.println(roomService.getAll());		
	}
	
	@Test
	void testServiceSession() {
		Session session = new Session(11, 12, LocalDateTime.of(2017,Month.FEBRUARY,3,6,30,40,50000));
		sessionService.add(session);
		
		session.setIdFilm(13);
		sessionService.update(session);
		
		sessionService.delete(session);
		
		sessionService.add(new Session(11, 12, LocalDateTime.of(2018,Month.JUNE,3,8,30,40,50000)));
		sessionService.add(new Session(11, 12, LocalDateTime.of(2019,Month.JULY,3,6,30,40,50000)));
		
		System.out.println(sessionService.getAll());		
	}
	
	@Test
	void testServiceTypes() {
		Types types = new Types("action", 10);
		typesService.add(types);
		
		types.setDesignation("drama");
		typesService.update(types);
		
		typesService.delete(types);
		
		typesService.add(new Types("action", 18));
		typesService.add(new Types("horror", 18));
		
		System.out.println(typesService.getAll());		
	}
	
	
	}


