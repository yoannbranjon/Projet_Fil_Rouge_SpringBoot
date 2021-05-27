package fr.ibformaiton.CinemaMargoulin.Services;

import java.util.List;
import fr.ibformaiton.CinemaMargoulin.beans.Reservation;

/**
 * Gestion des Reservations
 * @author ib
 *
 */
public interface ReservationService {
	/***
	 * ajouter d'une reservation
	 * @param reservation reservation
	 */
	public void add(Reservation reservation);
	
	/**
	 * effacer une reservation
	 * @param reservation
	 */
	public void delete(Reservation reservation);
	
	/**
	 * Update une reservation
	 * @param reservation
	 */	
	public void update(Reservation reservation);
	
	public List<Reservation> getAll();
	
	public Reservation getById(Integer id);
	
}
