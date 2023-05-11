package Arraylist;

import java.util.*;

public class Arraylist3 {

	public static void main(String[] args) {
		
		// TODO Auto-generated method stub
		ArrayList<String> alist=new ArrayList<String>();
		alist.add("anil");
		alist.add("Bhavya");
		alist.add("Chitra");
		alist.add("David");
		alist.add("Fazil");
		System.out.println(alist);
		System.out.println(alist.size());
		
		//set the element in that index position
		System.out.println(alist.set(0, "Anand"));
		
		
		// Removes element in that index position
		alist.remove(4);
				
					
		//for-loop	
		for(int i=0;i< alist.size();i++) {
			System.out.println(alist.get(i));	
		}
		
		/*
		//for each loop
		for(String i:alist) {
			System.out.println(i);	
		}*/	
		}

}
