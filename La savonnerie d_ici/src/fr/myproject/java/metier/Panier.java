package fr.myproject.java;


import java.time.LocalDateTime;

public class Panier {
	
	private Boolean Statut_reglement;
	private LocalDateTime Date_creation;
	private LocalDateTime Date_reglement;
	

	
	
	//	Constructor
	
	public Panier(Boolean statut_reglement, LocalDateTime date_creation, LocalDateTime date_reglement) {
		super();
		Statut_reglement = statut_reglement;
		Date_creation = date_creation;
		Date_reglement = date_reglement;
	}
	

	
	
	//	Getters and setters
	
	 
	public LocalDateTime getDate_reglement() {
		return Date_reglement;
	}
	
	public void setDate_reglement(LocalDateTime date_reglement) {
		Date_reglement = date_reglement;
	}
	public Boolean getStatut_reglement() {
		return Statut_reglement;
	}
	public void setStatut_reglement(Boolean statut_reglement) {
		Statut_reglement = statut_reglement;
	}
	public LocalDateTime getDate_creation() {
		return Date_creation;
	}
	public void setDate_creation(LocalDateTime date_creation) {
		Date_creation = date_creation;
	}
	
}
