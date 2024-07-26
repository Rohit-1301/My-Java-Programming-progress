package classandobject.multithreading;

import java.util.Scanner;

class mythread1 implements Runnable {
    int n;

    public mythread1(int n) {
        this.n = n;
    }

    public int factorial(int n) {
        if (n == 0 || n == 1) {
            return 1;
        }
        return n * factorial(n - 1);
    }

    @Override
    public void run() {
        System.out.println("Factorial of " + n + " is: " + factorial(n));
    }
}

class mythread2 implements Runnable {
    int n;

    public mythread2(int n) {
        this.n = n;
    }

    public static int fibonacci(int n) {
        if (n == 0 || n == 1) {
            return n;
        }
        return fibonacci(n - 1) + fibonacci(n - 2);
    }

    @Override
    public void run() {
        System.out.println("Fibonacci of " + n + " is: " + fibonacci(n));
    }
}

public class firstthread {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the value of n");
        int n = sc.nextInt();

        for (int i = 0; i < 10; i++) {
            mythread1 t1 = new mythread1(n);
            mythread2 t2 = new mythread2(n);
            Thread t1Thread = new Thread(t1);
            Thread t2Thread = new Thread(t2);
            t1Thread.start();
            t2Thread.start();
        }
    }
}