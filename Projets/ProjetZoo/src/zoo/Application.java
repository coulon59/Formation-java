package zoo;

import java.util.ArrayList;
import java.util.List;

import zoo.animals.Animal;
import zoo.animals.competences.IVolant;
import zoo.animals.insectes.Coccinelle;
import zoo.animals.mammiferes.Continent;
import zoo.animals.mammiferes.Humain;
import zoo.animals.reptiles.Crocodile;

public class Application {

	public static void main(String[] args) {
		List<Animal> zoo = new ArrayList<Animal>();
		Coccinelle cc = new Coccinelle("new beetle", 0.010);
		zoo.add(new Humain("jean", 60, Continent.AFRIQUE));
		zoo.add(cc);
		List<IVolant> volants = new ArrayList<IVolant>();
		volants.add(cc);
		System.out.println(zoo.size());
		
		for (Animal  a:zoo) {
			System.out.println(a);
		}
		
		for(IVolant v: volants) {
			System.out.println(v);
			v.voler();
			v.respirer();
		}
		
		Crocodile cr = new Crocodile("Croco", 100);
		cr.respirer();
		cr.manger();
		cr.nager();
		cr.marcher();

		
	}
	

}
