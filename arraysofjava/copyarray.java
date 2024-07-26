package arraysofjava;

import java.util.Scanner;

public class copyarray {
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
        System.out.println();
        // it will print the array by copying it from a
        int b[]=a;
     
        for(int i=0;i<n;i++){
            System.out.print(b[i]);
        }
        System.out.println();
        b[0]=7;
        b[1]=9;
        b[2]=4;
        b[3]=190;
        b[4]=90;
        //it is an array of b after changing value
        for(int i=0;i<n;i++){
            System.out.print(b[i]);
        }
        System.out.println();
        //it will check whether if we change the value of array in b it can affect on the array b or not
        for(int i=0;i<n;i++){
            System.out.print(a[i]);
        }

    }
}
