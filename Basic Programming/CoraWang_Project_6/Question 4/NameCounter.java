import java.io.*;
import java.nio.file.*;
import java.util.regex.*;

public class NameCounter {

    public static void main(String[] args) {
        // Remove the leading space and adjust the path
        String fileName = "src/chapter9Exercise/NameList.txt"; // Assume the src directory is directly inside the project directory

        countNames(fileName);
        System.out.println("Working Directory = " + System.getProperty("user.dir"));
    }

    public static void countNames(String fileName) {
        Path path = Paths.get(fileName);
        int countBob = 0;
        int countAlice = 0;
        
        try (BufferedReader reader = Files.newBufferedReader(path)) {
            String line;
            while ((line = reader.readLine()) != null) {
                // Use regular expressions to find occurrences of names
                Matcher matcherBob = Pattern.compile("\\bBob\\b").matcher(line);
                while (matcherBob.find()) {
                    countBob++;
                }
                Matcher matcherAlice = Pattern.compile("\\bAlice\\b").matcher(line);
                while (matcherAlice.find()) {
                    countAlice++;
                }
            }
            System.out.println("There are " + countBob + " Bob and " + countAlice + " Alice in file NameList.txt " );
        } catch (IOException e) {
            System.err.println("Error reading file: " + e.getMessage());
        }
    }
}