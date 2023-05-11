package Session11;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class FileRead {

	public static void main(String[] args) throws IOException {
		
		// TODO Auto-generated method stub
		File fil = new File("ABC\\abc.txt");
		
		if (fil.exists()){			
			
			System.out.println("File exists !!");
			System.out.println(fil.getAbsolutePath());
		}
		else{
			
			System.out.println("File does not exists");
		}
		
		FileReader fr =new FileReader(fil);
		BufferedReader br = new BufferedReader(fr);
	
		String str;
		
		while ((str=br.readLine())!=null){
			System.out.println(str);	
		}
		
		br.close();
		
	}

}
