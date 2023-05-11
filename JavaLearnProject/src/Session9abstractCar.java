//abstract class can have both abstract and non abstract method
public abstract class Session9abstractCar {

	//abstract method - don't have body
	//abstract method can be accessed through inheritance in child class
	public abstract void methodstartcar();

	public void methodstopcar() {
		System.out.println("method non abstract stop car");
	}
}
