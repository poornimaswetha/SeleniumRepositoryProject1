package HashMap;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

public class Example1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// Map interface is parent for Hash map, so this is possible
		 Map<String, Integer> people = new HashMap<String, Integer>();
		
		 // Create a HashMap object called people
	    //HashMap<String, Integer> people = new HashMap<String, Integer>();

	    // Put keys and values (Name, Age)
	    people.put("Poornima",32);
	    people.put("Fathima",25);
	    people.put("Dilu",35);
	    people.put("Marie",15);    
	   
	    
	    // Retrieve all values in HashMap
	    for(Integer j: people.values()) {
	    	//Here i is retrieve Keys, Get() will retrieve the values
	    	System.out.println("Age :"+ j);
	    	
	    }
	    
	    // Retrieve all Keys in HashMap
	    for(String i: people.keySet()) {
	    	//Here i is retrieve Keys, Get() will retrieve the values
	    	System.out.println("Name: "+ i );
	    	
	    }
	    
	    //Retrieve both Keys and Values in HashMap
	    for(String i: people.keySet()) {
	    	//Here i is retrieve Keys, Get() will retrieve the values
	    	System.out.println("Name: "+ i +", Age: "+ people.get(i));
	      }
		
	    //It returns set view of all entries in HashMap	    
	    System.out.println(people.entrySet());
	   
	}

}
