package fr.ibformaiton.CinemaMargoulin.Services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import fr.ibformaiton.CinemaMargoulin.DAO.FilmDAO;
import fr.ibformaiton.CinemaMargoulin.beans.Film;

/**
 * Gestion des films
 * @author ib
 *
 */
public interface FilmService {
	/***
	 * ajoute un film
	 * @param film film
	 */
	public void add(Film film);
	
	/**
	 * efface un film
	 * @param film
	 */
	public void delete(Film film);
	
	public void update(Film film);
	
	public List<Film> getAll();
	
	public Film getById(Integer id);
	
	
	
	
	

}
