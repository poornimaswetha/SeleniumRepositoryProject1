package Iterator;

import java.util.HashSet;
import java.util.Iterator;

public class HashSetIterator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//HashSet is a class of Set(interface)
		HashSet<String> aset=new HashSet<String>();
		//Unordered Set
		aset.add("Abinav");
		aset.add("Bagya");
		aset.add("Cylina");
		aset.add("Dhanya");
		aset.add("Eliyana");
		aset.add("Abinav");// duplicates will not be added in set
		System.out.println(aset);
		
		
		//alist.iterator() iterator method return type is Iterator interface Iterator<Integer>
		Iterator<String> itr = aset.iterator();
		while(itr.hasNext()) {
		System.out.println(itr.next());
		}
				
		
	}

}
