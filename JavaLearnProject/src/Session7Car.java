
public class Session7Car {

static String color;
int milage;
int cost;
String model;
	
	public static void methodColor() {
		System.out.println("Method Color ="+color);
		
		
	}
	
	public void methodCar() {
		System.out.println("Method Color ="+color);
		System.out.println("Method milage ="+milage);
		System.out.println("Method Cost ="+cost);
		System.out.println("Method model ="+model);
		
		
	}
	

	public void methodmodel() {
		System.out.println("Method Model="+model);
		methodColor();// static method can be accessed from non static method
		
	}



}
