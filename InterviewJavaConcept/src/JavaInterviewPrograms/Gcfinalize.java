package JavaInterviewPrograms;

 class student {
	 //constructor
	 student(){
	 System.out.println("Student object created");
	 }
	 //finalize method
	 protected void finalize() {
	 System.out.println("Student object destroyed"); 
	 }
	//finalize method
	void display() {
	System.out.println("Student display method called"); 
	}	
}

public class Gcfinalize {
	public static void main(String[] args) {
		//object created for parent class student
		student stuobj=new student();
		stuobj.display(); // display method called 
		
		stuobj=null; // nullifying object Created
		
		System.gc(); // Calling garbage collection method to destroy object created
		//this gc method will call finalize method automatically from Parent class	
	}
}
