package binarysearch;

import java.util.*;

public class peak {
    static void displayarray(int a[][], int r, int c) {
        for (int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++) {
                System.out.print(a[i][j] + " ");
            }
            System.out.println();
        }
    }

    static boolean peakelement(int a[][], int r, int c, int target) {
        int left = 0;
        int right = r * c - 1;
        int mid;

        while (left <= right) {
            mid = left + (right - left) / 2;
            int midelt = a[mid / c][mid % c];
            if (midelt == target) {
                return true;
            } else if (target < midelt) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }

        return false;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the row of matrix");
        int r = sc.nextInt();
        System.out.println("eneter the column of an array");
        int c = sc.nextInt();
        int a[][] = new int[r][c];
        for (int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++) {
                a[i][j] = sc.nextInt();
            }
        }
        displayarray(a, r, c);
        System.out.println("enter the target which u want to check in the matrix");
        int target = sc.nextInt();
        System.out.println(peakelement(a, r, c, target));
    }
}
