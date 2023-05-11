package Session4;

public class TwoDimArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Example 1
		/*
		 * int [][]a=new int [2][3];
		 * 
		 * a[0][0]=12; a[0][1]=11; a[0][2]=11;
		 * 
		 * a[1][0]=133; a[1][1]=111; a[0][2]=11;
		 * 
		 * System.out.println(a[1][0]);
		 */
			
		/*
		 * //Example 2 
		 * int[][]a= {{11,12,99},{10,34,67}};
		 * 
		 * //Finding the number of rows in 2 dimensional Array
		 * System.out.println(a.length);
		 * 
		 * //Finding the number of Columns in 2 dimensional Array
		 * System.out.println(a[0].length);
		 */
		
		
	/*	//Example 3
		
		int[][]a= {{11,12,99},{10,34,67}};
		for(int r=0;r<a.length;r++) {
			for (int c=0;c<a[0].length;c++) {
				System.out.println(a[r][c]);
			}*/
		
		//Example 4 - using objects
		Object[] a= {"Arun",1,true,5.6,'l'};
		for(Object i: a) {
			System.out.println(i);		
		}
		
	}

}
