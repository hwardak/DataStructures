import java.io.File;
import java.io.IOException;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Scanner;

/*    Class MainSwitch                             
 *    Author: Hasib Wardak
 *    
 *    
 *    Data:   txtFile: String to hold the file path. 
 *    		  url: File to hold the String that holds the path to the switch.txt file.
 *    
 *    Program:  This program and its main method operations are to simulate a network 
 *    			switch booting up, and processing frames as they come in. It will 
 *    			request an int from the user to dynamically allocated memory for an 
 *    			array to hold the SwitchEntry objects.
 */
public class MainSwitch {
	 private static String txtFile;

	public static void main(String[] args){
		//Switch obj is instantiated and its default constructor prompts for the 
		//max size of the SwitchEntry() array camTable[maxNum].
		Switch s = new Switch();
		//Frame() reference declared, to be renewed in while loop as we process every new frame.
		 Frame f = null;
		//String to hold the local address of file to process.
		
		//
		Scanner in = new Scanner(System.in);

		System.out.print("Please enter file destination: ");
		
		txtFile = in.nextLine();
		
		
		//*********************************************\\
		// **** Uncomment below line when testing  **** \\
		//txtFile = "/Users/HWardak/Desktop/switch.txt";
		//*********************************************//
		
		//Spacer 
		System.out.print("\n");
		
		//Instantiate Path type object by passing the file address as a String.
		//To be passed into a separate Scanner object instantiation, so that 
		//we may pass a Scanner object to Frame()'s method 
		//readFrame:boolean(Scanner).
		
		File url = new File(txtFile);
		//Path url = Paths.get(txtFile);
		
		//Below we loop through each line in the .txt file as if it were a 
		//frame. While the text file has a line to read left, a new instance of
		//Frame() is instantiated (Not in an array, just looped through). In 
		//the newly instantiated Frame() instance, the readFrame(Scanner) method
		//is called, which will assign passed arguments into field variables and 
		//return true if the frame passed in contained data that fulfilled the 
		//criteria of a frame. 
		//>>additional info in Frame().
		
			
			Scanner in2 = null;
			try {
				in2 = new Scanner(url);
				while(in2.hasNextLine()){
					f = new Frame();
					f.readFrame(in2);
					s.processFrame(f);
				}	
			} catch (IOException e) {
				System.out.println("No file");
				//e.printStackTrace();
			}
		s.displayTable();

	}

}














