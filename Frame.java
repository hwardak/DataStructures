import java.io.File;
import java.util.Scanner;

/*    Class Frame                             
 *    Purpose:  This class models a network frame which would be passed in network communications.
 *   
 *    Author:  Hasib Wardak
 *    
 *    Data:   	portCode:  	String (to hold the a port code.)
 *    			frameData:	String (to hold the actual data the frame is carrying.)
 *    			destAdd:	MACAddress (a reference to one instance of the MACaddress class.)
 *    			sourAdd:	MACAddress (a reference to one instance of the MACaddress class.)
 *    
 *    Methods:  default constructor - initializes MACAddress() instances and assigns them references.
 *              initial constructor (String, String, MACAddress, MACAddress) - to assigned received arguments
 *              															   to global variables.
 *              readFrame (Scanner): boolean - Read a Scanner object and declare true if the frame is has 'Good' 
 *              								data, otherwise false.
 *              toString():String - returns a String with all the data in the frame.
 */
public class Frame {
	
	private String portCode, frameData;

	MACAddress destAdd, sourAdd;
	

	public Frame(){
		 destAdd = new MACAddress();
		 sourAdd = new MACAddress();

	}
	
	public Frame(String pC, String fD, MACAddress dA, MACAddress sA){
		//This method is not in use as of this version.
		this.portCode = pC;
		this.frameData = fD;
		this.destAdd = dA;
		this.sourAdd = sA;
	}
	
	public boolean readFrame(Scanner scan){
		//As of this version we are just check to see if the file has data to
		//read or not.
		//In later versions, we may have to check to see if the file data 
		//matches expected frame criteria.
		if (scan.hasNextLine()){
		this.portCode = scan.next();
		this.destAdd.readAddress(scan);
		this.sourAdd.readAddress(scan);
		this.frameData = scan.next();
			return true;}
		else return false;
	}
	
	public String getPortCode(){
		return this.portCode;
	}
	
	public MACAddress getDestAdd(){
		return this.destAdd;
	}

	public MACAddress getSourAdd(){
		return this.sourAdd;
	}

	public String getFrameData(){
		return this.frameData;
	}

	
	public String toString() {
		return 	  "Port Code: " + portCode 
				+ "frameData " + frameData 
				+ "Destination Address: " + destAdd
				+ "Source Address: " +sourAdd;
	}
}

