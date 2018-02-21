package fr.scholanova.group.java.dao;


import fr.scholanova.group.java.entities.Address;
import fr.scholanova.group.java.entities.User;

public interface AddressDao {
	/**
	 * 
	 * @param address
	 */
	public void save(Address adress);
	
	/**
	 * 
	 * @param address
	 */
	public void delete(Address adress);
	
	/**
	 * 
	 * @param id
	 * @return
	 */
	public Address read(Integer id);

}
