package Interface;

public class samsung implements Smartphone {

	public static void main(String[] args) {
		
		// object created for samsung class
		samsung samsungobj=new samsung();
		samsungobj.display();
		samsungobj.size();
		samsungobj.video();
		samsungobj.samsungspec();
		
	    // To access interface variables u can directly put interface.variablename
		// interface variable are public, static and final by default
		System.out.println(Smartphone.phonecost);
		System.out.println(Smartphone.Phoneid);
	}
	
	// All Methods of SmartPhone interface is implemented here
	 public void display() {
		 System.out.println("Display method implemented in samsung");
		 
	 };// 
	 public void size() {
		 System.out.println("size method implemented in samsung");
		 
	 };
	 public void video() {
		 System.out.println("video method implemented in samsung");
		 
	 };
	 // samsungs own method
	 public void samsungspec() {
		 System.out.println("samsungspec method implemented in samsung");
		 
	 }

}
