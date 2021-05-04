package fr.myproject.java;

import java.time.LocalDateTime;

public class Contenue_panier {
	
	private int nb_produits; 
	private LocalDateTime date_creation;
	private Float prix_total;
	
	
//	Constructor

	public Contenue_panier(int nb_produits, LocalDateTime date_creation, Float prix_total) {
		super();
		this.nb_produits = nb_produits;
		this.date_creation = date_creation;
		this.prix_total = prix_total;
	}

	
// Getters and setters	
	
	public int getNb_produits() {
		return nb_produits;
	}
	
	public void setNb_produits(int nb_produits) {
		this.nb_produits = nb_produits;
	}
	public LocalDateTime getDate_creation() {
		return date_creation;
	}
	public void setDate_creation(LocalDateTime date_creation) {
		this.date_creation = date_creation;
	}
	public Float getPrix_total() {
		return prix_total;
	}
	public void setPrix_total(Float prix_total) {
		this.prix_total = prix_total;
	}
}
