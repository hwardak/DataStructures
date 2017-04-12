import java.util.Scanner;

/*    Class 	Switch                             
 *    Purpose:  This class models a network frame which would be passed in network communications.
 *   
 *    Author:  	Hasib Wardak
 *    
 *    Data:   	numEntry:	int (To hold the current number of entries in the CAM table.)
 *    			maxNum:		int (To hold the maximum number of entries currently allocated
 *    						to the CAM table.)
 *    
 *    Methods:  default constructor		- 	Simulates the Switch being booted and will prompt the user for 
 *    								  	  	how many possible entries will be required in the CAM table.
 *              processFrame (Frame):  	- 	This method is the muscle of the application, it will look for 
 *              							the source MAC address in the CAM table, if it does not exist
 *              							the method will add it to the CAM table along with the port it
 *              							came in through. Afterwards it will look for the destination 
 *              							MAC address in the CAM table, if it exists it will send the 
 *              							frame data out through the appropriate port. If the destination 
 *              							MAC address does not exist in the CAM table, the switch will 
 *              							'flood' all ports with the out going frame. 
 *              displayTable			-	This will display all the entries in CAM table, in an orderly, 
 *              							human readable format.
 *              search (MACAddress)		-	Taking a MACaddress object as an argument, it will return true
 *              							or false, depending if that MACaddress exists in the CAM table
 *              							or not.
 */
public class Switch {
	//Was originally called sE[], once it was renamed to camTable, the logic was
	//much easier to understand and develop.
	//SwitchEntry array called camTable is declared, to be instantiated in the
	//default constructor, once maxNum is assigned its value.
	SwitchEntry camTable[];
	private int numEntry, maxNum;
	Scanner in = new Scanner(System.in);

	public Switch(){
		System.out.println("CAM Table size?");
		maxNum = in.nextInt();
		camTable = new SwitchEntry[maxNum];
	}


							 		 //-------------\\
									// PROCESS FRAME \\
						   		   //      HERE       \\
//*****************************************************************************
	public void processFrame(Frame frame){
		// Add the source add and port if it does not exist in CAM table.
		// Check to see if the source MAC address is in the CAM table or not. 
		// In-line post incrementing on numEntry, once the entry is made, for 
		// two reasons.. to mark the number of entries, and to set ensure the
		// the next time the method is called the index is set to the next one.
	
		//System.out.print("\n");
		if(!search(frame.getSourAdd()) ){
			camTable[numEntry++] 
					= new SwitchEntry(frame.getSourAdd(), frame.getPortCode());
			System.out.println("Adding " 
			+ frame.getSourAdd() 
			+ " to camTable");
		}
		if(!search(frame.getDestAdd()) ){
			System.out.println("Flooding frame with data " 
				+ frame.getFrameData()
				+ " from \n" 
				+ frame.getSourAdd() 
				+" to " 
				+ frame.getDestAdd()
				+  " out\nall ports");
		//numEntry++;
		}else 
			System.out.println("Sending frame with data" 
				+ frame.getFrameData() 
				+ " from\n" + frame.getSourAdd()
				+ " to " + frame.getDestAdd()
				+ "out\nport " + frame.getPortCode());
		}
		//numEntry++;	
//*****************************************************************************

	//Should display table, one row per entry. 
	public void displayTable(){
		if(camTable[0]!=null){
		System.out.println("\nCAM Table is:");
		for(int i=0; i < numEntry;){
			if (camTable[i] != null)
			System.out.println(camTable[i++].toString()); }
	}}


	public boolean search(MACAddress MacAdd){
		for(int i = 0; i < numEntry;){
			if(camTable[i++].getAddress().isEqual(MacAdd)){
				return true; }
		}return false;
		
	}
	
}