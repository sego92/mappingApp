package fr.scholanova.group.java.dao;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.stereotype.Repository;

import fr.scholanova.group.java.entities.Address;

@Repository("addressDao")
public class AddressDaoImpl implements AddressDao{
	@PersistenceContext
	private EntityManager entityManager;

	/**
	 * {@inheritDoc}
	 */
	public void save(Address address) {
		entityManager.persist(address);
	}

	/**
	 * {@inheritDoc}
	 */
	public void delete(Address address) {
		entityManager.remove(address);
	}

	/**
	 * {@inheritDoc}
	 */
	public Address read(Integer id) {
		return entityManager.find(Address.class, id);
	}

}
