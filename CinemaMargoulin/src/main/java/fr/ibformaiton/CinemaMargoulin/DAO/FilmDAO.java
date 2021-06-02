package fr.ibformaiton.CinemaMargoulin.DAO;


import org.springframework.data.repository.CrudRepository;

import fr.ibformaiton.CinemaMargoulin.beans.Film;




public interface FilmDAO extends CrudRepository<Film, Integer> {


}
