package fr.scholanova.group.java.dao;

import fr.scholanova.group.java.entities.Vehicule;

public interface VehiculeDao {
	
	/**
	 * 
	 * @param vehicule
	 */
	public void save(Vehicule vehicule);
	
	/**
	 * 
	 * @param vehicule
	 */
	public void delete(Vehicule vehicule);
	
	/**
	 * 
	 * @param id
	 * @return
	 */
	public Vehicule read(Integer id);

}
