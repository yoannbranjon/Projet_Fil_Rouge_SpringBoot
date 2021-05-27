package fr.ibformaiton.CinemaMargoulin.DAO;

import org.springframework.data.repository.CrudRepository;
import fr.ibformaiton.CinemaMargoulin.beans.Account;


public interface AccountDAO extends CrudRepository<Account, Integer>{

}
