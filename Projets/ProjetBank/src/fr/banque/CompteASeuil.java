package fr.banque;

public class CompteASeuil extends Compte{

	// liste des variables d'instance
	private double seuil;
	
	/*
	 * /Liste des constructeurs
	 */
	public CompteASeuil() {
		// TODO Auto-generated constructor stub
	}

	public CompteASeuil(int numero, double solde, double seuil) {
		super(numero, solde);
		this.seuil = seuil;
	}
	
	/*
	 * Liste des getters et setters
	 */
	public double getSeuil() {
		return seuil;
	}

	public void setSeuil(double seuil) {
		this.seuil = seuil;
	}

	/*
	 * Méthode pour retirer un montant du solde
	 */
	public void retirer(double unMontant) {
		if (this.getSolde() - unMontant > this.seuil) {
			this.setSolde(this.getSolde() - unMontant);
		} else {
			System.out.println("Pas assez d'argent");
		}
		
	}
	@Override
	public String toString() {
		return super.toString() + "CompteASeuil [seuil=" + seuil + "]";
	}
	
}
