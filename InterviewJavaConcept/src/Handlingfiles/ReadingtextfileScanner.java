package Handlingfiles;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class ReadingtextfileScanner {

	public static void main(String[] args){
		try {
			//File class created
			File fl=new File("D:\\SeliniumWorkspace\\DemoSeleniumProject\\ABC\\Td1.txt");
			
			// Read the files using Scanner class
			Scanner sc=new Scanner(fl);
				while(sc.hasNextLine()) {
				System.out.println(sc.nextLine());			
				}
		sc.close();		
		}catch(FileNotFoundException e) {
			
			System.out.println("Error Occured");	
		}
	}
}

		
		




