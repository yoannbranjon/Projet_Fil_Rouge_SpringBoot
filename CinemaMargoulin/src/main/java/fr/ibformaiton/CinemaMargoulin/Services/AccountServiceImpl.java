package fr.ibformaiton.CinemaMargoulin.Services;

import java.util.List;
import javax.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import fr.ibformaiton.CinemaMargoulin.DAO.AccountDAO;
import fr.ibformaiton.CinemaMargoulin.beans.Account;


@Service
public class AccountServiceImpl implements AccountService{

	@Autowired
	AccountDAO accountDAO;
	
	@Override
	@Transactional
	public void add(Account account) {
		accountDAO.save(account);
		
	}

	@Override
	@Transactional
	public void delete(Account account) {
		accountDAO.delete(account);

		
	}

	@Override
	@Transactional
	public void update(Account account) {
		accountDAO.save(account);

		
	}

	@Override
	@Transactional
	public List<Account> getAll() {
		return (List<Account>) accountDAO.findAll();

	}

	@Override
	@Transactional
	public Account getById(Integer id) {
		return accountDAO.findById(id).orElse(null);
	
	}

}
