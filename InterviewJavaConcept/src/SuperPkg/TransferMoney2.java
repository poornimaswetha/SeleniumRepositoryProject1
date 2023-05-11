package SuperPkg;	
//Parent Class
class PayMoney{		
	//Parent Constructor
	PayMoney(int amount) {	
		System.out.println("This is PayMoney Parent Constructor :"+amount);
	}

}
//Child Class
class InternetBanking extends PayMoney{
	
	//Child Constructor
	InternetBanking(){
		//super();// We are Manually or explicitly calling No Argument Parent constructor of Parent Class
		super(2000); // We are Manually  or explicitly calling parametrized Parent constructor of Parent Class
		System.out.println("This is InternetBanking Child Constructor");
	}
}
//Main Class
public class TransferMoney2 {	
	public static void main(String[] args) {
		// Compiler will call Child Constructor automatically
		InternetBanking Internetobj=new InternetBanking();
		
	}
}
