package fr.ibformaiton.CinemaMargoulin.DAO;

import org.springframework.data.repository.CrudRepository;

import fr.ibformaiton.CinemaMargoulin.beans.Contact;


public interface ContactDAO  extends CrudRepository<Contact, Integer> {

}
