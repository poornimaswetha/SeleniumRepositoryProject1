package thiskeyword;

public class Father {
	int parent_id;
	String Father_name;
	String Father_address;	
	//Constructor no argument
	Father(){
		//1- Calling parameterized Constructor using this keyword
		this(1254,"sanvi","12 Raja street");
		System.out.println("Default Constructor with no argument");		
	}
	//Constructor Parameterized
	Father(int parent_id,String Father_name,String Father_address){		
		//1- Calling another parameterized Constructor using this keyword
		this("2132312"); 
		System.out.println("Parameterized Constructor");
		//2 - To refer the current class instance variable 
		//2 - when the Parameterized Constructor variable are having same name		
		this.parent_id=parent_id; 
		this.Father_name=Father_name;
		this.Father_address=Father_address;	
		System.out.println("This is the parent_id from constructor using this keyword : "+parent_id);
		System.out.println("This is the Father_name from constructor using this keyword: "+Father_name);
		System.out.println("This is the Father_address from constructor using this keyword: "+Father_address);
	}
	//Constructor Parameterized
	Father(String Pincode){		
		System.out.println("This is the Pincode from parameterized constructor :"+Pincode);
	}
	
	// Method
	void getdata() {
		//3- refer the current class instance or object inside a method or a constructor
		//thiskeyword.Father@515f550a
		System.out.println(this);
		System.out.println("getdata method");
	}
	// Method
	void details() {
		//4 - Access method using this keyword inside another method
		
		int parent_id=8790;
		String Father_name="Nagarajan";
		String Father_address="Gandhi street";
		this.getdata(); 
		System.out.println("This is the parent_id from method Local variable : "+parent_id);
		System.out.println("This is the Father_name from method Local variable : "+Father_name);
		System.out.println("This is the Father_address from method Local variable : "+Father_address);	
	
	}
	//5 - return Current class -  Method
	Father profile() {
		//return the current class instance or object
		return this;
	}
	
