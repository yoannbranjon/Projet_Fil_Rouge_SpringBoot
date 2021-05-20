package fr.ibformaiton.CinemaMargoulin.Services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import fr.ibformaiton.CinemaMargoulin.DAO.RoomDAO;

@Service
public class RoomServiceImpl implements RoomService{
	
	@Autowired
	RoomDAO roomDAO;


}
