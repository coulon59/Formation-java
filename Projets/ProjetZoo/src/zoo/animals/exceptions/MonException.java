package zoo.animals.exceptions;

public class MonException extends Exception {

	// Liste des constructeurs
	
	// Constructeur à vide (pas de message)
	public MonException() {
		// TODO Auto-generated constructor stub
	}

	// constructeur avec un message
	public MonException(String message) {
		super(message);
		// TODO Auto-generated constructor stub
	}

	// Constructeur avec une cause
	public MonException(Throwable cause) {
		super(cause);
		// TODO Auto-generated constructor stub
	}

	// Construecteur avec mesage et cause
	public MonException(String message, Throwable cause) {
		super(message, cause);
		// TODO Auto-generated constructor stub
	}

	// Constructeur total 
	public MonException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
		super(message, cause, enableSuppression, writableStackTrace);
		// TODO Auto-generated constructor stub
	}

}
