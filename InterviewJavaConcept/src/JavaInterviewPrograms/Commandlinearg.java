package JavaInterviewPrograms;

public class Commandlinearg {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		if (args.length > 0) {
		      System.out.println("The command line"+ " arguments are:");
		      for(String val:args)
		       System.out.println(val); 
		    } else
		        System.out.println("No command line "+ "arguments found."); 
		 } 
	}
