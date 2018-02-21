package fr.scholanova.group.java.dao;

import fr.scholanova.group.java.entities.Book;
import fr.scholanova.group.java.entities.User;

public interface BookDao {
	/**
	 * 
	 * @param book
	 */
	public void save(Book book);
	
	/**
	 * 
	 * @param book
	 */
	public void delete(Book book);
	
	/**
	 * 
	 * @param id
	 * @return
	 */
	public Book read(Integer id);

}
