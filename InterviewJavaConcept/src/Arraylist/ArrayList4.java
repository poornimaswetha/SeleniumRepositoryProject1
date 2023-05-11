package Arraylist;


import java.util.ArrayList;

public class ArrayList4 {

	public static void main(String[] args) {
		
		// Create ArrayList with Object wrapper class		
				ArrayList<Object[]> empdata=new ArrayList<>();
				empdata.add(new Object[]{"EmpNo", "EmpName", "JobTitle"} );
				empdata.add(new Object[]{ "101", "Peter", "Tester" });
				empdata.add(new Object[]{ "102", "David", "Manager" } );
				empdata.add(new Object[]{ "103", "Hema", "TeamLeader" } );
				
				for(Object[] emp:empdata) {// Looping Object[] single dimensional array
					System.out.println(emp);// objects are printed
					for(Object celldata:emp) { //Looping the Objects
						System.out.println(celldata);// Cell values are printed
					}
				}
	}

}
