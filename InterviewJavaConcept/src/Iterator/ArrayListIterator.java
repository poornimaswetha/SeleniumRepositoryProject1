   package Iterator;

import java.util.ArrayList;
import java.util.Iterator;



public class ArrayListIterator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ArrayList<Integer> alist= new ArrayList<Integer> ();
		alist.add(100);
		alist.add(200);
		alist.add(300);
		alist.add(400);
		alist.add(500);
		
		//alist.iterator() iterator method return type is Iterator interface Iterator<Integer>
		Iterator<Integer> itr = alist.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
		
		

	}

}
