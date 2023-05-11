package SingleInheritance;

// Child Class or Sub Class
// Child class extends Parent class or 
// sub class extends super class
public class Surya extends Sivakumar{

	public static void main(String[] args) {
		// TODO Auto-generated method stub		
		Surya suryaobj=new Surya();
		
		//Final variables can be used in child class but cannot be edited
		System.out.println(suryaobj.charityamt);
		
		//Final variables can be used in child class cannot be edited
		//suryaobj.charityamt=60;
		
		//Final methods can be used in child class but cannot be overridden 
		suryaobj.pocketmoney();
		
		
		suryaobj.gardening();//default/package method 
		suryaobj.acting(); //public method
		suryaobj.doyoga();// protected method		
		System.out.println(suryaobj.doorno);// default variable  
		System.out.println(suryaobj.petname);// protected variable
		
		//Method overriding - since Object is created for Surya class
		// surya class acting() method will be over ridden 
		suryaobj.acting();
		}
	
	//Final methods can be used in child class but cannot be overridden 
	/*public void pocketmoney() {
		
	}*/
	
	public void producemovie() {
		System.out.println("producemovie method called");
	}
	public void actinadvt() {
		System.out.println("actinadvt method called");
	}
	
	//Method Overridding 
	//Same acting method done by child class and Parent class also
	
	public void acting() {
		System.out.println("Surya acting method called");
	}

}
