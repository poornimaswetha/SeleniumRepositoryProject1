package Abstraction;

public class Son extends Father {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
			// TODO Auto-generated method stub
			Son sonobj=new Son();
			sonobj.Loanapplied();
			sonobj.agriculture();
			sonobj.engineering();
	}
	void engineering() {
		System.out.println("engineering default son method is called");
	}
	// Method Overridden - abstract Parent class method is completed here in child class	
	void Loanapplied() {
		System.out.println("Loanapplied default son method is called");
	}

}
