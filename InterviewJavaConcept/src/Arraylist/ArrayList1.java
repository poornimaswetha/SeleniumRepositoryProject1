package Arraylist;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class ArrayList1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Collection(i) > list(i) > ArrayList(c)
		
		// Possible Collection(interface) is Parent of Array list
		//Collection l=new ArrayList(); 
		
		// Possible List(interface) is Parent of Array list
		//List l=new ArrayList();
		
		ArrayList1 abc=new ArrayList1();// object created for constructor
		
		ArrayList l=new ArrayList();
		l.add(10); // index 0
		l.add(20); // index 1
		l.add(30);// index 2
		l.add("Poornima");// index 3
		l.add(true); // index 4
		
		// object can be added in list
		l.add(abc); // index 5
		
		 // shalu is added in index 2 position after 10,20
		l.add(2,"shalu"); 
		
		System.out.println(l);
		// size of array list
		System.out.println(l.size());
		
		// returns true if array list contains 10
		System.out.println(l.contains(10));
		
		ArrayList l2=new ArrayList();
		l2.add("newl2");
		
		//Inserts all of the elements in the specified collection into this list, starting at the specified position.
		l2.addAll(1,l);
		System.out.println(l2);
		
		// Clear l2
		l2.clear();
		System.out.println(l2);
		
		// isEmpty
		System.out.println(l2.isEmpty());
		
		// get the element in the index
		System.out.println(l.get(1));
		
		// Returns the index of the first occurrence of the specified element in this list, 
		//or -1 if this list does not contain the element.
		System.out.println(l.indexOf("Poornima"));
		System.out.println(l.indexOf("dog"));
		
		// adding duplicate to the array list
		l.add("Poornima");		
		System.out.println(l);
		
		//lastIndexOf(Object o)
		//Returns the index of the last occurrence of the specified element in this list, 
		//or -1 if this list does not contain the element.
		System.out.println("First Position :"+ l.indexOf("Poornima"));
		System.out.println("Last Position :"+ l.lastIndexOf("Poornima"));
		
		//set(int index, E element)
		//Replaces the element at the specified position in this list with the specified element.
		System.out.println(l);
		System.out.println(l.set(0, "20000"));
		System.out.println(l);
		
		// Remove()
		//Removes the first occurrence of the specified element from this list, if it is present.
		System.out.println("Removes index element 0 :"+ l.remove(0));
		System.out.println(l);
		
		//Removes the first occurrence of the specified element from this list, if it is present.
		System.out.println("Removes first occurance Poornima :"+ l.remove("Poornima"));
		System.out.println(l);
		
		//remove all
		System.out.println(l.removeAll(l));
		System.out.println(l);
		
	
		
	}
}
