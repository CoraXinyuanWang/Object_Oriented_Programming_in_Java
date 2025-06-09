import java.util.Scanner;

public class Exercise6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter your password: ");
        String password = scanner.nextLine();

        int length = password.length();
        int upperCaseCount = 0;
        int lowerCaseCount = 0;
        int digitCount = 0;

        for (int i = 0; i < length; i++) {
            char ch = password.charAt(i);
            if (Character.isUpperCase(ch)) {
                upperCaseCount++;
            } else if (Character.isLowerCase(ch)) {
                lowerCaseCount++;
            } else if (Character.isDigit(ch)) {
                digitCount++;
            }
        }

        if (length < 8) {
            System.out.println("Weak Password");
        } else if (length >= 8 && length <= 12) {
            if ((upperCaseCount > 0 && digitCount == 0 && lowerCaseCount > 0) ||
                    (digitCount > 0 && lowerCaseCount == 0 && upperCaseCount == 0)) {
                System.out.println("Medium Password");
            }else if((upperCaseCount == 0 && digitCount > 0 && lowerCaseCount > 0)
            		||(upperCaseCount > 0 && digitCount > 0 && lowerCaseCount == 0)) {
            	 System.out.println("Ok Password");
            } 
            else {
                System.out.println("Strong Password");
            }
        } else if (length > 12) {
            System.out.println("Awesome Password");
        } else {
            System.out.println("Invalid Password");
        }

        scanner.close();
    }
}