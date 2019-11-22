package zoo.animals;

import zoo.animals.exceptions.MonException;

public interface IAnimal {
	
	public void manger();
	public void respirer() throws MonException;

}
