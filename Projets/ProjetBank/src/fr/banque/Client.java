package fr.banque;

import java.util.Arrays;

public class Client {
	/*
	 * Liste des variables d'instance
	 */
	private int numero;
	private String nom;
	private String prenom;
	private int age;
	private Compte[] comptes;
	
	/*
	 * Constructeur
	 */
	public Client() {
	}
	
	/*
	 * Constructeur
	 */
	public Client(int unNumero, String unNom, String unPrenom, int unAge) {
		this.numero = unNumero;
		this.nom = unNom;
		this.prenom = unPrenom;
		this.age = unAge;	
		this.comptes = new Compte[5];
	}

	// r�cup�rer le nom 
	public String getNom() {
		return this.nom;
	}	
	
	// r�cup�rer le pr�nom 
	public String getPrenom() {
		return this.prenom;
	}	
	
	// r�cup�rer l'age 
	public String getAge() {
		return this.prenom;
	}	
	
	// r�cup�rer le numero 
	public int getNumero() {
		return this.numero;
	}
	
	public Compte[] getComptes() {
		return comptes;
	}

	// init du nom 
	public String setNom(String unNom) {
		return this.nom = unNom;
	}	
	
	// init du prenom 
	public String setPrenom(String unPrenom) {
		return this.nom = unPrenom;
	}
		
	// init du prenom
	public int setNumero(int unNumero) {
		return this.numero = unNumero;
	}
		
	// init de l'age
	public int setAge(int unAge) {
		return this.age = unAge;
	}
	
	/*
	 * m�thode ajouter un compte  
	 */
	public void ajouterCompte (Compte compte) {
		
		// parcours du tableau de comptes
		int i = 0;
		for (i = 0; i < this.comptes.length; i++) {
	        if (this.comptes[i] == null) {
	        	this.comptes[i] = compte;
	        	return;
	        }
		}
		System.out.println("Attention, vous poss�dez d�j� 5 comptes");
    }
		
	/*
	 * Afficher un compte
	 */
	public Compte getCompte(int unCompte)
	{ 	
		//parcours du tableau de comptes
		for (Compte compte: this.comptes) {
	        if (compte != null && compte.getNumero() == unCompte) {
	        	return compte;
	        }
		}
		System.out.println("Aucun compte ave le num�ro " + unCompte);
		return null;
	}

	@Override
	public String toString() {
		return "Client [numero=" + numero + ", nom=" + nom + ", prenom=" + prenom + ", age=" + age + ", comptes="
				+ Arrays.toString(comptes) + "]";
	}
	
	@Override
	public boolean equals(Object obj) {
		return this.numero == ((Client) obj).getNumero();
	}

}
