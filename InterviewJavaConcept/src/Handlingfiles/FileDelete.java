package Handlingfiles;

import java.io.File;

public class FileDelete {

	public static void main(String[] args) {
		// File is a classname
		File fl=new File("ABC\\abc.txt");
		if (fl.exists()) {
		System.out.println("This file exists in the project location");
		fl.delete();
		System.out.println("Deleted the file: " + fl.getName());
		}
		else {
		System.out.println("This file does not exists in the project location");
		}

	}
}

