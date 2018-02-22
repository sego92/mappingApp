package fr.scholanova.group.java.enums;

public enum ModelEnum {
	Toyota ("T"),
	Renault ("R"),
	BMW ("B"),
	Fiat ("F");
	
	private String abbreviation;
	
	private ModelEnum (String abbreviation) {
		this.abbreviation = abbreviation;
	}
}
