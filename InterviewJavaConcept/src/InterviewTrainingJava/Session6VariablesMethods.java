package InterviewTrainingJava;

public class Session6VariablesMethods {	
	int c=100; // instance variable - accessed throughout the class
	static int d=100; // static variables can be accessed only by static methods
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a=15; // Local variable  - accessed only inside this method
		System.out.println(a);
		System.out.println(d);
		
		// static Method can be accessed only by static method
		oneMethod(); 
		
		// A non static method can be accessed only by creating instance of the class as object
		Session6VariablesMethods d = new Session6VariablesMethods();
	        d.twoMethod();  		
	        
	        //twoMethod() -> this will tell u to change the method to static
		
	}
	// static Method 
	// It can be accessed only by static method
	// static method can access static variables and its local variables
	public static void oneMethod() {
		int b=23; // Local variable  - accessed only inside the method
		System.out.println(b); // this Method's Local variable
		System.out.println(d); // static variable
	}	
	// Non static Method or Public Method
	// A non static method can be accessed only by creating instance of the class as object
	//It can access all static & non static variable - instance variable & its local variable
		public void twoMethod() {	
		int f=30;// this Method's Local variable
		System.out.println(f); // this Method's Local variable
		System.out.println(c);// instance variable
		System.out.println(d);// static variable
		oneMethod(); //Non static method can access both static and not static methods
	}
}
