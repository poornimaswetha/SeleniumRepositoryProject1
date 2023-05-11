
public class VariableDeclare {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//variable Declation
		// Datatype variablename = Value;
		
		//sum only if a value is greater than b otherwise don't sum exit
		
		int a=300000;
		int b=20000;
		boolean flag=false;
		
		if (a>b)
		{	flag=true;
		System.out.println(flag);
					
		}
		if (flag)// True
		{
			int sum = a+b;
			System.out.println(sum);
			
		}
		else // false
		{
			System.out.println("Error : Input value a should be greater than b to sum");
		}
		
	}
}
