import java.util.*;
public class Exercise4{
	public static void main (String []args){
    Scanner input = new Scanner (System.in);
    System.out.println("Please enter numeric percentage: ");
    double enter = input.nextDouble();
    String letter=" ";
    if (enter >=93){
     letter ="A";
    }
     else if (enter >=90){
     letter ="A-";
    }
     else if (enter >=88){
     letter ="B+";
    }
     else if (enter >=84){
     letter ="B";
    }
     else if (enter >=80){
     letter ="B-";
    }
    else if (enter >=78){
     letter ="C+";
    }
     else if (enter >=74){
     letter ="C";
    }
     else if (enter >=70){
     letter ="C-";
    }
    else if (enter >=68){
     letter ="D+";
    }
     else if (enter >=64){
     letter ="D";
    }
     else if (enter >=60){
     letter ="D-";
    }
    else {
    	letter ="F";
    }
    System.out.println("You enter "+enter+"%, your letter grade is "+letter);
    input.close();
	}
}