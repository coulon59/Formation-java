package zoo.animals.reptiles;

import zoo.animals.Animal;
import zoo.animals.competences.ITerrestre;

/**
 * @author Smile
 *
 */
public abstract class Reptile extends Animal implements ITerrestre {

	/**
	 * 
	 */
	public Reptile() {
	}

	/**
	 * @param nom
	 * @param poids
	 */
	public Reptile(String nom, double poids) {
		super(nom, poids);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void marcher() {
		System.out.println("je marche");
	}

}