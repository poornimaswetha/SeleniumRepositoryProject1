package InterviewTrainingJava;

public class Session6Arrays {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// 
		int[] p=new int[3];
		p[0]=123;
		p[1]=345;
		p[2]=234;
		System.out.println(p[1]);
		System.out.println("===============");
		
		// single dimensional array
		int[] a= {10,20,30,40,50};
		System.out.println(a[0]);
		System.out.println(a[1]);
		System.out.println(a[2]);
		System.out.println(a[3]);
		System.out.println(a[4]);
		System.out.println("===============");
		
		//single dimensional array in loop
		for (int i=0;i<a.length;i++) {
			System.out.println(a[i]);
		}
		System.out.println("===============");
		
		//Multidimensional Array
		int[][] b= {{2,4,6},{8,10,12}};
		System.out.println(b[0][0]);
		System.out.println(b[0][1]);
		System.out.println(b[0][2]);	
		
		System.out.println(b[1][0]);
		System.out.println(b[1][1]);
		System.out.println(b[1][2]);
		System.out.println("===============");
		
		//Multidimensional Array in Loop
		for (int m=0;m<b.length;m++) {
			for (int n=0;n<b[m].length;n++) {
				System.out.println(b[m][n]);	
			}		
		}

		System.out.println("===============");
		// Two dimensional string array
		
		String[][] c= {{"Good","Morning"},{"Good","Noon"}};
		for(String[] x:c) {
			for(String y:x) {
				System.out.println(y);
			}		
		}
	
		System.out.println("===============");
		
		// Objects Array list stores arrays of multiple datatypes
		Object[] z= {'a',"Norway",124.434,true};
		for(Object v:z) {
			System.out.println(v);
		}
}
}