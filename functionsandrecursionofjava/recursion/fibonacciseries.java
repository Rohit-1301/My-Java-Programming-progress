package functionsandrecursionofjava.recursion;

import java.util.*;

public class fibonacciseries {
    static double fibon(double n) {
        if (n == 0 || n == 1) {
            return n;
        }
        double ans = fibon(n - 1) + fibon(n - 2);

        return ans;

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the number of terms");

        double n = sc.nextDouble();
        System.out.println("the fibonacci series no. is:  ");
        for (int i = 0; i <= n; i++) {
            System.out.print(fibon(i) + " ");
        }
        System.out.println(" ");
        double sum = 0;
        for (int i = 0; i <= n; i++) {
            sum += fibon(i);
        }
        System.out.println("the sum of the array is: " + sum);
    }
}