package JavaInterviewPrograms;

public class NumberReverse {
// reverse the entered number
	public static void main(String[] args) {
		int num=123456;
		int con=0;
		int temp=num;
		int a;
		while(num>0) {
			a=num%10; // reminder 
			con=con*10+a; // add the reminder & multiply by 10
			num=num/10;		
		}		
		System.out.println(" Reversed number ="+con);

	}

}

