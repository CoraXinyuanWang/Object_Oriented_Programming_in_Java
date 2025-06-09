import java.util.*;
public class Exercise4{
	public static void main (String [] args){
		Scanner scanner = new Scanner (System.in);
    System.out.println("Enter desired grade");
      String grade = scanner.nextLine();
     System.out.println("Enter minimum average required");
     double required= scanner.nextDouble();
      System.out.println("Enter current average in course");
      double currentAve = scanner.nextDouble();
       System.out.println("Enter how much the final count as a percentage of the course grade");
       double percentage =scanner.nextDouble();
       double percent = percentage/100.0;
       double scoreNeeded = (required-currentAve*(1-percent))/percent;
       double scoreTrunc= (int)(scoreNeeded*100)/100.0;
       System.out.println("You need a score of "+scoreTrunc+" on the final to get "+grade);
       scanner.close();
	}
}