package fr.ibformaiton.CinemaMargoulin.Services;

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
	public void delete(Film film) {
		filmDAO.delete(film);
		
	}

	@Override
	@Transactional
	public void update(Film film) {
		filmDAO.save(film);
		
		
	}

	@Override
	@Transactional
	public List<Film> getAll() {
	
		return (List<Film>) filmDAO.findAll();
	}

	@Override
	@Transactional
	public Film getById(Integer id) {
	
		return filmDAO.findById(id).orElse(null);
	}
	

}
