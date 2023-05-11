package Handlingfiles;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class FileReading {

	public static void main(String[] args) throws IOException {
		
		File fl=new File("D:\\SeliniumWorkspace\\InterviewJavaConcept\\ABC\\Td1.txt");
		
		//FileReader class >FileReader method
		// U have to add File object to the buffered reader
		FileReader fr=new FileReader(fl);
	
		//BufferedReader Class has > Readline() Method to read line
		// U have to add a reader fr for BufferedReader
		BufferedReader Br=new BufferedReader(fr);
		
		String str;
		while((str=Br.readLine())!=null) {
			System.out.println(str);
		}
		
		/*System.out.println(Br.readLine());
		System.out.println(Br.readLine());
		System.out.println(Br.readLine());
		System.out.println(Br.readLine());
		System.out.println(Br.readLine());
		System.out.println(Br.readLine());
		System.out.println(Br.readLine());
		System.out.println(Br.readLine());
		System.out.println(Br.readLine());
		System.out.println(Br.readLine());*/
		
		Br.close();
	}

}
