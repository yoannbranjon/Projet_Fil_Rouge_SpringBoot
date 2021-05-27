package fr.ibformaiton.CinemaMargoulin.Services;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import fr.ibformaiton.CinemaMargoulin.DAO.UsersDAO;
import fr.ibformaiton.CinemaMargoulin.beans.Users;

@Service
public class UsersServiceImpl implements UsersService {
	
	@Autowired
	UsersDAO usersDAO;

	@Override
	@Transactional
	public void add(Users users) {
		usersDAO.save(users);

		
	}

	@Override
	@Transactional
	public void delete(Users users) {
		usersDAO.delete(users);

		
	}

	@Override
	@Transactional
	public void update(Users users) {
		usersDAO.save(users);
		
	}

	@Override
	@Transactional
	public List<Users> getAll() {
		return (List<Users>) usersDAO.findAll();


	}

	@Override
	@Transactional
	public Users getById(Integer id) {
		return usersDAO.findById(id).orElse(null);

	}
	

}
