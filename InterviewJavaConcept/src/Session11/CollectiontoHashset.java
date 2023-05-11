package Session11;
import java.util.Collection;
import java.util.HashSet;

public class CollectiontoHashset {

	public static void main(String[] args) {
	
		Collection<String> alist =new HashSet<String>();
			
			alist.add("My");
			alist.add("Name");
			alist.add("is");
			alist.add("Poornima");
									
			for(String y : alist) {
				
				System.out.println(y);
			}
	}

}
