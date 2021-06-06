package fr.ibformaiton.CinemaMargoulin.Services;

import java.util.List;
import javax.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import fr.ibformaiton.CinemaMargoulin.DAO.RoomDAO;
import fr.ibformaiton.CinemaMargoulin.beans.Room;

@Service
public class RoomServiceImpl implements RoomService{
	
	@Autowired
	RoomDAO roomDAO;

	@Override
	@Transactional
	public void add(Room room) {
		roomDAO.save(room);
		
	}

	@Override
	@Transactional
	public void delete(Room room) {
		roomDAO.delete(room);

		
	}

	@Override
	@Transactional
	public void updateRoom(Room room) {
		roomDAO.save(room);

		
	}

	@Override
	@Transactional
	public List<Room> getAll() {
		return (List<Room>) roomDAO.findAll();

	}

	@Override
	@Transactional
	public Room getById(Integer id) {
		return roomDAO.findById(id).orElse(null);

	}

	@Override
	@Transactional
	public void deleteRoomById(int id) {

		roomDAO.deleteById(id);
	}

}
