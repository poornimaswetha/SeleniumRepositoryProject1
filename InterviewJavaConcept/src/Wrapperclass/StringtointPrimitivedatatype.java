package Wrapperclass;

public class StringtointPrimitivedatatype {

	public static void main(String[] args) {
			
// parseint() method is used to get the primitive data type of a String.
// Used to convert a string to Primitive data type
		int x =Integer.parseInt("9");
		double c = Double.parseDouble("5");
		int b = Integer.parseInt("444",16);

        System.out.println(x);
		System.out.println(c);
		System.out.println(b);
}
}
