package Exception;

public class ArrayboundOutException {
// Unchecked Exception
// Error occurs after compiling
	public static void main(String[] args) {
		try {
			System.out.println("First Line of the Try / Catch Block");
		int[] arr= new int[3];
		arr[0]=12;
		arr[1]=34;
		arr[2]=100;
		arr[10]=100;
			System.out.println("Second Line of the Try / Catch Block");
		}catch(Exception e){
			System.out.println("Error due to Array index bound out of range");
		}finally {
		System.out.println("Finally Block executed");
		}
	}

}
