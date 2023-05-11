package Arraylist;

import java.util.ArrayList;

public class ArrayList2 {

	public static void main(String[] args) {
				
		ArrayList<Integer> alist=new ArrayList<Integer>();
		alist.add(100);
		alist.add(200);
		alist.add(300);
		alist.add(400);
		alist.add(500);
	
		System.out.println(alist);
		System.out.println(alist.size());
				
		//for-loop
		/*
		for(int i=0;i< alist.size();i++) {
			System.out.println(alist.get(i));	
		}*/
		
		//for each loop
		for(int i:alist) {
			System.out.println(i);	
		}
		

	}

}
