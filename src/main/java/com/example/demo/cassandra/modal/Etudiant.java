package com.example.demo.cassandra.modal;

import org.springframework.data.cassandra.core.mapping.PrimaryKey;
import org.springframework.data.cassandra.core.mapping.Table;

@Table
public class Etudiant {

	@PrimaryKey
	private String ine;
	private String prenom;
	private String nom;
	private String sexe;
	
	public Etudiant() {
		// TODO Auto-generated constructor stub
	}

	public Etudiant(String ine, String prenom, String nom, String sexe) {
		super();
		this.ine = ine;
		this.prenom = prenom;
		this.nom = nom;
		this.sexe = sexe;
	}

	public String getIne() {
		return ine;
	}

	public void setIne(String ine) {
		this.ine = ine;
	}

	public String getPrenom() {
		return prenom;
	}

	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public String getSexe() {
		return sexe;
	}

	public void setSexe(String sexe) {
		this.sexe = sexe;
	}

	@Override
	public String toString() {
		return "Etudiant [ine=" + ine + ", prenom=" + prenom + ", nom=" + nom + ", sexe=" + sexe + "]";
	}
	

}
