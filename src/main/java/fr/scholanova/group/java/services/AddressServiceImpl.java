package fr.scholanova.group.java.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import fr.scholanova.group.java.dao.AddressDao;
import fr.scholanova.group.java.dao.UserDao;
import fr.scholanova.group.java.entities.Address;
import fr.scholanova.group.java.entities.User;

@Service("addressService")
public class AddressServiceImpl implements AddressService{
	@Autowired
	private AddressDao addressDao;
	
	/**
	 * {@inheritDoc}
	 */
	public void save(Address address) {
		addressDao.save(address);
	}

}
