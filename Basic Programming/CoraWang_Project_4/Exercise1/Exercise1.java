import java.util.Date;

public class Account {
	private int id;
	private double balance;
	private static double annualInterestRate;
	private Date dateCreated;

	//Default constructor 
	public Account (){
	}
	
	//Constructor with specified id and initial balance
	public Account (int id, double initialBalance){
     this.id =id;
     this.balance = initialBalance;
     this.dateCreated = new Date ();
	}
	
	// The accessor and mutator methods for id, balance and annualInterestRate
	public int getId(){
		return id;
	}
	public double getBalance() {
        return balance;
    }
    public static double getAnnualInterestRate(){
    	return annualInterestRate;
    }
   
    //mutators (setters)
    public void setId(int id){
        this.id=id;
    }
    public void setBalance(double balance){
        this.balance=balance;
    }
    public static void setAnnualInterestRate(double annualInterestRate){
        Account.annualInterestRate = annualInterestRate;
    }
	// The accessor method for dateCreated
    public Date getDateCreated(){
    	return this.dateCreated;
    }
    // A method named getMonthlyInterest() that returns the monthly interest
    public double getMonthlyInterest (){
    	return balance* (annualInterestRate/12)/100;
    }
    // A method named withdraw that withdraws a specified amount from the amount
    public void withdraw (double amount){
    if (amount <= balance){
       balance = balance -amount;
       System.out.println("withdraw: "+amount);
    }
    else {
    	System.out.println("Insufficient funds to withdraw "+ amount+" of money");
    }
    }
    // A method named deposit that deposits a specified amount to the account
    public void deposit (double amount){
     balance += amount;
     System.out.println("Deposited: "+amount);
    }
}

