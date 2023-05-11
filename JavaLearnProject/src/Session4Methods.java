
public class Session4Methods {
	// instance variables - outside methods. Accessed from outside the methods.
	static int v=67;

	public static void main(String[] args) {
		//Local Variables - means inside methods only. Accessed inside methods
		int x=20;
		int y=30;
		System.out.println("Local variable :"+(x+y));
		
		// TODO Auto-generated method stub
		methodOne(100);
		methodTwo(10,20,30,100); // arguments
		
		// method using void 
		add(4,5); 
		
		// method without void using int variable return type
		int result = addition(7,5); 
		System.out.println("result ="+result);
	}
	
	//methods
	public static void methodOne(int a) {  //parameters 
		System.out.println("methodOne:"+a);
		
		//Local Variables - means inside methods only. Accessed inside methods
		int z=200;
		System.out.println(z);
	}
	public static void methodTwo(int a, int b, int c, int d) { //parameters 
		System.out.println("methodTwo:"+(a+b+c+d));
		// instance variable can be called anywhere inside the class
		System.out.println("instance variable (static) : "+ v);
	}
	
	// void means the method will not return any values
	
	public static void add(int a, int b) { //parameters 
		System.out.println("methodTwo:"+(a+b));
	}	
	// if u want to return the values from methods then u have to give its return type in method like int or String
	public static int addition(int a, int b) { //parameters 
		int sum=a+b;
		return sum;
		
	}

}
