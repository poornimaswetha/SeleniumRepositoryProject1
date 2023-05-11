package Handlingfiles;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class CreateFiles1 {

	public static void main(String[] args) throws IOException {
		try {
			// File class created
			File fl=new File("D:\\SeliniumWorkspace\\InterviewJavaConcept\\ABC\\Td2.txt");
			fl.createNewFile();
			//Creating a New file
			if (fl.createNewFile()) {
				System.out.println(fl.getName());			
			}
			else {
				System.out.println("This file name :"+fl.getName()+" already exist");
			}
			//Writing inside a file already created
			FileWriter fw=new FileWriter(fl);
			fw.write("Hello World!! Good Morning");
			fw.close();
			System.out.println("Successfull Wrote Td1.txt file");
		}
		
		catch(IOException e) {
			System.out.println("Error Occured");		
			//e.printStackTrace();
		}

	}

}
