package fr.dessin;

public class Point3D extends Point2D {
	
	// variables d'instance ou attributs 
	private int z;

	// Constructeur méthode qui crée un objet
	public Point3D(int x, int y, int z) {
		super(x,y);
		this.z = z;
	}
	
	// Constructeur init
	public Point3D() {
		
	}
	

	// récupérer la valeur de y
	public int getZ () {
		return this.z;
	}
	
	
	// modifier la valeur de z
	public void setZ(int z) {
		this.z = z;
	}

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

	// afficher x et y
		public void afficher () {
			System.out.println("Coordonnée de x : " + getX());
			System.out.println("Coordonnée de y : " +getY());
			System.out.println("Coordonnée de z : " +getZ());
		}
}
