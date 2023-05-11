public class VariableExample2{
   int myVariable;
   static int data = 30;
   
   public static void main(String args[]){
      VariableExample2 obj = new VariableExample2();
      
      System.out.println("Value of instance variable: "+obj.myVariable);
      System.out.println("Value of static variable: "+VariableExample2.data);
   }
}