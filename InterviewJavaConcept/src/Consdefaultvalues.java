
public class Consdefaultvalues {
	String name;
	int age;
	
	//method to display id and name details		
	void details(){
		System.out.println(age+" "+name);
		}  
	
	//Explanation:In the above class,you are not creating any constructor so compiler provides you a default constructor. 
	//Here 0 and null values are provided by default constructor.
	public static void main(String[] args) {		
		
		// TODO Auto-generated method stub		
		Consdefaultvalues stud1=new Consdefaultvalues();
		Consdefaultvalues stud2=new Consdefaultvalues();
		stud1.details();
		stud2.details();
		
	}

}
