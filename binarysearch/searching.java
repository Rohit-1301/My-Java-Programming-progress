package binarysearch;

import java.util.*;

public class searching {
    static void sortarray(int a[],int n) {
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

    static boolean binarysearch(int a[], int start, int end, int target) {
        if (start > end)
            return false;
        int mid = (start + end) / 2;
        if (target == a[mid])
            return true;
        else if (target < a[mid])
            return binarysearch(a, start, mid - 1, target);
        else
            return binarysearch(a, mid + 1, end, target);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the length of an array");
        int n = sc.nextInt();
        int[] a = new int[n];
        System.out.println("enter the element of an array");
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }
        sortarray(a,n);
        System.out.println("enter the terget element which u want to find");
        int target = sc.nextInt();
        int start = 0;
        int end = n - 1;
        System.out.println(binarysearch(a, start, end, target));
    }
}
