package arraysofjava;

import java.util.Scanner;

public class target {
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
    System.out.println("enter which sum do you want of two element");
    int target=sc.nextInt();
    int pair=0;
    for(int i=0;i<n;i++){
        for(int j=i+1;j<n;j++){
            if(a[i]+a[j]==target){
               pair++;
            }
        }
    }
    for(int i=0;i<n;i++){
        for(int j=i+1;j<n;j++){
            if(a[i]+a[j]==target){
               System.out.print(i+" ");
               System.out.print(j);
            }
        }
    }
    System.out.println("the no. of pair which is equal to target is: "+pair);
}
}
