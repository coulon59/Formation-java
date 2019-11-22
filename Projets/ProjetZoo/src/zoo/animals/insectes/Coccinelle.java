package zoo.animals.insectes;

import zoo.animals.competences.ITerrestre;
import zoo.animals.competences.IVolant;

public class Coccinelle extends Insecte implements IVolant , ITerrestre{

	public Coccinelle() {
	}

	public Coccinelle(String nom, double poids) {
		super(nom, poids);
	}

	@Override
	public void voler() {
		System.out.println("je vole");
	}

	@Override
	public void marcher() {
		System.out.println("je marche");
	}

}
