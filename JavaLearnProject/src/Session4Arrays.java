
public class Session4Arrays {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] a = new int[2];
		int b[]= new int[3];
		int c[]= {90,80,70,60};
		
		a[0]=12;
		a[1]=34;
				
		b[0]=56;
		b[1]=34;
		b[2]=23;
		System.out.println("==== Single Dimensional Arrays====");		
		for (int i=0;i<a.length;i++) {// length is predefined variable in Array
			System.out.println(a[i]);
		}
		
		for (int j=0;j<b.length;j++) {
			System.out.println(b[j]);
		}	
		for (int k=0;k<c.length;k++) {
			System.out.println(c[k]);
		}	
		for(int i:c) {
			System.out.println(i);
		}
		System.out.println("==== Two Dimensional Arrays====");
		int [][] e =new int[2][3];
		e[0][0]=10;
		e[0][1]=20;
		e[0][2]=30;		
		
		e[1][0]=40;
		e[1][1]=50;
		e[1][2]=60;
		
			
		for (int row=0; row<e.length;row++) {
			for ( int col=0;col<e[row].length;col++) {
				System.out.println(e[row][col]);
			}
			
		}
		
		System.out.println("==== Double ====");
		double d[]= {12.2,56.7,56.5};
		
		for (int i=0;i<d.length;i++) {
			System.out.println(d[i]);
		}
		
		System.out.println("==== String ====");
		String s[]= {"poornima","Hello","Morning"};
		
		for (String i:s) {
			System.out.println(i);
		}
		
		System.out.println("==== Char ====");
		char h[]= {'a','z','L'};
		
		for (int i=0;i<h.length;i++) {
			System.out.println(h[i]);
		}
		// Object Arrays are used to store multiple types of object in a single array
		System.out.println("==== object ====");
		Object j[]= {'a',"happy",3.34,123};
		
		for (Object i:j) {
			System.out.println(i);
		}

	}

}
