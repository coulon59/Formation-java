package fr.banque;

public class Compte {

	/*
	 * Liste des variables d'instance
	 */
	private int numero;
	private double solde ;
	
	/*
	 * Constructeur
	 */
	public Compte() {
	}
	/*
	 * Constructeur
	 */
	public Compte(int unNumero, double unSoldeInitial) {
		this.numero = unNumero;
		this.solde = unSoldeInitial;
		
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	
	// initialiser le numéro du compte
	public void setNumero(int numero) {
		this.numero = numero;
	}
	
	// initialiser le solde du compte
	public void setSolde(double solde) {
		this.solde = solde;
	}
	
	// récupérer le numero du commpte
	public int getNumero() {
		return numero;
	}	
	
	// récupérer le solde du compte
	public double getSolde() {
		return solde;
	}
	
	/*
	 * méthode ajouter un montant sur le compte 
	 */
	public void ajouter (double unMontant) {
		this.solde += unMontant;
    }
	
	/*
	 * méthode retirer un montant sur le compte 
	 */
	public void retirer (double unMontant) {
		this.solde -= unMontant;
    }
	
	@Override
	public String toString() {
	   return "Compte [numero = " + this.numero + ", solde =  " + this.solde + "]";
	}
	
	@Override
	public boolean equals(Object obj) {
		return this.numero == ((Compte) obj).getNumero();
	}

}
