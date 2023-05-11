
public class Session8Overloading {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		methodA();
		methodA(2);

}

	
	public static void methodA() {
		
	}
	
	public static void methodA(int a) {
		System.out.println(a);
		
	}
	
	public void methodA(int a,int b) {
		
	}
	
	public void methodA(int a,double b) {
		
	}
	
	public void methodA(double b,int a) {
		
	}
}