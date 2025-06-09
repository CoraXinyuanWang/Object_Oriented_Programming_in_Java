public class PhoneBookEntry {
    private int id;
    private String firstName;
    private String lastName;
    private String email;
    private String zipCode;
    private String phoneNumber;

    // all the setters and getters 
    public void setFirstName(String firstName) { this.firstName = firstName; }
    public String getFirstName() { return firstName; }

    public void setLastName(String lastName) { this.lastName = lastName; }
    public String getLastName() { return lastName; }

    public void setEmail(String email) { this.email = email; }
    public String getEmail() { return email; }

    public void setZipCode(String zipCode) { this.zipCode = zipCode; }
    public String getZipCode() { return zipCode; }

    public void setPhoneNumber(String phoneNumber) { this.phoneNumber = phoneNumber; }
    public String getPhoneNumber() { return phoneNumber; }

    public void setId(int id) { this.id = id; }
    public int getId() { return id; }

    // create the constructors

    // default constructor: 
    public PhoneBookEntry(){

    }
    // A constructor that takes as arguments all attributes
    public PhoneBookEntry(int id, String firstName, String lastName, String email, String zipCode, String phoneNumber) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
        this.zipCode = zipCode;
        this.phoneNumber = phoneNumber;
    }
    // A constructor that accepts only firstName and phoneNumber as arguments
    public PhoneBookEntry(String firstName, String phoneNumber) {
        this.firstName = firstName;
        this.phoneNumber = phoneNumber;
    }
    public void printBookEntry() {
        System.out.println("ID: " + id + ", Name: " + firstName + " " + lastName + 
            ", Email: " + email + ", Zip Code: " + zipCode + ", Phone: " + phoneNumber);
    }

}