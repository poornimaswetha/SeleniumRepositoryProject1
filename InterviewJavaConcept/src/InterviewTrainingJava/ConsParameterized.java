package InterviewTrainingJava;

public class ConsParameterized {
	String name;
	int age;
	String School;
	
	// Parameters are provided to the constructors
	ConsParameterized(String nm,int ag,String Schl){
		name=nm;
		age=ag;
		School=Schl;		
	}
	//Method to display the values
	public void details() {
		System.out.println("Name :"+name +" Age :"+ age +" School :"+School);
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ConsParameterized  cust1=new ConsParameterized("Anu",23,"Pearl");
		ConsParameterized  cust2=new ConsParameterized("Priya",55,"MIS");
		ConsParameterized  cust3=new ConsParameterized("Shalu",45,"DPS");
		cust1.details();
		cust2.details();
		cust3.details();
		
	}

}
