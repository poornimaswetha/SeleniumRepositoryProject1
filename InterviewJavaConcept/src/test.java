import java.util.ArrayList;
import java.util.List;

public class test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			List<String> res = fizzBuzz(15);
			System.out.println(res);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public static List<String> fizzBuzz(int n) {
			        List<String> Stringlist=new ArrayList<String>();
			        for(int i=1;i<=n;i++){
			            if(i%3==0 && i%5==0){
			            	Stringlist.add("FizzBuzz") ;
			                continue;
			            }
			              if(i%3==0){
			            	  Stringlist.add("Fizz") ;
			                continue;
			            }
			              if(i%5==0){
			            	  Stringlist.add("Buzz") ;
			                continue;
			            }
			              
			                Stringlist.add(i+"");
			               
			            }
			            return Stringlist;
			        }
			    }

	

