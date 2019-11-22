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
	
	// initialiser le num�ro du compte
	public void setNumero(int numero) {
		this.numero = numero;
	}
	
	// initialiser le solde du compte
	public void setSolde(double solde) {
		this.solde = solde;
	}
	
	// r�cup�rer le numero du commpte
	public int getNumero() {
		return numero;
	}	
	
	// r�cup�rer le solde du compte
	public double getSolde() {
		return solde;
	}
	
	/*
	 * m�thode ajouter un montant sur le compte 
	 */
	public void ajouter (double unMontant) {
		this.solde += unMontant;
    }
	
	/*
	 * m�thode retirer un montant sur le compte 
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
