package arraysofjava;

import java.util.Arrays;
import java.util.Scanner;

public class smallestandlargest {
    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);
        System.out.println("eneter length of an array: ");
        int n=sc.nextInt();
        int a[]=new int[n];
        for(int i=0;i<n;i++){
            a[i]=sc.nextInt();
        }
        for(int i=0;i<n;i++){
            System.out.println(a[i]);
        }
       Arrays.sort(a);
       for(int i=0;i<n;i++){
        System.out.println(a[i]);
       }
       System.out.println("the smallest element of an given array is : "+a[0]);
       System.out.println("the largest element of an given array is : "+a[n-1]);
       System.out.println("the second largest element is :"+a[n-2]);
       System.out.println("the second smallest elemnet is: "+a[1]);
    }
}
