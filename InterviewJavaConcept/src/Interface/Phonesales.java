package Interface;

public class Phonesales {

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
	}

