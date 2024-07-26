package arraysofjava;

import java.util.Scanner;

public class multipair {
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
        System.out.println("enter the target");
        int multi=sc.nextInt();
        
        int pair=0;
        for(int i=0;i<n;i++){
            for(int j=i+1;j<n;j++){
                if(a[i]*a[j]==multi){
                    pair++;
                }
            }
        }
        System.out.println("the no. of pair whose multiplication with the target is: "+pair);
}
}