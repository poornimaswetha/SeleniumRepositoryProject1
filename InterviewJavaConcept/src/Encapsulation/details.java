package Encapsulation;

public class details {
	//Private variable 
	private String Personname;
	// variable is private but can be accessed outside the class 
	// by an intermediate public get and set methods or through intermediate methods
	//get method
	void getname() {
		System.out.println(Personname);
	}
	//set method
	void setname(String pname) {
		 Personname = pname;		
	}	
	//intermediate methods
	void methodone() {
		System.out.println(Personname);
	}
}
