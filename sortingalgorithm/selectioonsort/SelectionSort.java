package sortingalgorithm.selectioonsort;

import java.util.Scanner;

public class SelectionSort {
    public static void sort(int[] arr) {
        int n = arr.length;
        for (int i = 0; i < n - 1; i++) {
            int min_idx = i;
            for (int j = i + 1; j < n; j++) {
                // The line `if (arr[j] < arr[min_idx]) {` is checking if the element at index `j` in
                // the array `arr` is less than the element at the current minimum index `min_idx`. If
                // the element at index `j` is smaller, then `min_idx` is updated to `j`, indicating
                // that `arr[j]` is the new minimum element found so far in the unsorted portion of the
                // array.
                if (arr[j] < arr[min_idx]) {
                    min_idx = j;
                }
            }
            int temp = arr[i];
            arr[i] = arr[min_idx];
            arr[min_idx] = temp;
        }
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the length of the array");
        int n=sc.nextInt();
        int a[]=new int[n];
        for(int i=0; i<n; i++) {
            a[i]=sc.nextInt();
        }
        // int[] arr = { 64, 34, 25, 12, 22, 11, 90 };
        // sort(arr);
        sort(a);
        for (int i = 0; i < a.length; i++) {
            System.out.print(a[i] + " ");
        }
    }
}
