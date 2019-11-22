package fr;

import java.util.ArrayList;


import fr.dessin.Point2D;
import fr.dessin.Point3D;
import fr.dessin.Morpion;

public class Run {


	
	public static void main(String[] args) {
			
		/*Point2D point = new Point2D(45, 32);		
		point.afficher();
		point.translater(5, 4);
		point.afficher();
		
		Point2D point2 = new Point2D();	
		point2.afficher();
		point2.translater(5, 4);
		System.out.println("Compteur : " + point.getCompteur());
		
		Point3D point3 = new Point3D(21, 19, 32);
		point3.afficher();*/
				
		//fizzBuzz(100, 5 , 7);	
		//pyramide(100);
		morpion();
		
	}
		
	
	/**
	 *  jeu des multiples
	 * @param limite
	 * @param mult1
	 * @param mult2
	 */
	public static void fizzBuzz(int limite, int mult1, int mult2)
	{
		
		for (int i = 0; i < limite ; i++) {
					
			// multiple de mult1 et mult2 
			if( i % mult1 == 0 && i % mult2 == 0 ) {
				System.out.println("FizzBuzz : " + i );
			}
			// multiple de mult1
			if( i % mult1 == 0 ) {
				System.out.println("Fizz : " + i );
			}
			// multiple de mult2
			else if( i % mult2 == 0 ) {
				System.out.println("Buzz : " + i );
			}	
			else {
				System.out.println("Pas multiple : " + i );
			}
		}
	}
	
	/**
	 *  jeu de la pyramide 
	 * @param varN
	 */
	public static void pyramide(int n) {
		
		for (int i = n; i > 0; i--) {
		
			String varEtoile  = "*";
			for (int j = 0 ; j < i; j++) {
				//varEtoile = varEtoile + '*';
				varEtoile += '*';
			}
			System.out.println(varEtoile);
		}
	}
	
	/**
	 *  jeu du morpion 
	 * @param varN
	 */
	public static void morpion() {
		// creation d'une instance de morpion
		Morpion jeu = new Morpion();

		/*jeu.modifierCase("X", 1, 1);
		jeu.modifierCase("O", 0, 0);
		jeu.modifierCase("O", 1, 2);

		jeu.afficherGrille();
		System.out.println("Nombre de coups X : " + jeu.getCompteur());
		System.out.println("Nombre de coups X : " + jeu.input("Entrez un nombre:"));*/
		jeu.jouer();

	}
	
		
}
