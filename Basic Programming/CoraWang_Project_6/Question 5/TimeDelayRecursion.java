public class TimeDelayRecursion{

    
    public static void timeDelay(int n) {
        try {
            Thread.sleep(1000);  // Delay for one second
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();  // Set the interrupted status after catching InterruptedException
            return; // Exit the method if the thread is interrupted
        }
        
        System.out.print(n + "... ");  // Print the current number with a trailing "..."

        // Base case: if n is 1, stop the recursion.
        if (n > 1) {
            timeDelay(n - 1); // Recursive call with the next lower number
        }
    }

    public static void main(String[] args) {
        // Example usage with a delay for 10 seconds, counting down from 10 to 1
        timeDelay(10);
    
    }
}
