package fr.scholanova.group.java.dao;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.stereotype.Repository;

import fr.scholanova.group.java.entities.Vehicule;

@Repository("vehiculeDao")
public class VehiculeDaoImpl implements VehiculeDao {
	@PersistenceContext
	private EntityManager entityManager;

	@Override
	public void save(Vehicule vehicule) {
		entityManager.persist(vehicule);
		
	}

	@Override
	public void delete(Vehicule vehicule) {
		entityManager.remove(vehicule);
		
	}

	@Override
	public Vehicule read(Integer id) {
		return entityManager.find(Vehicule.class, id);
	}

}
