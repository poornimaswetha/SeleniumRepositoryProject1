
public class Session9Demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 
		Session9Dog dg= new Session9Pug();
		dg.methodDog();
		dg.a=1000;
		dg.Dog="Doggy";
		
	    //inherited child class from parent class
		// Access inherited parent class methods and variables
		Session9Pug pg=new Session9Pug();
		pg.a=2000;
		pg.b=123;
		pg.pug="Scobby";
		pg.Dog="Doggy";
		
		pg.methodEat();
		pg.methodPug();
		pg.methodSleep();
		pg.methodDog();
		
		
		
		
		
		
	}

}
