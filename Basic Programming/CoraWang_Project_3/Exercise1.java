import java.util.*;
public class Exercise1{
public static void main (String []args) {
      Scanner input =new Scanner (System.in);
      int [] userInput= new int [10];
      System.out.println("Please enter 10 integers ");
      for (int i=9;i>=0;i--) {
    	  userInput[i]=input.nextInt();
      }
      for (int i=0;i<10;i++) {
    	  System.out.print(userInput[i]+" ");
      }
      input.close();
      
}
}