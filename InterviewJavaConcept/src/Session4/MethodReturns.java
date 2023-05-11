package Session4;

public class MethodReturns {

	public static void main(String[] args) {
		
		int res= add(9,5);
		System.out.println(res);
		
		String x=Methodsample("Poornima");
		System.out.println(x);
		
	}
	
	// int will return the value where void will not return the value from methods
	public static int add(int a, int b)  {
		int sum=a+b;
		return sum;
	}

	//String
	public static String Methodsample (String a) {
	System.out.println(a);
	return a+"Devi";
		
	}
}
