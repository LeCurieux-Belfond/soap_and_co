package fr.myproject.java;

import java.time.LocalDate;

public class Client {
	private String Nom;
	private String Prenom;
	private String Email;
	private String Mdp;
	private String Adresse;
	private int Code_postal;
	private String Ville;
	private int Num_tel;
	private LocalDate Date_de_naissance;
	
//	Constructor
	
	public Client(String nom, String prenom, String email, String mdp, String adresse, int code_postal, String ville,
			int num_tel, LocalDate date_de_naissance) {
		super();
		Nom = nom;
		Prenom = prenom;
		Email = email;
		Mdp = mdp;
		Adresse = adresse;
		Code_postal = code_postal;
		Ville = ville;
		Num_tel = num_tel;
		Date_de_naissance = date_de_naissance;
	}
	
	
//	Getters and setters
	
	public String getNom() {
		return Nom;
	}
	

	public void setNom(String nom) {
		Nom = nom;
	}
	public String getPrenom() {
		return Prenom;
	}
	public void setPrenom(String prenom) {
		Prenom = prenom;
	}
	public String getEmail() {
		return Email;
	}
	public void setEmail(String email) {
		Email = email;
	}
	public String getMdp() {
		return Mdp;
	}
	public void setMdp(String mdp) {
		Mdp = mdp;
	}
	public String getAdresse() {
		return Adresse;
	}
	public void setAdresse(String adresse) {
		Adresse = adresse;
	}
	public int getCode_postal() {
		return Code_postal;
	}
	public void setCode_postal(int code_postal) {
		Code_postal = code_postal;
	}
	public String getVille() {
		return Ville;
	}
	public void setVille(String ville) {
		Ville = ville;
	}
	public int getNum_tel() {
		return Num_tel;
	}
	public void setNum_tel(int num_tel) {
		Num_tel = num_tel;
	}
	public LocalDate getDate_de_naissance() {
		return Date_de_naissance;
	}
	public void setDate_de_naissance(LocalDate date_de_naissance) {
		Date_de_naissance = date_de_naissance;
	}
	
	
}
