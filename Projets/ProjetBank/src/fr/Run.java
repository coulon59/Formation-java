package fr;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

import fr.banque.Client;
import fr.banque.Compte;
import fr.banque.CompteASeuil;
import fr.banque.CompteRemunere;

public class Run {

	public static void main(String[] args) {
		
		CompteASeuil cas = new CompteASeuil (1, 1000.0, 100);
		System.out.println(cas);
		cas.retirer(5000);
		System.out.println(cas);
		List<Compte> list;
		list = new ArrayList<>();
		list = new LinkedList<>();

	}

}
