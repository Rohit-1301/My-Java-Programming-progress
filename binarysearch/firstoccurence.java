package binarysearch;

import java.util.*;

public class firstoccurence {
    static void displayarray(int a[], int n) {
        for (int i = 0; i < n; i++) {
            System.out.print(a[i] + " ");
        }
    }

    static void sortarray(int a[], int n) {
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                if (a[i] > a[j]) {
                    int temp = a[i];
                    a[i] = a[j];
                    a[j] = temp;
                }
            }
        }
    }

    static void firstoccur(int a[], int n, int target) {
        int find = -1;
        for (int i = 0; i < n; i++) {
            if (target == a[i]) {
                System.out.println("element is present and its index is " + i);
                find++;
                break;
            }

        }
        if (find == -1) {
            System.out.println("element is not present");
        }

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the length of an array");
        int n = sc.nextInt();

        System.out.println("Enter the elements in an array");
        int a[] = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }
        System.out.println("Array before sorting");
        displayarray(a, n);
        System.out.println(" ");
        System.out.println("Array after sorting is");
        sortarray(a, n);
        displayarray(a, n);
        System.out.println("enter the target element which u want to find in an array");
        int target = sc.nextInt();
        firstoccur(a, n, target);
    }
}
