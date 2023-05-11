package TestNGExecution;
import org.testng.SkipException;
import org.testng.annotations.Test;

public class ArithmeticException {
@Test
	public void AException() throws Exception {	
	//throws - ignoring a checked Exception
		int age=5;
		if (age <10) {
			//throw - To manually throw an Exception			
			//throw new Exception("Age is less than 10");
			
			// SkipException is a TestNG exception to produce SkipException
			throw new SkipException("Age is less than 10");
		}
		
	
	
	}

}
