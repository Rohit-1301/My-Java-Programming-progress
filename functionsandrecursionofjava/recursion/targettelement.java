package functionsandrecursionofjava.recursion;

import java.util.Scanner;

public class targettelement {
    static boolean target(int a[], int target, int idx) {
        if (idx == a.length)
            return false;
        if (a[idx] == target) {
            System.out.println("it is present and its index is " + idx);
            return true;
        }

        return target(a, target, idx + 1);

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the length of the target");
        int n = sc.nextInt();
        int a[] = new int[n];

        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }
        System.out.println("enter the target element");
        int target = sc.nextInt();
        int idx = 0;
        if (target(a, target, idx)) {
            System.out.println(" ");
        } else {
            System.out.println("absent");
        }

    }
}
