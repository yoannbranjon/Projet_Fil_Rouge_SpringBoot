package fr.ibformaiton.CinemaMargoulin.DAO;

import org.springframework.data.repository.CrudRepository;
import fr.ibformaiton.CinemaMargoulin.beans.Users;


public interface UsersDAO extends CrudRepository<Users, Integer>{

}
