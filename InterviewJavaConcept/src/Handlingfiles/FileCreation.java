package Handlingfiles;

import java.io.File;

public class FileCreation {

	public static void main(String[] args) {
		// File is a classname
		File fl=new File("D:\\SeliniumWorkspace\\InterviewJavaConcept\\ABC\\Td1.txt");
		if (fl.exists()) {
			System.out.println("This file exists in the project location");
		}
		else {
			System.out.println("This file does not exists in the project location");
		}

	}

}
