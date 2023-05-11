
public class Session7StringMethods {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String a="Poornima-Devi-Nagarajan-Rengaraja-koodalingan";
		String b="   Poornima   Devi  ";
		System.out.println(a.equals(b));
		
		String fullname=a+ " "+b;
		System.out.println(fullname.length());
		
		System.out.println(a.substring(3, 13));
		System.out.println(b.trim()); // trim removes the spaces
		
		System.out.println(a.indexOf("rr")); // start letter index // -1 will be the output if the letter are not there in string
		
		String[] n=a.split("-"); // here return value will be array so stored in String array
	
		for (String i:n) {
			System.out.println(i);
		}

	}

}
