import java.util.*;
public class Exercise7{
	public static void main (String []args){
    Scanner scanner = new Scanner (System.in);
    int enter = 0;
    double balance =0;
    do {
    System.out.println("1. View your account balance");
    System.out.println("2. Deposit Cash");
    System.out.println("3. Withdraw cash");
    System.out.println("4. Exit");
    System.out.println("Enter your selction: ");
    enter = scanner.nextInt();
    if (enter ==1){
    	System.out.println("Your current balance is "+balance);

    }
    else if (enter ==2){
         System.out.println("Enter the amount you want to deposit: ");
         double deposit = scanner.nextDouble();
         if (deposit<0){
         System.out.println("Incorrect Amount!");
         }
         else{
         balance =balance+deposit;}
    }
    else if (enter==3){
     System.out.println("Enter the amount you want to withdraw: ");
     double withdraw= scanner.nextDouble();
     if (withdraw<0){
     System.out.println("Incorrect Amount!");
     }
     else {
     	if (withdraw>balance){
         System.out.println("Sorry, you don't have sufficient balance!");
     	}
     	else {
     		balance =balance -withdraw;
     	}
     }
    }
    else if (enter <1||enter>5){
      System.out.println("Incorrect selection, please try again");
      }
    }while (enter!=4);
    System.out.println("Goodbye");
    scanner.close();

	}
}