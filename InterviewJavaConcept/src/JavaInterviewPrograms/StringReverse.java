package JavaInterviewPrograms;
// convert string to Array
// toCharArray() Method used here 
public class StringReverse {
	public static void main(String[] args) {
		String s="Poornima";
		String rev="";
		char arrs[]=s.toCharArray(); // to convert a string to Character Array use .toCharArray()
		for(int i=arrs.length-1;i>=0;i--) {
			rev=rev+arrs[i];
		}
		System.out.println(rev);
	}
}
