package thiskeyword;

public class Son {

	public static void main(String[] args) {
		// Automatically calling Constructor Father
		Father Fatherobj=new Father();
		
		// Calling Methods from object created
		Fatherobj.details() ;
		Fatherobj.getdata() ;
		
		// Printing the object created which gives object id and reference
		System.out.println(Fatherobj);
		
		//return the current class instance or object
		//thiskeyword.Father@515f550a
		Fatherobj.profile();
		
	}
}
