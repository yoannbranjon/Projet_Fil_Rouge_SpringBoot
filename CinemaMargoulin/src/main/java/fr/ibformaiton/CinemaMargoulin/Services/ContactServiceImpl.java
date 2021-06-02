package fr.ibformaiton.CinemaMargoulin.Services;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import fr.ibformaiton.CinemaMargoulin.DAO.ContactDAO;
import fr.ibformaiton.CinemaMargoulin.beans.Contact;


@Service
public class ContactServiceImpl implements ContactService {
	
	@Autowired
	ContactDAO contactDAO;

	@Override
	@Transactional
	public void add(Contact contact) {
		contactDAO.save(contact);

		
	}

	@Override
	@Transactional
	public void delete(Contact contact) {
		contactDAO.delete(contact);

		
	}

	@Override
	@Transactional
	public void update(Contact contact) {
		contactDAO.save(contact);

		
	}

	@Override
	@Transactional
	public List<Contact> getAll() {

		return (List<Contact>) contactDAO.findAll();
	}

	@Override
	@Transactional
	public Contact getById(Integer id) {

		return contactDAO.findById(id).orElse(null);
	}

	@Override
	@Transactional
	public void deleteContactById(int id) {
		contactDAO.deleteById(id);
		
	}

}
