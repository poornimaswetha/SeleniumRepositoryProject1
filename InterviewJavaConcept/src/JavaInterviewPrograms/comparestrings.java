package JavaInterviewPrograms;

import java.util.Scanner;

// Compare 2 strings
public class comparestrings {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the first string: ");
		String first = sc.nextLine();
		System.out.println("Enter the second string: ");
		String second = sc.nextLine();
		//method call
		comparestring(first,second);
		sc.close();
	}

	private static void comparestring(String f, String s) {
		if(f.compareTo(s)==0) {// string compare function 
			System.out.println("Strings are equal");
		}else
		{
			System.out.println("Strings are not equal");
		}
		
	}
	
		
}
