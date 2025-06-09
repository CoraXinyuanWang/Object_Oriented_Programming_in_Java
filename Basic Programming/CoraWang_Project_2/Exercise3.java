import java.util.*;
public class Exercise3{
	public static void main (String []args){
    Scanner input = new Scanner (System.in);
    System.out.println("Enter a letter \"a\" to generate a random char (a-z), or enter a letter \"A\" to generate a random char (A-Z),");
    char enter = input.nextLine().charAt(0);
    while (enter!='A'&& enter!='a'){
     System.out.println("Invaid entry, please try again");
          enter = input.nextLine().charAt(0);
    }
   
    	if (enter=='a'){
        char generate = (char)((int)(Math.random()*26)+97);
        System.out.println("Your random char is "+generate);
    	}
    	else if (enter=='A'){
        char generate1 = (char)((int)(Math.random()*26)+65);
        System.out.println("Your random char is "+generate1);
    	}
    
    input.close();
	}
}