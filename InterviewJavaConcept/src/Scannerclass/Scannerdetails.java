package Scannerclass;

import java.util.Scanner;

public class Scannerdetails {

	public static void main(String[] args) {
		// Created Scanner Object
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Your Name :");
		while (sc.hasNextLine()) {
			System.out.println(sc.nextLine());//Read User Input
		}

	}

}
