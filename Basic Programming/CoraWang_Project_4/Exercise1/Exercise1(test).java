public class Test {
    public static void main(String[] args) {
        // Set the annual interest rate for all accounts
        Account.setAnnualInterestRate(4.5);

        // Create an account with ID 1122 and a balance of $20,000
        Account account = new Account(1122, 20000);

        // Withdraw $2,500
        account.withdraw(2500);

        // Deposit $3,000
        account.deposit(3000);

        // Print the balance, monthly interest, and the date the account was created
        System.out.println("Account ID: " + account.getId());
        System.out.println("Balance: " + account.getBalance());
        System.out.println("Monthly Interest: " + account.getMonthlyInterest());
        System.out.println("Date Created: " + account.getDateCreated());
    }
}