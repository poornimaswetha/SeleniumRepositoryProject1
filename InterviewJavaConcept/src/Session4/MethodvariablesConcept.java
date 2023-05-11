package Session4;

public class MethodvariablesConcept {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	//Example - 1
		Methodone(100);
		MethodTwo(100,500);
		MethodThree(100,200,300);
		MethodFour(100,200,300,600);
		
	}
	public static void Methodone(int a) {
		System.out.println("Method One :"+a);
	}
	public static void MethodTwo(int a, int b) {
		System.out.println("Method Two :"+(a+b));
	}
	public static void MethodThree(int a, int b, int c) {
		System.out.println("Method Three :"+(a+b+c));
	}
	public static void MethodFour(int a, int b, int c, int d) {
		System.out.println("Method Four :"+(a+b+c+d));
	}

}
