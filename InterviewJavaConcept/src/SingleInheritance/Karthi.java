package SingleInheritance;

public class Karthi extends Sivakumar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Karthi karthiobj = new Karthi();		
	
		karthiobj.gardening(); //default/package method 		
		karthiobj.doyoga();// protected method
		System.out.println(karthiobj.doorno);// default variable  
		System.out.println(karthiobj.petname);// protected variable
		
		//Method overriding - since Object is created for karthi class
		//karthi class acting() method will be over ridden 
		karthiobj.acting();
		karthiobj.pocketmoney();
		}
	
	public void latestmovie() {
		System.out.println("latestmovie method called");
	}
		
	//Method Overridding 
	//Same acting method done by child class and Parent class	
	public void acting() {
		System.out.println("Karthi acting method called");
	}
	//cant be overrriden because this method is final in parent class
	/*public void pocketmoney() {
	
	}*/
	}


