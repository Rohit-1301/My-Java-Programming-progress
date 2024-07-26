package classandobject.multithreading;

import java.util.*;

class ArithmeticOperation implements Runnable {
    private int num;
    private char operation;

    public ArithmeticOperation(int num, char operation) {
        this.num = num;
        this.operation = operation;
    }

    @Override
    public void run() {
        for (int i = 0; i < 5; i++) {
            switch (operation) {
                case '+':
                    System.out.println("Addition: " + num + " + " + i + " = " + (num + i));
                    break;
                case '-':
                    System.out.println("Subtraction: " + num + " - " + i + " = " + (num - i));
                    break;
                case '*':
                    System.out.println("Multiplication: " + num + " * " + i + " = " + (num * i));
                    break;
                case '/':
                    System.out.println("Division: " + num + " / " + i + " = " + ((double) num / (double) i));
                    break;
                case '%':
                    System.out.println("Modulus: " + num + " % " + i + " = " + (num % i));
                    break;
                case '^':
                    System.out.println("Exponent: " + num + " ^ " + i + " = " + Math.pow(num, i));
                    break;
                default:
                    System.out.println("Invalid operation: " + operation);
            }
        }
    }
}

public class Arithmeticoperations {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the number");
        int num = sc.nextInt();
        char[] operations = { '+', '-', '*', '/', '%', '^' };

        for (char operation : operations) {
            Thread t = new Thread(new ArithmeticOperation(num, operation));
            t.start();
        }
    }
}
