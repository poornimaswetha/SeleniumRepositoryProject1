
public class Session7Objects {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Session7Car bmw=new Session7Car();
		Session7Car audi=new Session7Car ();
		
		//Initializing object bmw
		bmw.cost=120000;
		bmw.milage=1000;
		bmw.model="BMW";
		//bmw.color="blue"; // static variable accessed
		
		
		//Access Methods
		
		bmw.methodmodel();
		bmw.methodCar();		
		//bmw.methodColor();// static method accessed
		
		//Initializing object audi
		audi.cost=120000;
		audi.milage=1000;
		audi.model="BMW";
		//audi.color="blue"; // static variable accessed
		
		
		//Access Methods		
		audi.methodmodel();
		audi.methodCar();		
		//audi.methodColor();// static method accessed
		
		

	}

}
