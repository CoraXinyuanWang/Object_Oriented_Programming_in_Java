import java.util.*;
public class Exercise5{
	public static void main (String []args){
		Scanner input = new Scanner (System.in);
		System.out.println("Enter two integers X and Y");
		int x= input.nextInt();
		int y= input.nextInt();
		int sum=x+y;
		int sub = x-y;
		double division =(double)x/y;
		int rem = x%y;
		System.out.println("Sum of x and y is "+sum);
		System.out.println("Subtraction of x and y is "+sub);
		System.out.println("Division of x and y is "+division);
		System.out.println("Reminder of x and y is "+rem);
        input.close();
	}
}