//Given an array of integers greater than zero, find if it is possible to split it in two subarrays (without reordering the elements), such that the sum of the left subarrays is greater than right array. Print the two subarrays.
import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.function.*;
import java.util.regex.*;
import java.util.stream.*;
import static java.util.stream.Collectors.joining;
import static java.util.stream.Collectors.toList;

	public class SplitarrayListinto2Arraysleftgreaterthanrightsum {

		public static void main(String[] args) throws IOException {
			/*BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
			BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

			int arrCount = Integer.parseInt(bufferedReader.readLine().trim());

			List<Integer> arr = IntStream.range(0, arrCount).mapToObj(i -> {
				try {
					return bufferedReader.readLine().replaceAll("\\s+$", "");
				} catch (IOException ex) {
					throw new RuntimeException(ex);
				}
			}).map(String::trim).map(Integer::parseInt).collect(toList());

			int result = Result.splitIntoTwo(arr);

			bufferedWriter.write(String.valueOf(result));
			bufferedWriter.newLine();

			bufferedReader.close();
			bufferedWriter.close();*/
			// Driver program
		 		      
			List<Integer> arr = new ArrayList<Integer>();
			arr.add(1); 
			arr.add(2); 
			arr.add(3); 
			arr.add(4); 
			arr.add(5); 
			arr.add(5); 
		    int res=splitIntoTwo(arr);
		    
		    for (int i = 0; i < arr.size(); i++)
	        {
	            if(res== i)
	                System.out.println();	                  
	            System.out.print(arr.get(i) + " ");
	        }
		   
		}

		public static int splitIntoTwo(List<Integer> arr) {

			int leftSum = 0;
			int splitPoint=0;
			for (int i = 0; i < arr.size(); i++) {
				// add current element to left Sum
				leftSum += arr.get(i);

				// find sum of rest array
				// elements (rightSum)
				int rightSum = 0;
				for (int j = i + 1; j < arr.size(); j++)
					rightSum += arr.get(j);

				// split point index
				if (leftSum > rightSum)
					splitPoint =  i;
			}
			return splitPoint;
			
			
		}

	}

