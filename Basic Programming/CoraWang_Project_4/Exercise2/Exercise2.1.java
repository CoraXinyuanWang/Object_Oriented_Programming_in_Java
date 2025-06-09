public class PhoneBook{
	// Main method with requested actions
	public static void main (String []args){
		// we first create three objects according to the requirement
		PhoneBookEntry object1= new PhoneBookEntry(5, "John", "Smith", "jsmith@gmail.com", "20037", "2023334444");
		PhoneBookEntry object2= new PhoneBookEntry("James", "202334444");
		PhoneBookEntry object3= new PhoneBookEntry("Sarah", "");
		// apply the getter and setter method on them 
		// Change JS phone number 
		object1.setPhoneNumber("2025555555");
		// Printing John Smith's details
        object1.printBookEntry();
        // Assigning John Smith's zip code to James's entry
        String johnZipCode = object1.getZipCode();
        object2.setZipCode(johnZipCode);
        // then we can print all the info to verify 
        object1.printBookEntry();
        System.out.println();
        object2.printBookEntry();
        System.out.println();
        object3.printBookEntry();
        System.out.println();
	}
}