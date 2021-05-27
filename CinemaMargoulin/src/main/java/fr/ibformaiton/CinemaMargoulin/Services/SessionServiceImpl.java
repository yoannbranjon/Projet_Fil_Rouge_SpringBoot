package fr.ibformaiton.CinemaMargoulin.Services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import fr.ibformaiton.CinemaMargoulin.DAO.SessionDAO;
import fr.ibformaiton.CinemaMargoulin.beans.Session;

@Service
public class SessionServiceImpl implements SessionService{

	@Autowired
	SessionDAO sessionDAO;
	
	@Override
	public void add(Session session) {
		sessionDAO.save(session);
		
	}

	@Override
	public void delete(Session session) {
		sessionDAO.delete(session);
		
	}

	@Override
	public void update(Session session) {
		sessionDAO.save(session);
		
	}

	@Override
	public List<Session> getAll() {
		return (List<Session>) sessionDAO.findAll();

	}

	@Override
	public Session getById(Integer id) {
		return sessionDAO.findById(id).orElse(null);

	}

}
