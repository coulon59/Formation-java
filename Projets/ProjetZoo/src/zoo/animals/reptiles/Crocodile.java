package zoo.animals.reptiles;

import zoo.animals.competences.IAquatique;

public class Crocodile extends Reptile implements IAquatique {

	public Crocodile() {
		
	}
	
	public Crocodile(String nom, double poids) {
		super(nom, poids);
	}

	/*
	 *  Liste des interfaces
	 */
	@Override
	public void nager() {
		System.out.println("je nage");
	}

}
