package fr.ibformaiton.CinemaMargoulin;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import fr.ibformaiton.CinemaMargoulin.Services.FilmService;
import fr.ibformaiton.CinemaMargoulin.beans.Film;

@SpringBootTest
class CinemaMargoulinApplicationTests {

	@Autowired
	FilmService filmService;
	
	@Test
	void contextLoads() {
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

}
