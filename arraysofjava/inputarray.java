package arraysofjava;

import java.util.Scanner;

public class inputarray {
    public static void main(String[] args) {
       Scanner sc=new Scanner(System.in);
       System.out.println("enter length of an array");
       int n=sc.nextInt();
        int a[]=new int[n];
        for(int i=0;i<n;i++){
            a[i]=sc.nextInt();
        }
        for(int i=0;i<n;i++){
            System.out.print(a[i]);
        }
    }
}
