import java.util.*;
public class Exercise1 {

	public static void main (String [] args){
    Scanner scanner = new Scanner (System.in);
    double x;
    double y;
    System.out.println("Please enter your X, Y (X, Y have to be both non-zero): ");
    x = scanner.nextDouble();
    y = scanner.nextDouble();
    while (x<=0 || y<=0){
         System.out.println("Please enter your X, Y (X, Y have to be both non-zero): ");
             x = scanner.nextDouble();
             y = scanner.nextDouble();
    }
    double result = (3+4*x)/5-10*(y-5)/x+9*(4/x+(9+x)/y);
    System.out.println("The result of the expression (3+4*x)/5-10*(y-5)/x+9*(4/x+(9+x)/y) is "+result);
    scanner.close();
    }
}
