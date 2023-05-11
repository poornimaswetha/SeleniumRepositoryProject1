package InterviewTrainingJava;

public class ConsParameterthis {

		String name;
		int age;
		String School;
		
		// Parameters are provided to the constructors
		// This keyword is used to differentiate Instance variable with Parameter
		ConsParameterthis(String name,int age,String School){
			this.name=name;
			this.age=age;
			this.School=School;		
		}
		//Method to display the values
		void details() {
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
