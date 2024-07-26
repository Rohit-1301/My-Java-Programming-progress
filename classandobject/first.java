package classandobject;
import java.util.Scanner;
class Factorial {
    // Method to calculate factorial
    public static int calculateFactorial(int n) {
        if (n == 0 || n == 1) {
            return 1;
        } else {
            return n * calculateFactorial(n - 1);
        }
    }
}
public class first {
    public static void main(String[] args) {




        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Enter a number to calculate its factorial:");
        int number = scanner.nextInt();
        
        // Calculate factorial using Factorial class method
        int factorial = Factorial.calculateFactorial(number);
        
        // Display the result
        System.out.println("Factorial of " + number + " is: " + factorial);
        
        scanner.close();
    }
}