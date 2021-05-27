package fr.ibformaiton.CinemaMargoulin.DAO;

import org.springframework.data.repository.CrudRepository;

import fr.ibformaiton.CinemaMargoulin.beans.Reservation;


public interface ReservationDAO extends CrudRepository<Reservation, Integer>{

}
