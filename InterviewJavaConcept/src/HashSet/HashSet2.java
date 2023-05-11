package HashSet;
import java.util.Collection;
import java.util.HashSet;
import java.util.Set;
public class HashSet2 {

			public static void main(String[] args) {
				// TODO Auto-generated method stub
				//Collection(i) > list(i) > ArrayList(c)
						
				// Possible Collection(interface) is Parent of Array list		
				//Collection<String> aset=new HashSet<String>();
						
				// Possible Set(interface) is Parent of Array list
				//Set<String> aset=new HashSet<String>();
				
				//HashSet is a class of Set(interface)
				HashSet<String> aset=new HashSet<String>();
				//Unordered Set
				aset.add("Abinav");
				aset.add("Bagya");
				aset.add("Cylina");
				aset.add("Dhanya");
				aset.add("Eliyana");
				aset.add("Fathima");// duplicates will not be added in set
				System.out.println(aset);
				System.out.println(aset.size());
			
				//for each loop
				for(String i:aset) {
					System.out.println(i);	
				}

	}

}
