
public class Session9StaticCar {
	//instance variable
	String model;
	String color;
	int milage;
	int cost;
	
	//static variable
	static int wheels=4;
	
	//instance Methods
	public void startCar() {
		System.out.println("Start Car");
	}
	//instance Methods
	public void stopCar() {
		System.out.println("Stop Car");
	}
	//static Method
	public static void CarWheels() {
		System.out.println("Car wheels"+wheels);
	}
}
