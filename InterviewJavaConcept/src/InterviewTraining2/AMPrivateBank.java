package InterviewTraining2;

//A Class can public, final or abstract. Not Private or Protected.

public class AMPrivateBank {	
	// Public  variable can be accessed everywhere
	// protected variables can be accessed only through inheritance means "extends"
	// Parent class extends child class
	protected int atmpin=11; 	
	// Public  Methods can be accessed everywhere
	// protected methods can be accessed only through inheritance means "extends"
	// Parent class extends child class
	protected void atmpin() {
			System.out.println("This is my atmpin method");		
		}			
}
