public class PhoneBookDirectory {
    private PhoneBookEntry[] directory;
    private int entriesCount;

    public PhoneBookDirectory() {
        directory = new PhoneBookEntry[6]; // Array of 6 PhoneBookEntry objects
        entriesCount = 0;
    }
    // 1. add an entry to the phonebook
    public int addEntry(PhoneBookEntry entry) {
        if (entriesCount < directory.length) {
            directory[entriesCount++] = entry;
            return 1; // Entry added successfully
        }
        return 0; // Directory is full
    }
    // 2. print all phonebook entries:
    public void printAllEntries() {
        for (PhoneBookEntry entry : directory) {
            if (entry != null) {
                entry.printBookEntry();
            }
        }
    }
    // 3. search for an entry by Phone Number (Linear Search): 
    public int linearSearchByPhoneNumber(String phoneNumber) {
        for (PhoneBookEntry entry : directory) {
            if (entry != null && entry.getPhoneNumber().equals(phoneNumber)) {
                return 1; // Phone number found
            }
        }
        return 0; // Phone number not found
    }

    // 4. search for an entry by id
    public PhoneBookEntry searchByIdBinarySearch(int id) {
        // Binary search requires the array to be sorted by id
        // Assuming that the directory is sorted by id
        int low = 0;
        int high = entriesCount - 1;
        while (low <= high) {
            int mid = (low + high) / 2;
            PhoneBookEntry midEntry = directory[mid];
            if (midEntry.getId() == id) {
                return midEntry; // Found the entry
            } else if (midEntry.getId() < id) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }
        return null; // Entry not found
    }

    public int edit(String firstName, String lastName) {
        for (PhoneBookEntry entry : directory) {
            if (entry != null && entry.getFirstName().equals(firstName) && entry.getLastName().equals(lastName)) {
                // Here you should provide functionality to edit the entry
                // For example, let's change the email for demonstration
                entry.setEmail("newemail@example.com");
                return 1; // Entry found and edited
            }
        }
        return 0; // Entry with given name and last name not found
    }


}