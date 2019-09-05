import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
public class TestFileReadData {


	
	
	public static void main(String[] args) {
		//create new file 
		File gridFile = new File("sample4x5.txt");
		//try to read it with a scanner
		try {
			Scanner reader = new Scanner(gridFile);
			
			//save the first line values into a string value. 
			String dimensions = (reader.nextLine());
		
			//parse this into separate Strings based on the spaces between them 
			String[] values = dimensions.split("");
			//	creating a new array
			String[] numberValues = new String[values.length];
			
			//remove white spaces by looping through values array checking if index contains a numbber 
			// add number String values to new array
			int count = 0;
			for (String index: values) {
				if(index.contains(" ") == false) {
					numberValues[]
				}
				
			}
			
			
			System.out.print(values[0]);
			System.out.print(values[1]);
			System.out.print(values[2]);
			//convert the individual string values into integers
			
			// save them as seperate values
			
			// use these values to create  a new 2d array.
			
			
			//two variables representing the rows and columns of the grid
			
			//Instantiate a new 2d array based on these dimensions
			//
			
			
			
		
		}
		
		catch (FileNotFoundException e) {
			System.out.println("invalid file name!");
		}
		
			
		

	}

}
