package fr.dessin;

public class Point2D {

	// variables d'instance ou attributs 
	private int x,y;
	
	// variables de classe 
	private static int nbCompteur = 0;
	
	// Constantes
	public final static double PI = 3.14;
	
	// méthode qui crée un objet
	// Constructeur
	public Point2D(int x, int y) {
		super();
		this.x = x;
		this.y = y;
		Point2D.nbCompteur ++;
	}
	
	// Constructeur init
	public Point2D() {
		Point2D.nbCompteur ++;

	}
		
	// récupérer la valeur de x
	public int getX () {
		return x;
	}
	
	// récupérer la valeur de y
	public int getY() {
		return y;
	}
		
// modifier la valeur de x
	public void setX(int x) {
		this.x= x;
	}
	
	// modifier la valeur de y
	public void setY(int y) {
		this.y = y;
	}
	
	// afficher x et y
	public void afficher () {
		System.out.println("Coordonnée de x : " + getX());
		System.out.println("Coordonnée de y : " +getY());
	}
	
	// translater x et y
	public void translater(int dX, int dY) {
		this.x = this.x + dX;
		this.y = this.y + dY;
	}
	
	// afficher x et y
	public int getCompteur () {
		return Point2D.nbCompteur;
	}
	
}
