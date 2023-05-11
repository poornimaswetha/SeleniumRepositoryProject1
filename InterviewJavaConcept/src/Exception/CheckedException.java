package Exception;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;

public class CheckedException {
//Checked Exception means 
//Error occur before compiling
	public static void main(String[] args) throws FileNotFoundException {

		File fl = new File("ABC\\abc.txt");

		// FileReader class >FileReader method
		// U have to add File object to the buffered reader
		FileReader fr = new FileReader(fl);

	}
}
