
public class Session9StaticDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Session9StaticCar bmw= new Session9StaticCar();
		//instance variables and methods can be accessed using object reference
		bmw.model="MYT1234";
		bmw.color="Red";
		bmw.milage=15000;
		bmw.cost=450000;
		
		bmw.startCar();
		bmw.stopCar();
		
		//static method can be accessed using Class reference
		System.out.println(Session9StaticCar.wheels);
		Session9StaticCar.CarWheels();
		
		
	}

}
