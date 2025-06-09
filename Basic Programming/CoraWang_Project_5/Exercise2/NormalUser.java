

class NormalUser extends User {
    private int id;

    public NormalUser(int id, String username, String password) {
        super(username, password);
        this.id = id;
    }

    @Override
    public void printUserInfo() {
        super.printUserInfo();
        System.out.println("ID: " + id);
    }

    // Add a phone book entry
    public void addPhoneBookEntry(PhoneBookEntry entry) {
        int result = phoneBookDirectory.addEntry(entry);
        if (result == 1) {
            System.out.println("Entry successfully added.");
        } else {
            System.out.println("PhoneBook directory is full.");
        }
    }

    // Edit a phone book entry
    public void editPhoneBookEntry(String firstName, String lastName, PhoneBookEntry updatedEntry) {
        int result = phoneBookDirectory.edit(firstName, lastName, updatedEntry);
        if (result == 1) {
            System.out.println("Entry successfully updated.");
        } else {
            System.out.println("Entry not found.");
        }
    }

}
