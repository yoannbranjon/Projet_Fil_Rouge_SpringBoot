package fr.ibformaiton.CinemaMargoulin.Services;

import java.util.List;

import fr.ibformaiton.CinemaMargoulin.beans.Account;


/**
 * Gestion des comptes
 * @author ib
 *
 */
public interface AccountService {
	/***
	 * ajouter d'un compte
	 * @param account account
	 */
	public void add(Account account);
	
	/**
	 * effacer un compte
	 * @param compte
	 */
	public void delete(Account account);
	
	/**
	 * Update un compte
	 * @param compte
	 */	
	public void update(Account account);
	
	public List<Account> getAll();
	
	public Account getById(Integer id);
	
	
}
