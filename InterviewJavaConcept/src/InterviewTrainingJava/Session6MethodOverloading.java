package InterviewTrainingJava;

public class Session6MethodOverloading {
	
		// Method overloading - same method name with different parameters
		// same name with different parameters
		// Number of parameters
		// order of parameters changed
		public static void main(String[] args) {
			
			System.out.println( addMethod(10, 20));
			System.out.println( addMethod(109));
			System.out.println( addMethod(10.56, 20.89));
			addMethod(23, 34.78);
			addMethod(12.45,56);
		}
		  	
		// same name with different parameters
		 static int addMethod(int i, int j) {
			// TODO Auto-generated method stub
			return i+j;
		}		 
			
		// Number of parameters
		 static int addMethod(int i) {
				// TODO Auto-generated method stub
				return i;
			}
		 
		 static double addMethod(double i, double j) {
			// TODO Auto-generated method stub
			return i+j;
		}
		 // order of parameters changed
		static  void addMethod(int i, double j) {
				// TODO Auto-generated method stub
			System.out.println(i+j);
			}		
		//different type of parameters
		static  void addMethod(double i, int j) {
				// TODO Auto-generated method stub
			System.out.println(i+j);
			}		

}
