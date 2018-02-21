package fr.scholanova.group.java.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name="address")
public class Address extends AbstractEntity {
	
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 6883609755337434622L;

	@Column
	private String street;
	
	@Column
	private String zipCode;
	
	@Column
	private String city;
}