package fr.ibformaiton.CinemaMargoulin.DAO;

import org.springframework.data.repository.CrudRepository;
import fr.ibformaiton.CinemaMargoulin.beans.Session;


public interface SessionDAO extends CrudRepository<Session, Integer>{

}
