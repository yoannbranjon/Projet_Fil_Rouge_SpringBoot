package fr.ibformaiton.CinemaMargoulin.DAO;

import org.springframework.data.repository.CrudRepository;

import fr.ibformaiton.CinemaMargoulin.beans.Film;

public interface RoomDAO extends CrudRepository<Film, Integer> {

}
