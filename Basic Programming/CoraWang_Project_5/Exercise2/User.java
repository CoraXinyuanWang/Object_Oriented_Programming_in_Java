
public abstract class User {
    protected String username;
    protected String password;
    protected PhoneBookDirectory phoneBookDirectory;

    public User(String username, String password, PhoneBookDirectory phoneBookDirectory) {
        this.username = username;
        this.password = password;
        this.phoneBookDirectory = phoneBookDirectory;
    }

    public void printUserInfo() {
        System.out.println("Username: " + username);
        System.out.println ("password"+password);
    }
    
}

// check both of the subclasses to make sure they work 