package com.smile;

public class Voiture {
	// variables
	private String nom;
	private int ch;
	
	// constructeur
	public Voiture(String nom, int ch) {
		this.nom = nom;
		this.ch = ch;
	}

	// getter
	public String getNom () {
		return this.getNom();
	}
	
	// setter
	public void setNom (String nom) {
		this.nom = nom;
	}
	
	@Override
	public String toString() {
		return "Voiture [nom=" + nom + ", ch=" + ch + "]";
	}
	
}
