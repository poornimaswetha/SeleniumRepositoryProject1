
public class Session8Car {

String model;
String carname;
int cost;
int milage;

/*public Session8Car(String mdl, String cnm, int co, int mil){
		/*model=mdl;
		carname=cnm;
		cost=co;
		milage=mil;	
}*/

//this keyword is used to differentiate Instance variable and Parameterized variable
	public Session8Car(String model, String carname, int cost, int milage) {
		this.model = model;
		this.carname = carname;
		this.cost = cost;
		this.milage = milage;
	}


	public void methodCar(){
		System.out.println("model ="+model);
		System.out.println("Carname="+carname);
		System.out.println("cost="+cost);
		System.out.println("milage="+milage);

	}
	public void methodStartcar(){
		System.out.println("==Car Started==");
	

	}
	public void methodStopcar(){
		System.out.println("==Car Stopped==");	
	}
	
	
	
	

}
