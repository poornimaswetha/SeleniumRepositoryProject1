package Exception;

public class arthmaticException {
	// Unchecked Exception
	// Error occurs after compiling
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			System.out.println("First Line of the Try / Catch Block");
		int a=10/0;
			System.out.println("Second Line of the Try / Catch Block");
		}catch(Exception e){
			System.out.println("Error due to Arithematic problem");
		}finally {
		System.out.println("Finally Block executed");
		}
	}

}
