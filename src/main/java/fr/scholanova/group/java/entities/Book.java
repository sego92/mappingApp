package fr.scholanova.group.java.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import org.springframework.stereotype.Component;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Component("book")
@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
@ToString
@Entity
@Table(name="book")
public class Book extends AbstractEntity {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = -6968406588390145126L;
	
	@ManyToOne
	@JoinColumn(name="authorId", nullable=false)
	private User Author;
	
	@Column
	private String Title;

}
