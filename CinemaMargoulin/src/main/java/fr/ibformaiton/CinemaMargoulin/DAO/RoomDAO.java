package fr.ibformaiton.CinemaMargoulin.DAO;

import org.springframework.data.repository.CrudRepository;
import fr.ibformaiton.CinemaMargoulin.beans.Room;

public interface RoomDAO extends CrudRepository<Room, Integer> {

}
