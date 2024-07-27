package loopsofjava;

import java.util.Scanner;

public class combination{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter value of n you want: ");
        int n = sc.nextInt();
        System.out.println("enter value of r you want:");
        int r = sc.nextInt();

        int nfact = 1;
        int rfact = 1;
        int nrfact = 1;

        for (int i = 1; i <= n; i++) {
            nfact = nfact * i;
        }
        System.out.println("the factorial of n is: " + nfact);
        for (int i = 1; i <= r; i++) {
            rfact = rfact * i;

        }
        System.out.println("the factorial of r is: " + rfact);
        for (int i = 1; i <= (n - r); i++) {
            nrfact = nrfact * i;

        }
        System.out.println("the factorial of (n-r) is: " + nrfact);

        int combination = nfact / (rfact * nrfact);
        System.out.println("the combination of the given no.is :" + combination);
    }
}
