package session8package;

import color.*; // * is used to call all classes from different package

public class Session8CarColour {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Session8red red=new Session8red();
		Session8Yellow yellow = new Session8Yellow();
		Session8Blue Blue = new Session8Blue();
		
		System.out.println(red.rColor);
		System.out.println(red.rname); ;
		red.methodRed();	
		Blue.methodBlue();
	    yellow.methodYellow();
	}
	
	

}
