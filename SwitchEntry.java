/*    Class:	SwitchEntry                           
 *    Purpose:  This class models a networking hardware address - also known as MAC Address
 *    Author:  	Hasib Wardak
 *    
 *    Data:   	portCode: String to hold the port code assigned to each MACaddress.
 *    			Mac: MACAddress object to reference MACAddress objects.
 *    
 *    Methods:  default constructor						- Does nothing as of this version.
 *              initial constructor (MACaddress, String)- Assigns arguments to global variables. 
 *              addEntry (MACaddress, String)			- Does nothing as of this version.
 *              toString (String) 						- Prints a string displaying current camTable entry.
 *              isEqual(MACAddress):boolean 			- to compare the a MAC Address in parameter 
 *              										  to this entry to see if they match. 
 *             
 */
public class SwitchEntry {
	private String portCode;
	MACAddress Mac;

	public SwitchEntry(){
		// does nothing as of this version.
	}

	
	//** what is the difference between the two methods below ?
	public SwitchEntry(MACAddress Mac, String portC){
		this.portCode = portC;
		this.Mac = Mac;	
	}
	
	//if the MACaddress is already in the CAM table, 
	//but he port number has changed. 
	public void addEntry(MACAddress Mac, String portC){  
//		if(Mac.equals(this.Mac)){
//		this.portCode = portC;}	
	}

	public String toString(){
		return "Adrress: " + this.Mac + "port " + portCode;
	}
	
	public boolean isEqual (MACAddress rhs) {
	/* to compare the a MAC Address in parameter to this entry to see if 
	 * they match. 
	 */
		if(this.Mac == rhs){
		return true; 
	}else return false;
	}
	
	public MACAddress getAddress(){    //<--------- check this method.
		return this.Mac;
	}

	public String getPort(){		//<--------- check this method.
		return this.portCode;
	}
}

