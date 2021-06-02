package fr.ibformaiton.CinemaMargoulin.Services;
import java.util.List;

import fr.ibformaiton.CinemaMargoulin.beans.Contact;


/**
 * Gestion des Contacts
 * @author ib
 *
 */
public interface ContactService {

		/***
		 * ajoute un Contact
		 * @param Contact Contact
		 */
		public void add(Contact contact);
		
		/**
		 * efface un Contact
		 * @param Contact
		 */
		public void delete(Contact contact);
		
		public void update(Contact contact);
		
		public List<Contact> getAll();
		
		public Contact getById(Integer id);

		public void deleteContactById(int id);

}
