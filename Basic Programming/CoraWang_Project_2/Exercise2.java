import java.util.*;
public class Exercise2{
	public static void main (String []args){
    Scanner input = new Scanner (System.in);
    System.out.println("Please enter your two numbers: ");
    double num1= input.nextDouble();
    double num2= input.nextDouble();
    double max = Math.max(num1,num2);
    System.out.println("The maximum of two given numbers is "+max);
    input.close();
	}
}