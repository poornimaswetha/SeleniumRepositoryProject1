package InterviewTrainingJava;
public class Session7Object {
	int x=90;	
	public static void main(String[] args) {			
		Session7Object myObj = new Session7Object(); //object creation		
		Session7Object newObj = new Session7Object(); // multiple objects created for one class
	    System.out.println(myObj.x);
	    System.out.println(newObj.x);
	}
}
