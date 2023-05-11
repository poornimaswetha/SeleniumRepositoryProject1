package HashSet;
import java.util.Collection;
import java.util.HashSet;
import java.util.Set;

public class HashSet1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Collection(i) > list(i) > ArrayList(c)
				
		// Possible Collection(interface) is Parent of Array list		
		//Collection<Integer> aset=new HashSet<Integer>();
				
		// Possible Set(interface) is Parent of Array list
		Set<Integer> aset=new HashSet<Integer>();
		
		//HashSet is a class of Set(interface)
		//HashSet<Integer> aset=new HashSet<Integer>();
		//Unordered Set
		aset.add(100);
		aset.add(200);
		aset.add(300);
		aset.add(400);
		aset.add(500);
		aset.add(100);// duplicates will not be added in set
		System.out.println(aset);
		System.out.println(aset.size());
				
	
		
		//for each loop
		for(int i:aset) {
			System.out.println(i);	
		}
	}

}
