import java.util.*;
public class Exercise4 {

	public static boolean isSorted(int[]list) {
		boolean sorted=true;
		for (int j=1;j<list.length;j++) {
			int difference = list[j]-list[j-1];
			if (difference <0) {
				sorted =false;
				break;
				}
		}
		return sorted;
	}
	public static void main(String[] args) {
		System.out.println("Enter the number of elements in your list and the list of integers: ");
        Scanner scanner = new Scanner (System.in);
        int size=scanner.nextInt();
        int []enter = new int[size];
       
        for (int i=0;i<size;i++) {
        	 int element;
        	element=scanner.nextInt();
        	enter [i]=element;
        }
        if (isSorted(enter)) {
        	System.out.println("This list is already sorted");
        	
        }
        else {
        	System.out.println("This list is not sorted");
        }
     

	}

}