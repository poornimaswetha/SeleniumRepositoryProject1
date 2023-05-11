package Multilevelinheritance;

//GrandChild Class
public class Vikram extends Prabhu{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Vikram vikramobj=new Vikram();
		
		vikramobj.doagri();// GrandParent method
		vikramobj.doauditor();// Parent method
		vikramobj.dobusiness();// Parent method
		vikramobj.doengineer(); // his own method
		vikramobj.acting(); //First hierarchy i.e.Parent method is OverRidden here not the GrandParent

	}
	
	void doengineer() {
		System.out.println("Vikram doengineer method called");
	}
	

}
