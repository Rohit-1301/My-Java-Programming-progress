package classandobject.exceptionhandling;
import java.util.Scanner;
public class Nestedtry {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the first number:");
        int num1 = 0;
        try {
            num1 = sc.nextInt();
        } catch (Exception e) {
            System.out.println("Invalid input for the first number. Please enter an integer.");
            return;
        }

        System.out.println("Enter the second number:");
        int num2 = 0;
        try {
            num2 = sc.nextInt();
        } catch (Exception e) {
            System.out.println("Invalid input for the second number. Please enter an integer.");
            return;
        }

        System.out.println("Enter the operation (+, -, *, /):");
        String operation = sc.next();

        try {
            switch (operation) {
                case "+":
                    System.out.println("The result is: " + (num1 + num2));
                    break;
                case "-":
                    System.out.println("The result is: " + (num1 - num2));
                    break;
                case "*":
                    System.out.println("The result is: " + (num1 * num2));
                    break;
                case "/":
                    if (num2 == 0) {
                        throw new ArithmeticException("Division by zero is not allowed.");
                    }
                    System.out.println("The result is: " + (num1 / (double) num2));
                    break;
                default:
                    System.out.println("Invalid operation. Please enter +, -, * or /.");
            }
        } catch (ArithmeticException e) {
            System.out.println(e.getMessage());
        }
    }
}
