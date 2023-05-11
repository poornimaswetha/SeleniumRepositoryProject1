package Arraylist;


//Importing ArrayList class from
//java.util package
import java.util.ArrayList;

//Class
public class Arrarylist5 {

 // Main driver method
 public static void main(String[] args)
 {

     // Make Person data-type objects
     Person p1 = new Person("Aditya", 19);
     Person p2 = new Person("Shivam", 19);
     Person p3 = new Person("Anuj", 15);

     // Create an ArrayList object
     //(Declaring List of Person type)
     ArrayList<Person> names = new ArrayList<Person>();

     // Adding objects to the ArrayList
     names.add(p1);
     names.add(p2);
     names.add(p3);

     // Print and display the elements of adobe ArrayList
     // using get() method
     System.out.println(names.get(0).name);
     System.out.println(names.get(0).age);
     System.out.println(names.get(1).name);
     System.out.println(names.get(1).age);
     System.out.println(names.get(2).name);
     System.out.println(names.get(2).age);

     // New Line
     System.out.println();

     // Optional Part for better understanding
     System.out.println(
         "Optional Part Added For Better Understanding");

     // (Optional)
     // Displaying what happens if printed by simply
     // passing List object as parameter
     System.out.println(names);
 }
}

//Class user-defined
class Person {

 // Random properties associated with the person
 // Person name
 String name;
 // Person age
 int age;

 // Constructor for class Person
 // for initializing objects
 Person(String name, int age)
 {
     // This keyword for efering to current object
     this.name = name;
     this.age = age;
 }
}

