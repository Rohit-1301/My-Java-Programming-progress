package sortingalgorithm.bubblesort;

import java.util.Scanner;

public class increasing {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the length of the array: ");
        int n = sc.nextInt();
        int a[] = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }
        for (int i = 0; i < n - 1; i++) {

            for (int j = 0; j < n - i - 1; j++) {
                if (a[j] > a[j + 1]) {
                    int temp = a[j];
                    a[j] = a[j + 1];
                    a[j + 1] = temp;

                }

            }

        }
        System.out.println("the increasing order of an array is: ");
        for (int i = 0; i < n; i++) {
            System.out.print(a[i] + " ");
        }
        System.out.println(" ");
        for (int i = 0; i < n - 1; i++) {
           
            for (int j = 0; j < n - i - 1; j++) {
                if (a[j] < a[j + 1]) {
                    int temp = a[j];
                    a[j] = a[j + 1];
                    a[j + 1] = temp;
                   
                }
            }
           
        }
        System.out.println("the decreasing order of an array is: ");
        for (int i = 0; i < n; i++) {
            System.out.print(a[i] + " ");
        }
    }
}