package Session11;
//Importing HashMap class
import java.util.HashMap;

public class Hashmapexample2 {
	

	    // Main driver method
	    public static void main(String[] args)
	    {
	    	HashMap<String,Integer> map=new HashMap<>();
	    	map.put("Arun",101);
	    	map.put("Brun",102);
	    	map.put("Crun",103);
	    	
	    	for(String i:map.keySet())
	    		System.out.println(map.get(i));
	    		
	    	
	    }
}