package Session11;

import java.util.ArrayList;

public class CollectionFramework {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int [] a= new int[4];
		a[0]=12;
		a[1]=10;
		a[2]=11;
		a[3]=14;
		
		for (int i=0; i<a.length;i++) {
			
		System.out.println(a[i]);
		
			
		}
		
		System.out.println("====================");
		
		ArrayList<Integer> alist =new ArrayList<Integer>();
		alist.add(3);
		alist.add(4);
		alist.add(2);
		alist.add(8);
		
		System.out.println(alist.get(0));
		System.out.println(alist.get(1));
		System.out.println(alist.get(2));
		System.out.println(alist.get(3));
		
		System.out.println("size of array list ="+ alist.size());
		System.out.println("====================");
		
		for(int x=0;x<alist.size();x++) {
			System.out.println(alist.get(x));	
			
		}
		System.out.println("====================");
		
		for(Integer y : alist) {
			
			System.out.println(y);
		}
		System.out.println("====================");
	}

}
