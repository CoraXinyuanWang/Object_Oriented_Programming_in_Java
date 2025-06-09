
import java.util.*;
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
 // Method to perform a linear search by phone number
    public int linearSearchByPhoneNumber(String phoneNumber) {
        for (int i = 0; i < entriesCount; i++) {
            if (directory[i].getPhoneNumber().equals(phoneNumber)) {
                return i; // Phone number found at index i
            }
        }
        return -1; // Phone number not found
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

    public int edit(String firstName, String lastName, PhoneBookEntry updatedEntry) {
    for (int i = 0; i < entriesCount; i++) {
        if (directory[i].getFirstName().equals(firstName) && directory[i].getLastName().equals(lastName)) {
            directory[i] = updatedEntry; // Update the entry
            return 1; // Entry successfully edited
        }
    }
    return 0; // Entry not found
}

public boolean delete(String firstName, String lastName) {
    for (int i = 0; i < entriesCount; i++) {
        if (directory[i].getFirstName().equals(firstName) && directory[i].getLastName().equals(lastName)) {
            System.arraycopy(directory, i + 1, directory, i, entriesCount - i - 1);
            directory[--entriesCount] = null; // Decrement count and clear last element
            return true; // Entry successfully deleted
        }
    }
    return false; // Entry not found
}


public void sortById() {
    Arrays.sort(directory, 0, entriesCount, Comparator.comparingInt(PhoneBookEntry::getId));
}

// Method to get an entry by index
public PhoneBookEntry getEntry(int index) {
    if (index >= 0 && index < entriesCount) {
        return directory[index];
    }
    return null; // Index out of bounds
}



}