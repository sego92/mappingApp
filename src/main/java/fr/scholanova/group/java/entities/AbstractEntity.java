package fr.scholanova.group.java.entities;

import java.io.Serializable;

import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.MappedSuperclass;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@MappedSuperclass
public abstract class AbstractEntity implements Serializable{
	@Id
	@GeneratedValue
	private Integer id;

}
