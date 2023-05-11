package Session4;

public class ArrayMethodsVariables {

	public static void main(String[] args) {
		
		// TODO Auto-generated method stub
		//Example 1
		/*int [] a= new int [3];
		a[0]=12;
		a[1]=13;
		a[2]=14;*/
		
		//Example 2
		int [] a= {9,5,7};
		
		/*System.out.println(a[0]);
		System.out.println(a[1]);
		System.out.println(a[2]);	
		System.out.println("************************");	*/
		
		//For loop Example
		/*for (int i=0;i<a.length;i++) {
		
			System.out.println(a[i]);
		}*/
		
		//For Each loop Example
		
		for (int i : a) {
			System.out.println(i);
			
			if(i==5) {
				break;
			}
		
		}
		
	}
}
