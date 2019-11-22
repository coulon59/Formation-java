package zoo.animals.mammiferes;

public class Humain extends Mammifere {

	private Continent continent;
	
	public Humain() {
		super();
	}

	public Humain(String nom, double poids, Continent continent) {
		super(nom, poids);
		this.continent = continent;
	}

	@Override
	public void raser() {
		System.out.println("je me rase avec un rasoir");
	}

	@Override
	public String toString() {
		return "Humain [continent=" + continent + "]";
	}
	
	
}
