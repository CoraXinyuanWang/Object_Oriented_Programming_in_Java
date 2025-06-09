

class PhoneBookAdmin extends User {
    private String emailAddress;

    public PhoneBookAdmin(String username, String password, String emailAddress) {
        super(username, password);
        this.emailAddress = emailAddress;
    }

    @Override
    public void printUserInfo() {
        super.printUserInfo();
        System.out.println("Email Address: " + emailAddress);
    }

  public void editPhoneBookEntry(String firstName, String lastName, PhoneBookEntry updatedEntry) {
        int result = phoneBookDirectory.edit(firstName, lastName, updatedEntry);
        if (result == 1) {
            System.out.println("Entry successfully updated.");
        } else {
            System.out.println("Entry not found.");
        }
    }

    // Delete a phone book entry
    public void deletePhoneBookEntry(String firstName, String lastName) {
        if (phoneBookDirectory.delete(firstName, lastName)) {
            System.out.println("Entry successfully deleted.");
        } else {
            System.out.println("Entry not found.");
        }
    }

    // Sort the phone book directory by ID
    public void sortPhoneBookDirectory() {
        phoneBookDirectory.sortById();
    }

 // Search for an entry by phone number using linear search
    public PhoneBookEntry searchByLinear(String phoneNumber) {
        int index = phoneBookDirectory.linearSearchByPhoneNumber(phoneNumber);
        if (index != -1) {
            return phoneBookDirectory.getEntry(index);
        }
        return null; // Phone number not found, return null
    }
    
    


    // Search for an entry by ID using binary search
    public PhoneBookEntry searchByBinary(int id) {
        return phoneBookDirectory.searchByIdBinarySearch(id);
    }


    public void changeUsername (String username){
        this.username = username;
    }

    public void changePassword (String password){

        this.password = password;
    }

}



