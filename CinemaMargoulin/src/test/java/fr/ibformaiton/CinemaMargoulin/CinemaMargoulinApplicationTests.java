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
		Film film = new Film("La Liste de Schindler", 195, "VO", "Dolby", "Historique, Guerre", "Evocation des années de guerre d'Oskar Schindler, industriel autrichien rentré à Cracovie en 1939 avec les troupes allemandes. Il va, tout au long de la guerre, protéger des juifs en les faisant travailler dans sa fabrique.","Un chef-d'oeuvre", "Steven Spielberg", 12);
		filmService.add(film);

		film.setDisplay("C'était bien");
		filmService.update(film);

		filmService.delete(film);

		System.out.println(filmService.getAll());

	}

	@Test
	void testServiceUsers() {
		Users user = new Users("Nezha", "Merde", new Account("boubou@hot.fr", "bis"), LocalDate.of(2021, 9, 10),"18, rue de la Tannerie", 44100,
				"Nantes");
		
		usersService.add(user);

		user.setAddress("rue de la merde");
		usersService.update(user);

		usersService.delete(user);

		usersService.add(new Users("Anthony", "Waza", new Account("antho@hot.fr", "biss"), LocalDate.of(2021, 5, 15), "20, rue de la Bastille", 44100,
				"Nantes"));

		System.out.println(usersService.getAll());

	}

	@Test
	void testServiceReservation() {
		Reservation reservation = new Reservation("NezhaResa", 8,
				new Session(new Film("La Liste de Schindler", 195, "VO", "Dolby", "Historique, Guerre", "Evocation des années de guerre d'Oskar Schindler, industriel autrichien rentré à Cracovie en 1939 avec les troupes allemandes. Il va, tout au long de la guerre, protéger des juifs en les faisant travailler dans sa fabrique.","Un chef-d'oeuvre", "Steven Spielberg", 12),
						new Room("Margou", 100, 50, "Dolby"), LocalDateTime.of(2017, 02, 3, 6, 30, 40, 50)),
				new Users("Nezha", "Merde", new Account("boubou@gmail.fr", "bis"), LocalDate.of(2021, 9, 10),"18, rue de la Tannerie", 44100,
						"Nantes"),
				1);

		reservationService.add(reservation);

		reservation.setName("YoannResa");
		reservationService.update(reservation);

		reservationService.delete(reservation);

		reservationService.add(new Reservation("AnthonyResa", 9,
				new Session(new Film("La Liste de Schindler", 195, "VO", "Dolby", "Historique, Guerre", "Evocation des années de guerre d'Oskar Schindler, industriel autrichien rentré à Cracovie en 1939 avec les troupes allemandes. Il va, tout au long de la guerre, protéger des juifs en les faisant travailler dans sa fabrique.","Un chef-d'oeuvre", "Steven Spielberg", 12),
						new Room("Margou", 100, 50, "Dolby"), LocalDateTime.of(2017, 02, 3, 6, 30, 40, 50)),
				new Users("Anthony", "Thual", new Account("antho@gmail.fr", "bis"), LocalDate.of(2021, 9, 10),"18, rue de la Tannerie", 44100,
						"Nantes"),
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
		Session session = new Session(new Film("Le Roi Lion", 89, "VF", "Dolby", "Animation", "Le long combat de Simba le lionceau pour accéder à son rang de roi des animaux, après que le fourbe Scar, son oncle, a tué son père et pris sa place.","Une belle animation, ainsi que de beaux décors", "Roger Allers", 6),
				new Room("Margou", 100, 50, "Dolby"), LocalDateTime.of(2021, Month.JUNE, 14, 30, 30, 40, 50000));
		sessionService.add(session);

		// session.setId(13);
		sessionService.update(session);

		sessionService.delete(session);

		sessionService.add(new Session(
				new Film("Pulp Fiction", 149, "VF", "Dolby", "Policier, Thriller", "L'odyssée sanglante et burlesque de petits malfrats dans la jungle de Hollywood à travers trois histoires qui s'entremêlent.","Un très bon film, du très grand Tarantino", "Quentin Tarantino", 12),
				new Room("Margou", 100, 50, "Dolby"), LocalDateTime.of(2018, Month.FEBRUARY, 3, 6, 30, 40, 50000)));

		System.out.println(sessionService.getAll());
	}

}
