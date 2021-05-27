package fr.ibformaiton.CinemaMargoulin.Services;

import java.util.List;
import javax.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import fr.ibformaiton.CinemaMargoulin.DAO.TypesDAO;
import fr.ibformaiton.CinemaMargoulin.beans.Types;

@Service
public class TypesServiceImpl implements TypesService {
	
	@Autowired
	TypesDAO typesDAO;

	@Override
	@Transactional
	public void add(Types types) {
		typesDAO.save(types);

		
	}

	@Override
	@Transactional
	public void delete(Types types) {
		typesDAO.delete(types);
		
	}

	@Override
	@Transactional
	public void update(Types types) {
		typesDAO.save(types);
		
	}

	@Override
	@Transactional
	public List<Types> getAll() {
		return (List<Types>) typesDAO.findAll();

	}

	@Override
	@Transactional
	public Types getById(Integer id) {
		return typesDAO.findById(id).orElse(null);

	}

}
