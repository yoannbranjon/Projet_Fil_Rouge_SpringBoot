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
import fr.ibformaiton.CinemaMargoulin.Services.UsersService;
import fr.ibformaiton.CinemaMargoulin.beans.Account;
import fr.ibformaiton.CinemaMargoulin.beans.Film;
import fr.ibformaiton.CinemaMargoulin.beans.Reservation;
import fr.ibformaiton.CinemaMargoulin.beans.Room;
import fr.ibformaiton.CinemaMargoulin.beans.Session;
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

	@Test
	void testServiceFilm() {
		Film film = new Film("kill bill", 2, "Vo", "Dolby", "Action", "c'est caca", "Spilberg", 12);
		filmService.add(film);

		film.setDisplay("C'était bien");
		filmService.update(film);

		filmService.delete(film);

		System.out.println(filmService.getAll());

	}

	@Test
	void testServiceUsers() {
		Users user = new Users("Nezha", "Merde", new Account("boubou@hot.fr", "bis"), LocalDate.of(2021, 9, 10),
				"rue de la merde");
		usersService.add(user);

		user.setAddress("rue de la merde");
		usersService.update(user);

		usersService.delete(user);

		usersService.add(new Users("Anthony", "Waza", new Account("antho@hot.fr", "biss"), LocalDate.of(2021, 5, 15),
				"rue de du cacaS"));

		System.out.println(usersService.getAll());

	}

	@Test
	void testServiceReservation() {
		Reservation reservation = new Reservation("NezhaResa", 8,
				new Session(new Film("kill bill", 2, "Vo", "Dolby", "Action", "c'est caca", "Spilberg", 12),
						new Room("Margou", 100, 50, "Dolby"),
						LocalDateTime.of(2017,02, 3, 6, 30, 40, 50)),
				new Users("Nezha", "Merde", new Account("boubou@hot.fr", "bis"), LocalDate.of(2021, 9, 10),
						"rue de la merde"),
				1);

		reservationService.add(reservation);

		reservation.setName("YoannResa");
		reservationService.update(reservation);

		reservationService.delete(reservation);

		reservationService.add(new Reservation("YoannResa", 9,
				new Session(new Film("kill bill", 2, "Vo", "Dolby", "Action", "c'est caca", "Spilberg", 12),
						new Room("Margou", 100, 50, "Dolby"),
						LocalDateTime.of(2017, 02, 3, 6, 30, 40, 50)),
				new Users("Nezha", "Merde", new Account("youyou@hot.fr", "bis"), LocalDate.of(2021, 9, 10),
						"rue de la merde bis"),
				1));

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
		Session session = new Session(new Film("kill bill", 2, "Vo", "Dolby", "Action", "c'est caca", "Spilberg", 12),
				new Room("Margou", 100, 50, "Dolby"), LocalDateTime.of(2017, Month.FEBRUARY, 3, 6, 30, 40, 50000));
		sessionService.add(session);

		//session.setId(13);
		sessionService.update(session);

		sessionService.delete(session);

		sessionService.add(new Session(
				new Film("kill Phill", 2, "Vo", "Dolby", "Animation", "c'est caca", "Jakson", 12),
				new Room("Margou", 100, 50, "Dolby"), LocalDateTime.of(2018, Month.FEBRUARY, 3, 6, 30, 40, 50000)));

		System.out.println(sessionService.getAll());
	}

}
