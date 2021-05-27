package fr.ibformaiton.CinemaMargoulin.Services;

import java.util.List;

import fr.ibformaiton.CinemaMargoulin.beans.Session;

/**
 * Gestion de seances
 * @author ib
 *
 */
public interface SessionService {
	/***
	 * ajouter d'une seance
	 * @param session session
	 */
	public void add(Session session);
	
	/**
	 * effacer d'une seance
	 * @param compte
	 */
	public void delete(Session session);
	
	/**
	 * Update d'une seance
	 * @param compte
	 */	
	public void update(Session session);
	
	public List<Session> getAll();
	
	public Session getById(Integer id);
}
