package fr.ibformaiton.CinemaMargoulin.Services;

import java.util.ArrayList;
import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import fr.ibformaiton.CinemaMargoulin.DAO.FilmDAO;
import fr.ibformaiton.CinemaMargoulin.beans.Film;

@Service
public class FilmServiceImpl implements FilmService {
	
	@Autowired
	FilmDAO filmDAO;

	@Override
	@Transactional
	public void add(Film film) {
		filmDAO.save(film);
		
	}
	
	@Override
	@Transactional
	public void add(List<Film> films) {
		filmDAO.saveAll(films);
		
	}


	@Override
	@Transactional
	public void delete(Film film) {
		filmDAO.delete(film);
		
	}

	@Override
	@Transactional
	public void updateFilm(Film film) {
		filmDAO.save(film);
		
	}
	
	@Override
	@Transactional
	public void updateFilmById(Film film, int id) {
		//Film film1 = filmDAO.findById(id).get();
		//film1.setName("MichMich");
		
		filmDAO.save(film);

	}

	@Override
	@Transactional
	public List<Film> getAll() {
	
		return (List<Film>) filmDAO.findAll();
	}

	@Override
	@Transactional
	public Film getFilmById(Integer id) {
	
		return filmDAO.findById(id).orElse(null);
	}
	
	@Override
	@Transactional
	public void deleteFilmById(int id) {

		filmDAO.deleteById(id);
	}

	@Override
	@Transactional
	public List<String> getAllNameFilms() {
		
		List<Film> filmsToExtractNames = (List<Film>) filmDAO.findAll();
		
		List<String> names = new ArrayList<String>();
		
		for (int i=0; i< filmsToExtractNames.size(); i++) {
			
			String name = filmsToExtractNames.get(i).getName();
			names.add(name);
		}
		
		return names;
		
	}


	

	

}
