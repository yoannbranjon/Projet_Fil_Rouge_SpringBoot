package fr.ibformaiton.CinemaMargoulin.DemoData;


import java.time.LocalDateTime;
import java.time.Month;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.context.event.ApplicationReadyEvent;
import org.springframework.context.event.EventListener;
import org.springframework.stereotype.Component;
import fr.ibformaiton.CinemaMargoulin.DAO.ContactDAO;
import fr.ibformaiton.CinemaMargoulin.DAO.SessionDAO;
import fr.ibformaiton.CinemaMargoulin.beans.Contact;
import fr.ibformaiton.CinemaMargoulin.beans.Film;
import fr.ibformaiton.CinemaMargoulin.beans.Room;
import fr.ibformaiton.CinemaMargoulin.beans.Session;


@Component
public class DemoData {
	
	
//    @Autowired
//    private FilmDAO filmDAO;
    @Autowired
    private SessionDAO sessionDAO;
 //   @Autowired
 //   private ReservationDAO reservationDAO;
    @Autowired
    private ContactDAO contactDAO;
    @EventListener
    public void appReady(ApplicationReadyEvent event) {
    	
//    	filmDAO.save(new Film("Forrest Gump", 140, "VO", "Dolby", "Comédie", "Quelques décennies d'histoire américaine, des années 1940 à la fin du XXème siècle, à travers le regard et l'étrange odyssée d'un homme simple et pur, Forrest Gump.","Aussi émouvant que comique !", "Robert Zemeckis", 10));   	
//    	filmDAO.save(new Film("La Liste de Schindler", 195, "VO", "Dolby", "Historique, Guerre", "Evocation des années de guerre d'Oskar Schindler, industriel autrichien rentré à Cracovie en 1939 avec les troupes allemandes. Il va, tout au long de la guerre, protéger des juifs en les faisant travailler dans sa fabrique.","Un chef-d'oeuvre", "Steven Spielberg", 12));
//    	filmDAO.save(new Film("La Ligne verte", 189, "VO", "Dolby", "Policier, Fantastique", "Paul Edgecomb, Gardien-chef du pénitencier de Cold Mountain en 1935, était chargé de veiller au bon déroulement des exécutions capitales. Parmi les prisonniers se trouvait un colosse du nom de John Coffey","un film qu'on ne peut pas oublier,tant il est magnifique", "Frank Darabont", 12));
//    	filmDAO.save(new Film("Le Seigneur des anneaux : le retour du roi", 201, "Vo", "Dolby", "Aventure, Fantastique", "Tandis que les ténèbres se répandent sur la Terre du Milieu, Aragorn se révèle être l'héritier caché des rois antiques. Quant à Frodon, toujours tenté par l'Anneau, il voyage à travers les contrées ennemies, se reposant sur Sam et Gollum","les décors sont juste somptueux, les acteurs excellents", "Peter Jackson", 12));
//    	filmDAO.save(new Film("Le Roi Lion", 89, "VF", "Dolby", "Animation", "Le long combat de Simba le lionceau pour accéder à son rang de roi des animaux, après que le fourbe Scar, son oncle, a tué son père et pris sa place.","Une belle animation, ainsi que de beaux décors", "Roger Allers", 6));
//    	filmDAO.save(new Film("Pulp Fiction", 149, "VF", "Dolby", "Policier, Thriller", "L'odyssée sanglante et burlesque de petits malfrats dans la jungle de Hollywood à travers trois histoires qui s'entremêlent.","Un très bon film, du très grand Tarantino", "Quentin Tarantino", 12));
//    	

        
        
        
		
//		  reservationDAO.save(new Reservation("YoannResa", 9, new Session(new
//		  Film("La Liste de Schindler", 195,"VO",
//		  "https://fr.web.img6.acsta.net/pictures/19/03/14/10/37/5927961.jpg",
//		  "Historique, Guerre",
//		  "Evocation des années de guerre d'Oskar Schindler, industriel autrichien rentré à Cracovie en 1939 avec les troupes allemandes. Il va, tout au long de la guerre, protéger des juifs en les faisant travailler dans sa fabrique."
//		  ,"Un chef-d'oeuvre", "Steven Spielberg", 12), new Room("MargouTwo", 180, 120,
//		  "Dolby"), LocalDateTime.of(2021, Month.JUNE, 01, 16, 30, 00, 00000)), new
//		  Users("Yoann", "Bronjon", new Account("yoann_b@gmail.com", "bis"),
//		  LocalDate.of(1992, 9, 10),"22, rue de la Tannerie", 44100, "Nantes"), 1));
//		  
//		  reservationDAO.save(new Reservation("NezhaResa", 9, new Session(new
//		  Film("Forrest Gump", 140, "VO",
//		  "https://fr.web.img4.acsta.net/pictures/15/10/13/15/12/514297.jpg",
//		  "Comédie",
//		  "Quelques décennies d'histoire américaine, des années 1940 à la fin du XXème siècle, à travers le regard et l'étrange odyssée d'un homme simple et pur, Forrest Gump."
//		  ,"Aussi émouvant que comique !", "Robert Zemeckis", 10), new
//		  Room("MargouOne", 100, 50, "Dolby"), LocalDateTime.of(2021, Month.JUNE, 01,
//		  16, 30, 00, 00000)), new Users("Nezha", "Bouhafs", new
//		  Account("nezha_b@gmail.com", "biss"), LocalDate.of(1989, 4,
//		  17),"18, rue de la Tannerie", 44100, "Nantes"), 1)); 
//		  reservationDAO.save(new Reservation("HughResa", 9, new Session(new Film("Pulp Fiction", 149, "VO",
//		  "https://forum.sanctuary.fr/uploads/default/original/3X/8/2/8250d839854402501f9df91b10932ac178c25505.jpg",
//		  "Policier, Thriller",
//		  "L'odyssée sanglante et burlesque de petits malfrats dans la jungle de Hollywood à travers trois histoires qui s'entremêlent."
//		  , "Un très bon film, du très grand Tarantino", "Quentin Tarantino", 12), new
//		  Room("MargouSix", 150, 110, "Dolby"), LocalDateTime.of(2021, Month.JUNE, 02,
//		  21, 00, 00, 00000)), new Users("Hugh", "Oyono", new
//		  Account("hygh_o@gmail.com", "bises"), LocalDate.of(1989, 1,
//		  1),"18, rue de la bastille", 44100, "Nantes"), 2)); 
//		  
//		  reservationDAO.save(new
//		  Reservation("HolyResa", 7, new Session(new Film("Le Roi Lion", 89, "VF",
//		  "https://karoo.me/wp-content/uploads/2020/04/le-roi-lion.jpg", "Animation",
//		  "Le long combat de Simba le lionceau pour accéder à son rang de roi des animaux, après que le fourbe Scar, son oncle, a tué son père et pris sa place."
//		  ,"Une belle animation, ainsi que de beaux décors", "Roger Allers", 6), new
//		  Room("MargouFive", 150, 110, "Dolby"), LocalDateTime.of(2021, Month.JUNE, 02,
//		  12, 30, 00, 00000)), new Users("Holy", "razafin", new
//		  Account("holy_r@gmail.com", "bisess"), LocalDate.of(1989, 2,
//		  2),"10, rue de la liberté", 44100, "Nantes"), 2)); 
//		  
//		  reservationDAO.save(new
//		  Reservation("RenaudResa", 9, new Session(new Film("La Ligne verte", 189,
//		  "VO", "https://fr.web.img4.acsta.net/medias/nmedia/18/66/15/78/19254683.jpg",
//		  "Policier, Fantastique",
//		  "Paul Edgecomb, Gardien-chef du pénitencier de Cold Mountain en 1935, était chargé de veiller au bon déroulement des exécutions capitales. Parmi les prisonniers se trouvait un colosse du nom de John Coffey"
//		  ,"un film qu'on ne peut pas oublier,tant il est magnifique",
//		  "Frank Darabont", 12), new Room("MargouThree", 180, 120, "Dolby"),
//		  LocalDateTime.of(2021, Month.JUNE, 01, 16, 30, 00, 00000)), new
//		  Users("Renaud", "Tougron", new Account("renaud_t@gmail.com", "bisess"),
//		  LocalDate.of(1988, 3, 8),"15, rue de la poisse", 44100, "Nantes"), 1));
//		  
//		  reservationDAO.save(new Reservation("YousraResa", 9, new Session(new
//		  Film("Le Seigneur des anneaux : le retour du roi", 201, "VO",
//		  "https://fr.web.img3.acsta.net/medias/nmedia/18/35/14/33/18366630.jpg",
//		  "Aventure, Fantastique",
//		  "Tandis que les ténèbres se répandent sur la Terre du Milieu, Aragorn se révèle être l'héritier caché des rois antiques. Quant à Frodon, toujours tenté par l'Anneau, il voyage à travers les contrées ennemies, se reposant sur Sam et Gollum"
//		  ,"les décors sont juste somptueux, les acteurs excellents", "Peter Jackson",
//		  12), new Room("MargouFour", 100, 80, "Dolby"), LocalDateTime.of(2021,
//		  Month.JUNE, 02, 16, 00, 00, 00000)), new Users("Yousra", "Cheki", new
//		  Account("Yousra_c@gmail.com", "bisess"), LocalDate.of(1988, 8,
//		  8),"02, rue du Maroc", 44100, "Nantes"), 1));
		 
        
        contactDAO.save(new Contact("Yoann", "Bron", "Yoannb@gmail.com", "Doléance : je voudrais plus d'animés Japonais SVP!"
				));
        
        contactDAO.save(new Contact("Nezha", "bouhafs", "bouhafsn@gmail.com", "Doléance : je voudrais plus de séance le matin svp!"));
        
        
        sessionDAO.save(new Session(new
      		  Film("La Liste de Schindler", 195,"VO",
      		  "https://fr.web.img6.acsta.net/pictures/19/03/14/10/37/5927961.jpg",
      		  "Historique, Guerre",
      		  "Evocation des années de guerre d'Oskar Schindler, industriel autrichien rentré à Cracovie en 1939 avec les troupes allemandes. Il va, tout au long de la guerre, protéger des juifs en les faisant travailler dans sa fabrique."
      		  ,"Un chef-d'oeuvre", "Steven Spielberg", 12), new Room("MargouTwo", 180, 120,
      		  "Dolby"), LocalDateTime.of(2021, Month.JUNE, 01, 16, 30, 00, 00000)));
        
        
        sessionDAO.save(new Session(new
      		  Film("Forrest Gump", 140, "VO",
      		  "https://fr.web.img4.acsta.net/pictures/15/10/13/15/12/514297.jpg",
      		  "Comédie",
      		  "Quelques décennies d'histoire américaine, des années 1940 à la fin du XXème siècle, à travers le regard et l'étrange odyssée d'un homme simple et pur, Forrest Gump."
      		  ,"Aussi émouvant que comique !", "Robert Zemeckis", 10), new
      		  Room("MargouOne", 100, 50, "Dolby"), LocalDateTime.of(2021, Month.JUNE, 01,
      		  16, 30, 00, 00000)));
        
        sessionDAO.save(new Session(new Film("Pulp Fiction", 149, "VO",
      		  "https://forum.sanctuary.fr/uploads/default/original/3X/8/2/8250d839854402501f9df91b10932ac178c25505.jpg",
      		  "Policier, Thriller",
      		  "L'odyssée sanglante et burlesque de petits malfrats dans la jungle de Hollywood à travers trois histoires qui s'entremêlent."
      		  , "Un très bon film, du très grand Tarantino", "Quentin Tarantino", 12), new
      		  Room("MargouSix", 150, 110, "Dolby"), LocalDateTime.of(2021, Month.JUNE, 02,
      		  21, 00, 00, 00000)));
        
        sessionDAO.save(new Session(new Film("Le Roi Lion", 89, "VF",
      		  "https://karoo.me/wp-content/uploads/2020/04/le-roi-lion.jpg", "Animation",
    		  "Le long combat de Simba le lionceau pour accéder à son rang de roi des animaux, après que le fourbe Scar, son oncle, a tué son père et pris sa place."
    		  ,"Une belle animation, ainsi que de beaux décors", "Roger Allers", 6), new
    		  Room("MargouFive", 150, 110, "Dolby"), LocalDateTime.of(2021, Month.JUNE, 02,
    		  12, 30, 00, 00000)));
        
        sessionDAO.save(new Session(new Film("La Ligne verte", 189,
      		  "VO", "https://fr.web.img4.acsta.net/medias/nmedia/18/66/15/78/19254683.jpg",
    		  "Policier, Fantastique",
    		  "Paul Edgecomb, Gardien-chef du pénitencier de Cold Mountain en 1935, était chargé de veiller au bon déroulement des exécutions capitales. Parmi les prisonniers se trouvait un colosse du nom de John Coffey"
    		  ,"un film qu'on ne peut pas oublier,tant il est magnifique",
    		  "Frank Darabont", 12), new Room("MargouThree", 180, 120, "Dolby"),
    		  LocalDateTime.of(2021, Month.JUNE, 01, 16, 30, 00, 00000)));
        
        sessionDAO.save(new Session(new Film("Le Seigneur des anneaux : le retour du roi", 201, "VO",
      				  "https://fr.web.img3.acsta.net/medias/nmedia/18/35/14/33/18366630.jpg",
      				  "Aventure, Fantastique",
      				  "Tandis que les ténèbres se répandent sur la Terre du Milieu, Aragorn se révèle être l'héritier caché des rois antiques. Quant à Frodon, toujours tenté par l'Anneau, il voyage à travers les contrées ennemies, se reposant sur Sam et Gollum"
      				  ,"les décors sont juste somptueux, les acteurs excellents", "Peter Jackson",
      				  12), new Room("MargouFour", 100, 80, "Dolby"), LocalDateTime.of(2021,
      				  Month.JUNE, 02, 16, 00, 00, 00000)));
        
        sessionDAO.save(new Session(new
      		  Film("Django Unchained", 164, "VO",
      				  "https://actualites.ecoledeslettres.fr/wp-content/uploads/2013/01/quentin-tarentino-django-unchained.jpg",
      				  "Western",
      				  "Le parcours d'un chasseur de prime allemand et d'un homme noir pour retrouver la femme de ce dernier retenue en esclavage par le propriétaire d'une plantation"
      				  ,"les acteurs excellents", "Quentin Tarantino",
      				  12), new Room("Margoufive", 100, 80, "Dolby"), LocalDateTime.of(2021,
      				  Month.JUNE, 05, 16, 00, 00, 00000)));
        
        sessionDAO.save(new Session(new
        		  Film("Star Wars : Episode V - L'Empire contre-attaque", 124, "VF",
          				  "https://bddi.2dcom.fr/libriweb.php?ean=9782756072753",
          				  "Aventure, Science Fiction",
          				  "Malgré la destruction de l'Etoile Noire, l'Empire maintient son emprise sur la galaxie, et poursuit sans relâche sa lutte contre l'Alliance rebelle."
          				  ,"Ce nouvel épisode de la Guerre des étoiles est digne", "Irvin Kershner",
          				  12), new Room("MargouSix", 100, 80, "Dolby"), LocalDateTime.of(2021,
          				  Month.JUNE, 05, 16, 00, 00, 00000)));
        
        sessionDAO.save(new Session(new
      		  Film("Your Name", 110, "VO",
      				  "https://www.avoir-alire.com/IMG/arton34460.jpg",
      				  "Animation",
      				  "Mitsuha, adolescente coincée dans une famille traditionnelle, rêve de quitter ses montagnes natales pour découvrir la vie trépidante de Tokyo."
      				  ,"Les personnages sont attachants et l'histoire est intéressante", "Makoto Shinkai",
      				  12), new Room("MargouSeven", 100, 80, "Dolby"), LocalDateTime.of(2021,
      				  Month.JUNE, 05, 18, 00, 00, 00000)));
        
        sessionDAO.save(new Session(new
        		  Film("Parasite", 132, "VO",
          				  "https://fr.web.img6.acsta.net/pictures/20/02/12/13/58/3992754.jpg",
          				  "Thriller",
          				  "Toute la famille de Ki-taek est au chômage, et s’intéresse fortement au train de vie de la richissime famille Park."
          				  ,"Le scénario est très bien écrit", "Bong Joon Ho",
          				  12), new Room("Margoueight", 100, 80, "Dolby"), LocalDateTime.of(2021,
          				  Month.JUNE, 05, 18, 00, 00, 00000)));
        
        sessionDAO.save(new Session(new
      		  Film("Inception", 148, "VO",
      				  "https://fr.web.img2.acsta.net/medias/nmedia/18/72/34/14/19476654.jpg",
      				  "Science Fiction",
      				  "Au lieu de subtiliser un rêve, un voleur expérimenté et son équipe doivent faire l'inverse : implanter une idée dans l'esprit d'un individu."
      				  ,"C'est fou ce qu'on aime détester Christopher Nolan", "Christopher Nolan",
      				  12), new Room("Margoueight", 100, 80, "Dolby"), LocalDateTime.of(2021,
      				  Month.JUNE, 05, 16, 00, 00, 00000)));
        
        sessionDAO.save(new Session(new
        		  Film("Le Kid", 52, "VO",
          				  "http://static.cotecine.fr/af/LE%20KID.JPG",
          				  "Comédie",
          				  "Lâchée par son amant, une jeune femme abandonne son enfant. Charlot le vagabond le recueille."
          				  ,"Décidément le temps ne semble pas avoir d'emprise sur Charlie Chaplin et ses oeuvres.", "Charles Chaplin",
          				  12), new Room("Margoueight", 100, 80, "Dolby"), LocalDateTime.of(2021,
          				  Month.JUNE, 06, 16, 00, 00, 00000)));
        
        sessionDAO.save(new Session(new
      		  Film("Princesse Mononoké", 135, "VF",
      				  "https://images-na.ssl-images-amazon.com/images/I/8113Djr%2BUBL._AC_SL1500_.jpg",
      				  "Animation",
      				  "Au XVe siècle, durant l'ère Muromachi, la forêt japonaise, jadis protégée par des animaux géants, se dépeuple à cause de l'homme."
      				  ,"Outre l'intelligence de son propos, Princesse Mononoke est aussi la plus belle réussite formelle de Miyazaki.", "Hayao Miyazaki",
      				  12), new Room("Margoueight", 100, 80, "Dolby"), LocalDateTime.of(2021,
      				  Month.JUNE, 06, 10, 00, 00, 00000)));
        
        sessionDAO.save(new Session(new
        		  Film("Bienvenue à Zombieland", 148, "VF",
          				  "https://i2.wp.com/bullesdeculture.com/bdc-content/uploads/2009/12/bienvenue-a-zombieland-zombieland-de-ruben-fleischer-affiche.jpg",
          				  "Epouvante-horreur",
          				  "Dans un monde infesté de zombies, quatre personnes doivent relever deux défis impossibles : survivre et apprendre à s'entendre."
          				  ,"un véritable régal fantasticophile, foisonnant d'idées folles et de péripéties endiablées.", "Ruben Fleischer",
          				  16), new Room("Margoueight", 100, 80, "Dolby"), LocalDateTime.of(2021,
          				  Month.JUNE, 04, 18, 00, 00, 00000)));
        
        sessionDAO.save(new Session(new
      		  Film("Le Labyrinthe de Pan", 112, "VF",
      				  "https://fr.web.img2.acsta.net/medias/nmedia/18/36/23/74/18680999.jpg",
      				  "Fantastique",
      				  "Au coeur de l'Espagne franquiste, une jeune fille rencontre une créature magique au centre d'un labyrinthe."
      				  ,"C'est sans doute une des plus belles choses qui soit arrivé au cinéma cette année", " Guillermo del Toro",
      				  16), new Room("Margoueight", 100, 80, "Dolby"), LocalDateTime.of(2021,
      				  Month.JUNE, 07, 16, 00, 00, 00000)));
        
        
        
    }
    

	
 
    
    
}
