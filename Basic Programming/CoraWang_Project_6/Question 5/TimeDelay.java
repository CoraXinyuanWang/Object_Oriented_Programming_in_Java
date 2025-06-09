public class TimeDelay {
    public TimeDelay(int n) {
        while (n > 0) {
            System.out.print(n + "...");
            oneSecondDelay();
            n -= 1;
        }
    }

    public void oneSecondDelay() {
        try {
            Thread.sleep(1000); // 1000 milliseconds = 1 second
        } catch (InterruptedException ignore) {
            // Handling InterruptedException
            Thread.currentThread().interrupt(); // This is a good practice for handling InterruptedExceptions
        }
    }

    public static void main(String[] args) {
        new TimeDelay(10); // Example usage with a delay for 10 seconds
    }
}
