package InterviewTrainingJava;

public class session4conditional {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Escape character
		String txt = "We are the so-called \"Vikings\" from the north.";
		System.out.println(txt);
		
		// Selection statement  -  if else if else statements
		int a=100;int b=200;int c=300;
		if (a>b) {
			System.out.println("a is greater than b");
		}
		else if (b>c) {
			System.out.println("b is greater than c");
		}
		else {
			System.out.println("c is greater than a");
		}
		
		// Selection statement  -  switch case statement
				int f=1;
				switch (f) {
				case 0:
					System.out.println("case is 0");
					break;
				case 1:
					System.out.println("case is 1");
					break;
				case 2:
					System.out.println("case is 2");
					break;
				case 3:
					System.out.println("case is 3");
					break;
				default:
					System.out.println("No cases are matching");
				
				}
				
				
				
		// Iterative statement  -  while statement
		// Executes the while loop until specified condition is reached
		int d=1;
		while (d<5) {
			System.out.println("d = "+d);
			d++;
			
		}
		
		// Iterative statement  - do while statement
		//This loop will execute the code block once, before checking if the condition is true, then it will repeat the loop as long as the condition is true.
		int e=1;
		do {
			System.out.println("e= "+e);
			e++;
		}while(e<5);
		
		// Iterative statement  - for loop
		for (int i=0;i<=20;i+=2) {
			System.out.println(i);
			
		}
		
		//Iterative statement  - for each loop is used for looping arrays mostly
		String[] m= {"Hi","How","are","you"};
		for (String str: m) {
			System.out.println(str);
			
		}
		int[] n= {1000,2000,3000,4000,5000};
		for (int val: n) {
			System.out.println(val);
			
		}
		
		// Transfer statement  - Continue Statement - skip the current one iteration in the loop
		for (int x=0;x<=20;x+=2) {
			if(x==10) {
			continue;
			}
			System.out.println(x);
		}
		
		// Transfer Statement - Try Catch finally
		
		try{
			int[] arr= {10,20,30,40,50};		
			System.out.println(arr[10]);
		}catch (Exception arr) {
			System.out.println("Something went wrong");
			//arr.printStackTrace();
		}
		finally {
			System.out.println("The 'try catch' is finished.");
		}
		
	}
}

