package fr.ibformaiton.CinemaMargoulin.Services;

import java.util.List;
import fr.ibformaiton.CinemaMargoulin.beans.Room;


/**
 * Gestion des salles
 * @author ib
 *
 */
public interface RoomService {
	/***
	 * ajouter d'une salle
	 * @param Room room
	 */
	public void add(Room room);
	
	/**
	 * effacer une salle
	 * @param User
	 */
	public void delete(Room room);
	
	/**
	 * Update une salle
	 * @param Room
	 */	
	public void updateRoom(Room room);
	
	public List<Room> getAll();
	
	public Room getById(Integer id);

	public void deleteRoomById(int id);
	
}
