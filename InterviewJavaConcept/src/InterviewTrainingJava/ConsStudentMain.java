package InterviewTrainingJava;

//package imported here as it is in different package
//if you are not importing constructors will throw error
import InterviewTraining2.*;

public class ConsStudentMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ConsStudent  cust1=new ConsStudent("Anu",23,"Pearl");
		ConsStudent  cust2=new ConsStudent("Priya","2343 4324 2343","97804568");
		ConsStudent  cust3=new ConsStudent("Shalu","89056");
		Consteachers teach1=new Consteachers("JayaMam",45,"Pearl");
		// only if the varaibles and methods are public then it can be accessed from different package
		// otherwise it has to be inherited means 'extends'
		cust1.details();
		cust2.details();
		cust3.details();
		teach1.tdetails();
		
	}

}
