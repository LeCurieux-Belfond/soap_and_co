package fr.myproject.java;

public class Produit {
	
 private String Nom_produit;
 private String Description_produit;
 private Float Prix_produit;


 
// Constructor
 
public Produit(String nom_produit, String description_produit, Float prix_produit) {
	super();
	Nom_produit = nom_produit;
	Description_produit = description_produit;
	Prix_produit = prix_produit;
}
// Getters and setters



public String getNom_produit() {
	return Nom_produit;
}



public void setNom_produit(String nom_produit) {
	Nom_produit = nom_produit;
}



public String getDescription_produit() {
	return Description_produit;
}



public void setDescription_produit(String description_produit) {
	Description_produit = description_produit;
}



public Float getPrix_produit() {
	return Prix_produit;
}



public void setPrix_produit(Float prix_produit) {
	Prix_produit = prix_produit;
}
 
 


}
