package arraysofjava;

import java.util.Scanner;

public class sumarray {
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
        int sum=0;
        for(int i=0;i<n;i++){
            sum+=a[i];
        }
        System.out.println("the sum of the array is: "+sum);
    }
}
