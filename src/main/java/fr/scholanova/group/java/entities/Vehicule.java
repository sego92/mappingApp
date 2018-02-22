package fr.scholanova.group.java.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Enumerated;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import org.springframework.stereotype.Component;

import fr.scholanova.group.java.enums.ModelEnum;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Component("vehicule")
@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
@ToString
@Entity
@Table(name="vehicule")
public class Vehicule extends AbstractEntity{/**
	 * 
	 */
	private static final long serialVersionUID = 9057800317518446437L;
	
	@ManyToOne
	@JoinColumn(name="ownerId", nullable=false)
	private User owner;
	
	@Enumerated
	private ModelEnum model;
	
	@Column
	private int year;
	

}
