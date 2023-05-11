package InterviewTrainingJava;

public class ConsOverloading {
			String name;
			int age;
			String School;
			String aadhar;
			String stuid;
			String Phno;
			
			// Parameters are provided to the constructors
			// This keyword is used to differentiate Instance variable with Parameter
			// Overloading of Constructor
			// same constructor name with different parameters with different data types
			ConsOverloading(String name,int age,String School){
				this.name=name;
				this.age=age;
				this.School=School;		
			}
			// same constructor name with different parameters with different data types
			ConsOverloading(String name,String aadhar,String Phno){
				this.name=name;				
				this.aadhar=aadhar;	
				this.Phno=Phno;
			}
			// same constructor name with different parameters with different data types
			ConsOverloading(String name,String stuid){
				this.name=name;
				this.stuid=stuid;					
			}
			
			//Method to display the values
			void details() {
				System.out.println("Name :"+name +" Age :"+ age +" School :"+School+" aadhar :"+aadhar+" Phone No:"+Phno+" Student id :"+stuid);
			}			
			
			public static void main(String[] args) {
				// TODO Auto-generated method stub
				ConsOverloading  cust1=new ConsOverloading("Anu",23,"Pearl");
				ConsOverloading  cust2=new ConsOverloading("Priya","2343 4324 2343","97804568");
				ConsOverloading  cust3=new ConsOverloading("Shalu","89056");
				cust1.details();
				cust2.details();
				cust3.details();
				
			}

		}
