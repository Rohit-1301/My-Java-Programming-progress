package binarysearch;

import java.util.*;

public class squarerrot {
    static void root(int n) {
        int start = 0;
        int end = n;
        int mid = (start + end) / 2;
        while (start <= end) {

            if (mid * mid == n) {
                System.out.println(mid);
                return;
            } else if (mid * mid < n) {
                start = mid + 1;
            } else {
                end = mid - 1;
                mid = end;
            }
        }
        System.out.println("the square root of "+n+" is "+mid);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter which no. square root u want to found ");
        int n = sc.nextInt();
        root(n);
    }
}
