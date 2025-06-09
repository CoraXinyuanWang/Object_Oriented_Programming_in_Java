import java.util.Scanner;

public class Exercise2 {
    public static void main(String[] args) {
       
        int[] counts = new int[101]; 

        Scanner scanner = new Scanner(System.in);

       
        System.out.print("Enter the integers between 1 and 100(enter 0 when you are done): ");

     
        int num;
        do {
            num = scanner.nextInt();
            if (num >= 1 && num <= 100) {
                counts[num]++; 
            } else if (num != 0) {
                System.out.println("Invalid input. Please enter an integer between 1 and 100.");
            }
        } while (num != 0);

    
        for (int i = 1; i <= 100; i++) {
            if (counts[i] != 0) {
                System.out.println(i + " occurs " + counts[i] + " time(s)");
            }
        }
    }
}
