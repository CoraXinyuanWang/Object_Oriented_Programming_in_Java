import java.util.*;
public class Exercise1 {
	public static void main (String []args){
		Scanner input = new Scanner (System.in);
		System.out.println("What is your password?");
		String password = input.nextLine();
		String realPassword = "NYU42day";
		if (password.equals(realPassword)){
           System.out.println("Valid Password");
		}
		else {
			System.out.println("Invalid Password");
		}
		input.close();
	}
}