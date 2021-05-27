package fr.ibformaiton.CinemaMargoulin.Services;

import java.util.List;
import fr.ibformaiton.CinemaMargoulin.beans.Types;

/**
 * Gestion des Type de film
 * @author ib
 *
 */
public interface TypesService {
	/***
	 * ajouter d'un Type de film
	 * @param type type
	 */
	public void add(Types types);
	
	/**
	 * effacer Type de film
	 * @param Type
	 */
	public void delete(Types types);
	
	/**
	 * Update Type de film
	 * @param Type
	 */	
	public void update(Types types);
	
	public List<Types> getAll();
	
	public Types getById(Integer id);
	

}
