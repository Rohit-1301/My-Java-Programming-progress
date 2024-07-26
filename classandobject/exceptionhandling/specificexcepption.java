package classandobject.exceptionhandling;

import java.util.*;

public class specificexcepption {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the length of an array");
        int n = sc.nextInt();
        int a[] = new int[n];
        System.out.println("enter the elements in an array");
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }
        System.out.println("enter the index which u want");
        int index = sc.nextInt();
        System.out.println("enter the number by which u want to divide that array element");
        int number = sc.nextInt();
        try {
            System.out.println("a[index]/number = " + a[index] / number);

        } catch (ArithmeticException e) {
            System.out.println("Arithmetic exception is occured in the program");
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Array out of bound exception is occured in a program");
        } catch (Exception e) {
            System.out.println("we failed to run program. Reason: " + e);
        }
    }
}
