package Session11;

import java.util.ArrayList;
import java.util.Collection;

public class Collectioninterface {
	public static void main(String[] args) {
		// TODO Auto-generated method stub		
	
		Collection<Integer> alist =new ArrayList<Integer>();
		
		alist.add(3);
		alist.add(4);
		alist.add(2);
		alist.add(8);
				
		for(Integer y : alist) {
			
			System.out.println(y);
		}

	}
}
