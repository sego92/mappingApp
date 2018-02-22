package fr.scholanova.group.java.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import fr.scholanova.group.java.dao.VehiculeDao;
import fr.scholanova.group.java.entities.Vehicule;

@Service("vehiculeService")
public class VehiculeServiceImpl implements VehiculeService {

	@Autowired
	private VehiculeDao vehiculeDao;
	
	/**
	 * {@inheritDoc}
	 */
	public void save(Vehicule vehicule) {
		vehiculeDao.save(vehicule);
		
	}

}
