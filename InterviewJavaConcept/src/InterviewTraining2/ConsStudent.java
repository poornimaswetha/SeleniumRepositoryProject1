package InterviewTraining2;
public class ConsStudent {		
	public String name;
	public int age;
	public String School;
	public String aadhar;
	public String stuid;
	public String Phno;		
		// Parameters are provided to the constructors
		// This keyword is used to differentiate Instance variable with Parameter
		// Overloading of Constructor
		// same constructor name with different parameters with different data types
	public ConsStudent(String name,int age,String School){
			this.name=name;
			this.age=age;
			this.School=School;		
		}
		// same constructor name with different parameters with different data types
	public ConsStudent(String name,String aadhar,String Phno){
			this.name=name;				
			this.aadhar=aadhar;	
			this.Phno=Phno;
		}
		// same constructor name with different parameters with different data types
	public ConsStudent(String name,String stuid){
			this.name=name;
			this.stuid=stuid;					
		}		
		//Method to display the values
	public void details() {
			System.out.println("Name :"+name +" Age :"+ age +" School :"+School+" aadhar :"+aadhar+" Phone No:"+Phno+" Student id :"+stuid);
		}	

	}

