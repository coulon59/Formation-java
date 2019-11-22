package zoo.animals.mammiferes;

import zoo.animals.Animal;

public abstract class Mammifere extends Animal {

	public Mammifere() {
		super();
	}

	public Mammifere(String nom, double poids) {
		super(nom, poids);
	}
	
	public abstract void raser();

}
