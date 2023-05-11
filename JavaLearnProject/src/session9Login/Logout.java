package session9Login;

public class Logout {
	
	public void logoutfromApplication()
	{
		System.out.println("Logout from Application");
		Login lgn=new Login();		
		System.out.println(lgn.username);
		System.out.println(lgn.password);
		lgn.logintoApplication();	
		
	}


}
