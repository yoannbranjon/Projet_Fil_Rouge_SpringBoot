package fr.ibformaiton.CinemaMargoulin.Services;

import java.util.List;
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
	
	public void add(List<Film> films);
	
	/**
	 * efface un film
	 * @param film
	 */
	public void delete(Film film);
	
	public void updateFilm(Film film);
	
	public List<Film> getAll();
	
	public Film getFilmById(Integer id);

	public void deleteFilmById(int id);

	public List<String> getAllNameFilms();


	
	
	
	
	

}
