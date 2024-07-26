package functionsandrecursionofjava;

import java.util.Scanner;

public class factorial {
    public static int factorial(int a){
        int afact=1;
        for (int i = 1; i <= a; i++) {
           afact=afact*i;
        }
        return afact;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter value of n");
       int n=sc.nextInt();
       System.out.println("enter value of r");
       int r=sc.nextInt();
       int nfact=factorial(n);
       int rfact=factorial(r);
       int nrfact=factorial(n-r);
       int combination=nfact/(rfact*nrfact);
       System.out.println("the value of combination is: "+combination);


   
    }
}
