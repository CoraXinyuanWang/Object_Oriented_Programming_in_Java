import java.util.*;
public class Exercise5{
	public static void main (String []args){
    Scanner input = new Scanner (System.in);
    System.out.println("Enter month name: ");
    String enter = input.nextLine();
    String season ="";
    if (enter.equalsIgnoreCase("January")||enter.equalsIgnoreCase("December")||enter.equalsIgnoreCase("February")){
     season = "Winter";
    }
    else if (enter.equalsIgnoreCase("March")||enter.equalsIgnoreCase("April")||enter.equalsIgnoreCase("May")){
    season = "Spring";
    }
    else if (enter.equalsIgnoreCase("June")||enter.equalsIgnoreCase("July")||enter.equalsIgnoreCase("August")){
    season ="Summer";
    }
    else if (enter.equalsIgnoreCase("September")||enter.equalsIgnoreCase("October")||enter.equalsIgnoreCase("November")){
    season = "Fall";
    }
    System.out.println("Season is "+season);
    input.close();
	}
}