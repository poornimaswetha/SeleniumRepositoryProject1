package Multilevelinheritance;

//Parent class
public class Prabhu extends APJ{
	// subclass can access all protected and public methods
	// no matter in what package the subclass is in 	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Prabhu Prabhuobj=new Prabhu();
		Prabhuobj.doagri();// Prabhus parents class
		Prabhuobj.doauditor();//Prabhus own class
		Prabhuobj.dobusiness();	// Prabhus own class
		
		Prabhuobj.acting(); 
		// Prabhu own acting is Overridden 
		// because object is created for his class

	}
	protected void doauditor() {
		System.out.println("Prabhu doaduitor method called");
	}
	
	public void acting() {
		System.out.println("Prabhu acting method called");
	}
	
	void dobusiness() {
		System.out.println("Prabhu dobusiness method called");
	}

}
