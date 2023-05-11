
public class Session8Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Constructors creating objects
		Session8Car bmw= new Session8Car("BMW1123","BMW",5000,120000);
		Session8Car audi= new Session8Car("AUDI1123","AUDI",8000,150000);
		Session8Car toyato= new Session8Car("TOYATO1123","TOYATO",9000,220000);
		
		
		/*//objects Initialization
		bmw.model="BMW1123";
		bmw.milage=5000;
		bmw.cost=120000;
		bmw.carname="BMW";
		
		//Initialization		
		audi.model="AUDI1123";
		audi.milage=5000;
		audi.cost=120000;
		audi.carname="AUDI";
		
		//Initialization		
		toyato.model="TOYATO1123";
		toyato.milage=5000;
		toyato.cost=120000;
		toyato.carname="TOYATO";
		*/
		
		//objects calling the methods
		bmw.methodStartcar();
		bmw.methodCar();
		bmw.methodStopcar();
		
		//objects calling the methods
		audi.methodStartcar();
		audi.methodCar();
		audi.methodStopcar();
		
		//objects calling the methods
		toyato.methodStartcar();
		toyato.methodCar();
		toyato.methodStopcar();
		
		
		

	}

}
