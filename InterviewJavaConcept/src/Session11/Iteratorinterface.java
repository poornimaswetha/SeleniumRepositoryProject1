package Session11;

import java.util.ArrayList;
import java.util.Iterator;


public class Iteratorinterface {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// TODO Auto-generated method stub		
		
		ArrayList<String> alist =new ArrayList<String>();
		
		alist.add("My");
		alist.add("Name");
		alist.add("is");
		alist.add("Poornima");		
					
	//Iterator interface and iterator method
	Iterator<String> itr =alist.iterator();
	
	while(itr.hasNext())
		System.out.println(itr.next());
					
	}

}
