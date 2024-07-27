package sortingalgorithm.insertionsort;
import java.util.Scanner;
public class insertion {
static void sort(int[] a) {
        int n = a.length;
        for (int i = 1; i < n; i++) {
            int j = i;
            while (j > 0 && a[j] < a[j - 1]) {
                int temp = a[j];
                a[j] = a[j - 1];
                a[j - 1] = temp;
                j--;
             }
        }
    }
     public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the length of an array");
        int n = sc.nextInt();
        int a[] = new int[n];
        // The line `for (int i = 0; i < n; i++) {` is a for loop in Java that is used to iterate over
        // the elements of an array. In this specific context, it is used to read input values from the
        // user for each element of the array `a[]`. The loop runs from index 0 to `n-1` (where `n` is
        // the length of the array) and assigns the input values to the corresponding elements of the
        // array `a[]`.
        for (int i = 0; i < n; i++) {
                a[i] = sc.nextInt();
        }
        sort(a);
        for (int val : a) {
            System.out.print(val + " ");
        }
    }

}