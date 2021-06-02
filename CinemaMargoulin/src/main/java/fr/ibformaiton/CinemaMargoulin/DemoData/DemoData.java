package fr.ibformaiton.CinemaMargoulin.DemoData;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.Month;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.context.event.ApplicationReadyEvent;
import org.springframework.context.event.EventListener;
import org.springframework.stereotype.Component;

import fr.ibformaiton.CinemaMargoulin.DAO.FilmDAO;
import fr.ibformaiton.CinemaMargoulin.DAO.ReservationDAO;
import fr.ibformaiton.CinemaMargoulin.DAO.SessionDAO;
import fr.ibformaiton.CinemaMargoulin.beans.Account;
import fr.ibformaiton.CinemaMargoulin.beans.Film;
import fr.ibformaiton.CinemaMargoulin.beans.Reservation;
import fr.ibformaiton.CinemaMargoulin.beans.Room;
import fr.ibformaiton.CinemaMargoulin.beans.Session;
import fr.ibformaiton.CinemaMargoulin.beans.Users;

@Component
public class DemoData {
	
	
    @Autowired
    private FilmDAO filmDAO;
    @Autowired
    private SessionDAO sessionDAO;
    @Autowired
    private ReservationDAO reservationDAO;
    @EventListener
    public void appReady(ApplicationReadyEvent event) {
    	filmDAO.save(new Film("Forrest Gump", 140, "VO", "Dolby", "Comédie", "Quelques décennies d'histoire américaine, des années 1940 à la fin du XXème siècle, à travers le regard et l'étrange odyssée d'un homme simple et pur, Forrest Gump.", "Robert Zemeckis", 10));
    	filmDAO.save(new Film("La Liste de Schindler", 195, "VO", "Dolby", "Historique, Guerre", "Evocation des années de guerre d'Oskar Schindler, industriel autrichien rentré à Cracovie en 1939 avec les troupes allemandes. Il va, tout au long de la guerre, protéger des juifs en les faisant travailler dans sa fabrique.", "Steven Spielberg", 12));
    	filmDAO.save(new Film("La Ligne verte", 189, "VO", "Dolby", "Policier, Fantastique", "Paul Edgecomb, Gardien-chef du pénitencier de Cold Mountain en 1935, était chargé de veiller au bon déroulement des exécutions capitales. Parmi les prisonniers se trouvait un colosse du nom de John Coffey", "Frank Darabont", 12));
    	filmDAO.save(new Film("Le Seigneur des anneaux : le retour du roi", 201, "Vo", "Dolby", "Aventure, Fantastique", "Tandis que les ténèbres se répandent sur la Terre du Milieu, Aragorn se révèle être l'héritier caché des rois antiques. Quant à Frodon, toujours tenté par l'Anneau, il voyage à travers les contrées ennemies, se reposant sur Sam et Gollum", "Peter Jackson", 12));
    	filmDAO.save(new Film("Le Roi Lion", 89, "VF", "Dolby", "Animation", "Le long combat de Simba le lionceau pour accéder à son rang de roi des animaux, après que le fourbe Scar, son oncle, a tué son père et pris sa place.", "Roger Allers", 6));
    	filmDAO.save(new Film("Pulp Fiction", 149, "VF", "Dolby", "Policier, Thriller", "L'odyssée sanglante et burlesque de petits malfrats dans la jungle de Hollywood à travers trois histoires qui s'entremêlent.", "Quentin Tarantino", 12));
    	
       	sessionDAO.save(new Session(new Film("Forrest Gump", 140, "VO", "Dolby", "Comédie", "Quelques décennies d'histoire américaine, des années 1940 à la fin du XXème siècle, à travers le regard et l'étrange odyssée d'un homme simple et pur, Forrest Gump.", "Robert Zemeckis", 10),
    				new Room("MargouOne", 100, 50, "Dolby"), LocalDateTime.of(2021, Month.JUNE, 01, 16, 30, 00, 00000)));
        	
        sessionDAO.save(new Session(new Film("La Liste de Schindler", 195,"VO", "Dolby", "Historique, Guerre", "Evocation des années de guerre d'Oskar Schindler, industriel autrichien rentré à Cracovie en 1939 avec les troupes allemandes. Il va, tout au long de la guerre, protéger des juifs en les faisant travailler dans sa fabrique.", "Steven Spielberg", 12),
    				new Room("MargouTwo", 180, 120, "Dolby"), LocalDateTime.of(2021, Month.JUNE, 01, 16, 30, 00, 00000)));
        	
        sessionDAO.save(new Session(new Film("La Ligne verte", 189, "VO", "Dolby", "Policier, Fantastique", "Paul Edgecomb, Gardien-chef du pénitencier de Cold Mountain en 1935, était chargé de veiller au bon déroulement des exécutions capitales. Parmi les prisonniers se trouvait un colosse du nom de John Coffey", "Frank Darabont", 12),
    				new Room("MargouThree", 180, 120, "Dolby"), LocalDateTime.of(2021, Month.JUNE, 01, 16, 30, 00, 00000)));
        
        sessionDAO.save(new Session(new Film("Le Seigneur des anneaux : le retour du roi", 201, "VO", "Dolby", "Aventure, Fantastique", "Tandis que les ténèbres se répandent sur la Terre du Milieu, Aragorn se révèle être l'héritier caché des rois antiques. Quant à Frodon, toujours tenté par l'Anneau, il voyage à travers les contrées ennemies, se reposant sur Sam et Gollum", "Peter Jackson", 12),
				new Room("MargouFour", 100, 80, "Dolby"), LocalDateTime.of(2021, Month.JUNE, 02, 16, 00, 00, 00000)));
        
        sessionDAO.save(new Session(new Film("Le Roi Lion", 89, "VF", "Dolby", "Animation", "Le long combat de Simba le lionceau pour accéder à son rang de roi des animaux, après que le fourbe Scar, son oncle, a tué son père et pris sa place.", "Roger Allers", 6),
				new Room("MargouFive", 150, 110, "Dolby"), LocalDateTime.of(2021, Month.JUNE, 02, 12, 30, 00, 00000)));
        
        sessionDAO.save(new Session(new Film("Pulp Fiction", 149, "VF", "Dolby", "Policier, Thriller", "L'odyssée sanglante et burlesque de petits malfrats dans la jungle de Hollywood à travers trois histoires qui s'entremêlent.", "Quentin Tarantino", 12),
				new Room("MargouSix", 150, 110, "Dolby"), LocalDateTime.of(2021, Month.JUNE, 02, 21, 00, 00, 00000)));
        
        
        
        reservationDAO.save(new Reservation("YoannResa", 9,
				new Session(new Film("La Liste de Schindler", 195,"VO", "Dolby", "Historique, Guerre", "Evocation des années de guerre d'Oskar Schindler, industriel autrichien rentré à Cracovie en 1939 avec les troupes allemandes. Il va, tout au long de la guerre, protéger des juifs en les faisant travailler dans sa fabrique.", "Steven Spielberg", 12),
	    				new Room("MargouTwo", 180, 120, "Dolby"), LocalDateTime.of(2021, Month.JUNE, 01, 16, 30, 00, 00000)),
				new Users("Yoann", "Bronjon", new Account("yoann_b@gmail.com", "bis"), LocalDate.of(1992, 9, 10),"22, rue de la Tannerie", 44100,
						"Nantes"),
				1));
        
        
        reservationDAO.save(new Reservation("NezhaResa", 9,
				new Session(new Film("Forrest Gump", 140, "VO", "Dolby", "Comédie", "Quelques décennies d'histoire américaine, des années 1940 à la fin du XXème siècle, à travers le regard et l'étrange odyssée d'un homme simple et pur, Forrest Gump.", "Robert Zemeckis", 10),
	    				new Room("MargouOne", 100, 50, "Dolby"), LocalDateTime.of(2021, Month.JUNE, 01, 16, 30, 00, 00000)),
				new Users("Nezha", "Bouhafs", new Account("nezha_b@gmail.com", "biss"), LocalDate.of(1989, 4, 17),"18, rue de la Tannerie", 44100,
						"Nantes"),
				1));
        
        reservationDAO.save(new Reservation("HughResa", 9,
				new Session(new Film("Pulp Fiction", 149, "VF", "Dolby", "Policier, Thriller", "L'odyssée sanglante et burlesque de petits malfrats dans la jungle de Hollywood à travers trois histoires qui s'entremêlent.", "Quentin Tarantino", 12),
						new Room("MargouSix", 150, 110, "Dolby"), LocalDateTime.of(2021, Month.JUNE, 02, 21, 00, 00, 00000)),
				new Users("Hugh", "Oyono", new Account("hygh_o@gmail.com", "bises"), LocalDate.of(1989, 1, 1),"18, rue de la bastille", 44100,
						"Nantes"),
				2));
        
        reservationDAO.save(new Reservation("HolyResa", 7,
        		new Session(new Film("Le Roi Lion", 89, "VF", "Dolby", "Animation", "Le long combat de Simba le lionceau pour accéder à son rang de roi des animaux, après que le fourbe Scar, son oncle, a tué son père et pris sa place.", "Roger Allers", 6),
        				new Room("MargouFive", 150, 110, "Dolby"), LocalDateTime.of(2021, Month.JUNE, 02, 12, 30, 00, 00000)),
				new Users("Holy", "razafin", new Account("holy_r@gmail.com", "bisess"), LocalDate.of(1989, 2, 2),"10, rue de la liberté", 44100,
						"Nantes"),
				2));
        
        reservationDAO.save(new Reservation("RenaudResa", 9,
        		new Session(new Film("La Ligne verte", 189, "VO", "Dolby", "Policier, Fantastique", "Paul Edgecomb, Gardien-chef du pénitencier de Cold Mountain en 1935, était chargé de veiller au bon déroulement des exécutions capitales. Parmi les prisonniers se trouvait un colosse du nom de John Coffey", "Frank Darabont", 12),
        				new Room("MargouThree", 180, 120, "Dolby"), LocalDateTime.of(2021, Month.JUNE, 01, 16, 30, 00, 00000)),
				new Users("Renaud", "Tougron", new Account("renaud_t@gmail.com", "bisess"), LocalDate.of(1988, 3, 8),"15, rue de la poisse", 44100,
						"Nantes"),
				1));
        
        reservationDAO.save(new Reservation("YousraResa", 9,
        		new Session(new Film("Le Seigneur des anneaux : le retour du roi", 201, "VO", "Dolby", "Aventure, Fantastique", "Tandis que les ténèbres se répandent sur la Terre du Milieu, Aragorn se révèle être l'héritier caché des rois antiques. Quant à Frodon, toujours tenté par l'Anneau, il voyage à travers les contrées ennemies, se reposant sur Sam et Gollum", "Peter Jackson", 12),
        				new Room("MargouFour", 100, 80, "Dolby"), LocalDateTime.of(2021, Month.JUNE, 02, 16, 00, 00, 00000)),
				new Users("Yousra", "Cheki", new Account("Yousra_c@gmail.com", "bisess"), LocalDate.of(1988, 8, 8),"02, rue du Maroc", 44100,
						"Nantes"),
				1));
        
    }
    

	
 
    
    
}