package fr.myproject.java;

public class Type_paiement {
	
	private String Libelle;
	
	
//	Constructor
	
	public Type_paiement (String libelle) {
		super();
		Libelle = libelle;
	}


	
	
	
//	Getters and setters
	
	public String getLibelle() {
		return Libelle;
	}


	public void setLibelle(String libelle) {
		Libelle = libelle;
	}
}
