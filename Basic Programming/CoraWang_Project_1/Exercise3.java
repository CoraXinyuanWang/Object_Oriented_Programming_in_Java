import java.util.*;
public class Exercise3{
	public static void main (String [] args){
    Scanner input = new Scanner (System.in);
    System.out.println("Please enter the amount of money you need to convert: ");
    double money= input.nextDouble();
    System.out.println("Please enter either 1 or 2");
    int enter = input.nextInt();
    double moneyConvert;
    if (enter ==1){
    moneyConvert =0.9*money;
    System.out.println("You enter "+money+" dollars and they are equal to "+moneyConvert+" Euros");
    }
    else if (enter==2){
    moneyConvert =money/0.9;
    System.out.println("You entered "+money+" Euros and they are equal to "+moneyConvert+" dollars");
    }
    input.close();
	}
}