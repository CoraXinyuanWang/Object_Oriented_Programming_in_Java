public class Exercise5 {
    
	// 1st Method: sorts each row of the array individually and print 
	// first, we create a helping method to help with the first method
	public static void bubbleSort(int[] arr) {
        int n = arr.length;
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                   
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
        for (int i=0;i<arr.length;i++) {
        	System.out.print (arr[i]+" ");
        }
    }
	// then we call the helping method within our first method to help with sorting
	public static void sortArrayRows(int [][]arr) {
		for(int i=0;i<arr.length;i++) {
			bubbleSort(arr[i]);
			System.out.println();
		}
	}
	public static void sortArray(int[][] arr) {
        int rows = arr.length;
        int cols = arr[0].length;

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                for (int k = 0; k < rows; k++) {
                    for (int l = 0; l < cols; l++) {
                        if (arr[i][j] < arr[k][l]) {
                            int temp = arr[i][j];
                            arr[i][j] = arr[k][l];
                            arr[k][l] = temp;
                        }
                    }
                }
            }
        }
        for (int i=0;i<arr.length;i++) {
			for (int j=0;j<arr[i].length;j++) {
			System.out.print(arr[i][j]+" "); 
			}
			System.out.println();
		}
       
    }
    
	
	public static void main(String[] args) {
		//create a program that generate a random 7X7 array
		int [][]randomArray= new int [7][7];
		for (int i=0;i<randomArray.length;i++) {
			for (int j=0;j<randomArray[i].length;j++) {
			 randomArray[i][j]=(int)(Math.random()*100+1);
			}
		}
		System.out.println("The randomly-generated array is: ");
		for (int i=0;i<randomArray.length;i++) {
			for (int j=0;j<randomArray[i].length;j++) {
			System.out.print(randomArray[i][j]+" "); 
			}
			System.out.println();
		}
		System.out.println();
		System.out.println("The sorted-by-row array is: ");
		sortArrayRows(randomArray);
		
		System.out.println();
		System.out.println("The sorted array is: ");
		sortArray(randomArray);
		
	}

}
