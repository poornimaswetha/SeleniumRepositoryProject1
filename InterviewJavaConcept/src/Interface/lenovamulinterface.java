package Interface;
// multiple inheritance is not possible in java
// it is overcome by multiple interface implementation
public class lenovamulinterface implements Smartphone, TabletPhone{	
	
	public static void main(String[] args) {
		
		
		// object created for samsung class
		lenovamulinterface lenovamulinterfaceobj=new lenovamulinterface();
		
		lenovamulinterfaceobj.display();
		lenovamulinterfaceobj.tabdisplay();
		
		lenovamulinterfaceobj.size();
		lenovamulinterfaceobj.tabsize();
		
		lenovamulinterfaceobj.video();
		lenovamulinterfaceobj.tabvideo();
		
	}
		
		//All Methods of SmartPhone interface is implemented here
		 public void display() {
			 System.out.println("Display method implemented in samsung");
			 
		 };// 
		 public void size() {
			 System.out.println("size method implemented in samsung");
			 
		 };
		 public void video() {
			 System.out.println("video method implemented in samsung");
			 
		 };
		//-----------------------------------------------------------
		 // All Methods of TabletPhone interface is implemented here
		 public void tabdisplay() {
			 System.out.println("tabDisplay method implemented in samsung");
			 
		 };// 
		 public void tabsize() {
			 System.out.println("tabsize method implemented in samsung");
			 
		 };
		 public void tabvideo() {
			 System.out.println("tabvideo method implemented in samsung");
			 
		 };		 	

	}



