package JavaInterviewPrograms;
// split the string against given expression and store it in an array 
public class ReverseSentence {

	public static void main(String[] args) {
		String sentence="Java is a Programming Language";
		System.out.println(ReversetheSentence(sentence));

	}

	private static String ReversetheSentence(String sentence) {
		String reverse="";
		String[] words=sentence.split(" ");
		for(int i=words.length-1;i>=0;i--) {
			reverse=reverse+words[i]+" ";
		}			
		return reverse;
	}
	
	

}

