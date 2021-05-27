package fr.ibformaiton.CinemaMargoulin.Services;

import java.util.List;
import fr.ibformaiton.CinemaMargoulin.beans.Users;

/**
 * Gestion des Users
 * @author ib
 *
 */
public interface UsersService {
	/***
	 * ajouter d'un User
	 * @param User user
	 */
	public void add(Users users);
	
	/**
	 * effacer un User
	 * @param User
	 */
	public void delete(Users users);
	
	/**
	 * Update un User
	 * @param User
	 */	
	public void update(Users users);
	
	public List<Users> getAll();
	
	public Users getById(Integer id);

}
