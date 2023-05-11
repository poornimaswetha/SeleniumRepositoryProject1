package JavaInterviewPrograms;

import java.util.Scanner;

public class FahtoCelcius {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the value of Fahrenheit :");
		double fh=sc.nextDouble();
		double Celcius=((5*(fh - 32.0))/9.0);
		System.out.println("Enter the value of Celcius : "+Celcius);

	}

}
