package zoo.animals;

import zoo.animals.exceptions.MonException;

public abstract class Animal implements IAnimal {
	
	

	// Liste des variables d'instance
	private String nom;
	private String espece;
	private double poids;
	
	/*
	 * Liste des constructeurs
	 */
	
	public Animal() {
		super();
	}
	
	
	public Animal(String nom, double poids) {
		super();
		this.nom = nom;
		this.espece = this.getClass().getSimpleName();
		this.poids = poids;
	}

	/*
	 * Liste des getters et setters
	 */
	
	public void setNom(String nom) {
		this.nom = nom;
	}
	
	public String getNom(String nom) {
		return nom;
	}
	
	public void setEspece(String espece) {
		this.espece = espece;
	}
	
	public String getEspece(String espece) {
		return espece;
	}
	public double getPoids() {
		return poids;
	}

	public void setPoids(double poids) {
		this.poids = poids;
	}

	public void respirer() throws MonException{
		throw new MonException("Plus d'air dans le zoo");
	}
		
	public void manger() {
		System.out.println(this.nom + " mange");
	}

	@Override
	public String toString() {
		return "Animal [nom=" + nom + ", espece=" + espece + ", poids=" + poids + "]";
	}
	

}

