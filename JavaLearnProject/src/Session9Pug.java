
public class Session9Pug extends Session9Dog{
	
	int b;
	String pug;
	
	public void methodPug() {
		System.out.println("This is method Pug");
	}
	
	public void methodEat() {
		System.out.println("This is method eat of Pug");
	}
	
	public void methodSleep() {
		System.out.println("This is method Sleep of Pug");
	}
	
	//This method is overriding the same method in Dog parent class
	public void methodDog() {
		System.out.println("This is method Dog overriding in Pug child class");
	}
	//overloading and overriding
	public void methodDog(int a) {
		System.out.println("This is method Dog in Parent Dog Class overloading and overridi");
	}
}
