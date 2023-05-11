package SuperPkg;
//Parent Class
class PayBills{
	int amount=2000;
	
void payment() {	
	System.out.println("This is Payment Method inside PayBills Class");
	}
}


//Child Class
class GooglePay extends PayBills{
	void payment(){
	int amount=100;	
	
	//Calls the Parent method having same method name
	//super.payment();
	System.out.println("This is Payment Method inside GooglePay Class = "+amount);
	
	//Calls the Parent instance variable have same variable name
	System.out.println("This is Payment Method inside GooglePay Class = "+super.amount);
	}	
}

//Main Class
public class TransferMoney {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		GooglePay GooglePayobj=new GooglePay();
		GooglePayobj.payment();
	}
}
