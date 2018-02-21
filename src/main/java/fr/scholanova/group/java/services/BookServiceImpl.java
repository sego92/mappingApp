package fr.scholanova.group.java.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import fr.scholanova.group.java.dao.BookDao;
import fr.scholanova.group.java.entities.Book;

@Service("bookService")
public class BookServiceImpl implements BookService {

	@Autowired
	private BookDao bookDao;
	
	/**
	 * {@inheritDoc}
	 */
	public void save(Book book) {
		bookDao.save(book);
	}
}
