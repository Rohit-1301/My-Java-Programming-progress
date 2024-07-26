package binarysearch;

import java.util.*;

public class search {
    static void displayarray(int a[], int n) {
        for (int i = 0; i < n; i++) {
            System.out.print(a[i] + " ");
        }
    }

    static void bubblesort(int a[], int n) {
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

    static int targetelement(int a[], int n, int mid, int target) {
        int find = -1;
        if (a[mid] > target) {
            for (int i = mid + 1; i < n; i++) {
                if (target == a[i]) {
                    find = target;
                    System.out.println("The target element is present and its index is " + i);
                }
            }
        } else if (a[mid] < target) {
            for (int i = 0; i <= mid; i++) {
                if (target == a[i]) {
                    find = target;
                    System.out.println("The target element is present and its index is " + i);
                }
            }
        } else {
            for (int i = 0; i < n; i++) {
                if (a[i] == target) {
                    find = target;
                    System.out.println("The target element is present and its index is " + i);
                }
            }
            if (find == -1) {
                System.out.println("The element is not present");
            }
        }
        return find;
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
        bubblesort(a, n);
        displayarray(a, n);
        int mid;

        if (n % 2!= 0) {
            mid = n / 2;
        } else {
            mid = n / 2 + 1;
        }
        System.out.println("Enter the target element you want to find");
        int target = sc.nextInt();
        if (a[mid] == target) {
            System.out.println(a[mid]);
        } else {
            targetelement(a, n, mid, target);
        }
    }
}