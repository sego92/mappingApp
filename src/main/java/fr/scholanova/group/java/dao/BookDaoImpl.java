package fr.scholanova.group.java.dao;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.stereotype.Repository;

import fr.scholanova.group.java.entities.Book;

@Repository("bookDao")
public class BookDaoImpl implements BookDao {
	@PersistenceContext
	private EntityManager entityManager;


	@Override
	public void save(Book book) {
		entityManager.persist(book);
		
	}

	@Override
	public void delete(Book book) {
		entityManager.remove(book);
		
	}

	@Override
	public Book read(Integer id) {
		return entityManager.find(Book.class, id);
	}

}
