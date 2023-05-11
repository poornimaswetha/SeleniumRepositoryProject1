package Abstraction;

public class Bank {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
			// TODO Auto-generated method stub
		   // object for child class 'son' is created here in this 'Bank' class 
			Son sonobj=new Son();
			sonobj.Loanapplied();// Overridden completed abstract method in child class
			sonobj.agriculture();//father class method
			sonobj.engineering();// child class method
	}

}
