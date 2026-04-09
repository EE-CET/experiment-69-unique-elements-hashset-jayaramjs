import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Solution {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Read the integer N
        if (!scanner.hasNextInt()) return;
        int n = scanner.nextInt();
        
        // Create a HashSet to store the integers
        Set<Integer> uniqueNumbers = new HashSet<>();
        
        // Loop N times to read the integers and add them to the HashSet
        for (int i = 0; i < n; i++) {
            if (scanner.hasNextInt()) {
                uniqueNumbers.add(scanner.nextInt());
            }
        }
        
        // Iterate through the HashSet and print the unique numbers (space-separated)
        StringBuilder output = new StringBuilder();
        for (Integer num : uniqueNumbers) {
            output.append(num).append(" ");
        }
        
        // Trim the trailing space and print the result
        System.out.println(output.toString().trim());
        
        scanner.close();
    }
}
