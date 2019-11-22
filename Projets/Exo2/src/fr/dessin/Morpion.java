package fr.dessin;

import java.util.Scanner;

// récupère toutes les constantes 
import static fr.Constante.*;

public class Morpion {

	// bonnes pratiques mettre les variables en private
	// si l'on veur récupérer la varibale dans une autre classe faire un getteur
	private String[][] grille = new String[3][3];
	private static int compteur = 0;	
	private Scanner scanner = new Scanner(System.in);
	
	// constructeur toujours en public 
	public Morpion() {
		
		//for(int x = 0 ; x < 3 ; x++)
		for (String[] ligne : this.grille) {
            for(int i = 0 ; i < ligne.length ; i++) {
    			ligne[i] = " "; 
            }
        }
	}

	// récupérer la valeur du nombre de coup
	private int getCompteur() {
		return compteur;
	}
		
	/*
	 * méthode pour afficher le contenu de la grille ==> 9 cases
	 */
	private void afficherGrille () {
		//for(int x = 0 ; x < 3 ; x++)
		// pour chaque ligne de la grille
		for(String[] ligne: grille) {
			// pour chaque cellule de la ligne 
            for(String cellule: ligne) {
            	System.out.print(cellule+" , ");
            }
            System.out.println();
        }	
	}
	

	/*
	 * méthode pour modifier une case de la grille 
	 */
	private boolean modifierCase (String valCase, int x, int y) {
		if (this.grille[x][y] == " ") {
			this.grille[x][y] = valCase;
			compteur ++;
			return true;
		}
		else {
			System.out.println("Déjà pris !!!");
			return false;
		}					
	}
	
	/*
	 * méthode pour compter le nombre de coup 
	 */
	private int compterCoup (String value) {
		int valNbCoup = 0;
		for (String[] ligne : this.grille) {
            for(int i = 0 ; i < ligne.length ; i++) {
            	if (ligne[i] == value) {
            		valNbCoup ++;
            	}
            }
        }
		return valNbCoup;
		
	}
	
	
	/**
	 *  permet de lire un entier dans la console
	 * @param msg
	 * @return
	 */
	public int input(String msg) {
		System.out.println(msg);
		return this.scanner.nextInt();
	}
	
	/**
	 * methode pour jouer
	 */
	public void jouer() {
		System.out.println("JEU DU MORPION !");

		while (this.compteur <9) {
			String s;
			if (this.compteur % 2 == 0) {
				s = "X";			
			} else {
				s = "O";
			}
			while (!this.modifierCase("X", this.input("A votre tour !! x ?"), this.input("y ? ")));
			this.afficherGrille();	
		}
		System.out.println("FIN DU JEU !!");
	}
}
