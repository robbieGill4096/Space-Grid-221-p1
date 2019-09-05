import java.io.*;

import java.util.Scanner;

public class testingConstructor 

{
public static void main(String[] args) {
	String filename = "negatives.txt";
	File currentFile = new File(filename);

	Scanner reader;
	try {
		reader = new Scanner(currentFile);
		while(reader.hasNextLine()) {
			String str = reader.nextLine();
			System.out.println(str);
		}
		
		
	} catch (FileNotFoundException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	//String content = reader.nextLine();
	
}
}
