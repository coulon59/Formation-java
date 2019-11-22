package zoo.animals.insectes;

import zoo.animals.Animal;

public class Insecte extends Animal {

	public Insecte() {
	}

	public Insecte(String nom, double poids) {
		super(nom, poids);
	}

	public String couleur() {
		return "rouge";
	}
}
