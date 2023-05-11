package InterviewTraining2;

public class Consteachers {

	public String name;
	public int age;
	public String School;	
		
		// Parameters are provided to the constructors
		// This keyword is used to differentiate Instance variable with Parameter
		// Overloading of Constructor
		// same constructor name with different parameters with different data types
	public Consteachers(String name,int age,String School){
			this.name=name;
			this.age=age;
			this.School=School;		
		}
	
	//Method to display the values
	public void tdetails() {
			System.out.println("Teachear Name :"+name +" Teachear Age :"+ age +" Teachear School :"+School);
		}	

	}

