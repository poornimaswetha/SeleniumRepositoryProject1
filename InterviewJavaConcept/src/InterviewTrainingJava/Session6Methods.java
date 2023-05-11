package InterviewTrainingJava;

public class Session6Methods {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		methodOne();
		//System.out.println(methodTwo(25, 35));
		int result;
		result=methodTwo(25, 35);
		System.out.println(result);
		methodThree(40, "poornima");
	}
	
	public static void methodOne() {
		System.out.println("This is methodOne Method function");
	}
	
	public static int methodTwo(int a, int b) {
		System.out.println("This is methodTwo Method function");
		int sum;
		sum=a+b;
		return sum;		
		
	}
	
	public static void methodThree(int a, String y) {
		System.out.println("My name is "+y+"and age is "+a);
	}
	
	
	

}
