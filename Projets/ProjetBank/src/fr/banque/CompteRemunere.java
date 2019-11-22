package fr.banque;

public class CompteRemunere extends Compte{

	/*
	 * Liste des variables d'instances
	 */
	private double taux;
	
	/*
	 * Liste des constructeurs 
	 */
	public CompteRemunere () {
	}
	
	public CompteRemunere (int numero, double solde, double taux) {
		super(numero, solde);
		if (taux > 1.0 ) {
			System.out.println("Attention le taux ne peut etre superieur à 1");
			this.taux = 1.0;
		}
		else if (taux < 0.0) { 
			System.out.println("Attention le taux ne peut etre inférieur à 0");
			this.taux = 0.0;
		} else {
			this.taux = taux;	
		}
	}
	
	/*
	 * Liste des getters
	 */
	public double getTaux() {
		return taux;
	}

	/*
	 * liste des setters
	 */
	public void setTaux(double taux) {
		this.taux = taux;
	}
	
	/*
	 * Méthode pour calculer les intérets du compte
	 */
	public double calculerInterets() {
		return this.taux *this.getSolde();
	}
	
	/*
	 * Méthode  pour ajouter au solde la totalité des intérêts calculés
	 */
	public void verserInterets(){
		this.setSolde(this.calculerInterets()+this.getSolde());
	}

	@Override
	public String toString() {
		return super.toString() + "CompteRemunere [taux=" + taux + "]";
	}


}
