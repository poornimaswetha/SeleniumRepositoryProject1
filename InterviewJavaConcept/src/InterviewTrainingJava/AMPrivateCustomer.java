package InterviewTrainingJava;

import InterviewTraining2.AMPrivateBank;

//Inheritance ( extends keyword) 
//Inheritance in Java is a mechanism in which one object acquires all the properties and behaviors of a parent object
//It is an important part of OOPs (Object Oriented programming system)
//AMPrivateCustomer is child class & AMPrivateBank is parent class or super class

public class AMPrivateCustomer extends AMPrivateBank{
	public static void main(String[] args) {	
					
		// Creating an object for the same class
		AMPrivateCustomer cust=new AMPrivateCustomer();
		// protected variable can be accessed from different package only through inheritance
		cust.atmpin(); 
		// protected Method can be accessed from different package only through inheritance
		System.out.println(cust.atmpin); 		
		
	}
}
