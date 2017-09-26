/**
 * Java program to explain is-a relation and Has-a relation
 */
package assignment4_2;

/**
 * 
 * Class phones to display phone details
 *
 */

class Phones {
	String ram;		// Declaring RAM details of the phone as instance variable
	String  os;		// Declaring os of the phone as instance variable
	String model;	// Declaring model of the phone instance variable
		
	/**
	 * Print phone info
	 */
	void phoneInfo() {
		System.out.println("This is "+this.model+" with "+this.os+" os and "+this.ram+" RAM"); // Print phone info here
	}
	
}

/**
 * Class message to send and delete message
 *
 */
class Message{
	void sendMessage() {	// Send message message
		System.out.println("Sending message from phone"); // Printing send message
	}
	
	void deleteMessage() {
		System.out.println("Deleted message from phone"); // Printing delete from phone
	}
}

/**
 * iPhone class to send message
 *
 */
class Iphone extends Phones { // iPhone class extends phone and inherits its properties (is-a relation)
	
	/**
	 * Method to send message from iPhone
	 */
	void sendMessageFromIphone() { 	// Method to send message from iPhone using has-a relationship from Message class 
		Message m = new Message(); 	// Creating object for method class
		m.sendMessage();			// Calling send message method, to send message
	}
	
}
/**
 * Class to explain is-a relation and Has-a relation
 *
 */
class Assignment4_2 {

	/**
	 * @param args
	 */
	public static void main(String[] args) { // main method starts
		// TODO Auto-generated method stub
			
		Iphone iphone= new Iphone(); 	// Creating object for iPhone
		iphone.ram="2GB";				// Assigning ram variable of phone
		iphone.model="iPhone 5s";		// Assigning model 
		iphone.os="iOS 10.3";			// Assigning os
		iphone.phoneInfo(); 			// printing iPhone details since iPhone is phone
		iphone.sendMessageFromIphone(); // Sending message from iPhone
		
	}

}// Class closed
