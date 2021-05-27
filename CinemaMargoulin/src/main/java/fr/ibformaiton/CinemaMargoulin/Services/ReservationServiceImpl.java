package fr.ibformaiton.CinemaMargoulin.Services;

import java.util.List;
import javax.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import fr.ibformaiton.CinemaMargoulin.DAO.ReservationDAO;
import fr.ibformaiton.CinemaMargoulin.beans.Reservation;

@Service
public class ReservationServiceImpl implements ReservationService{

	@Autowired
	ReservationDAO reservationDAO;
	
	@Override
	@Transactional
	public void add(Reservation reservation) {
		reservationDAO.save(reservation);
				
	}

	@Override
	@Transactional
	public void delete(Reservation reservation) {
		reservationDAO.delete(reservation);
				
	}

	@Override
	@Transactional
	public void update(Reservation reservation) {
		reservationDAO.save(reservation);
		
	}

	@Override
	@Transactional
	public List<Reservation> getAll() {
		return (List<Reservation>) reservationDAO.findAll();

	}

	@Override
	@Transactional
	public Reservation getById(Integer id) {
		return reservationDAO.findById(id).orElse(null);
	}

}
