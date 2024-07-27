package twodarrayofjava;

import java.util.Scanner;

public class transpose {
    public static void main(String[] args) {
       Scanner sc=new Scanner(System.in);
       System.out.println("enter no. of rows for an array a");
       int r=sc.nextInt();
       System.out.println("enter the no. of columns for an array a");
       int c=sc.nextInt();
       int a[][]=new int[c][r];
       for(int i=0;i<r;i++){
        for(int j=0;j<c;j++){
            a[i][j]=sc.nextInt();
        }
       }
       for(int i=0;i<r;i++){
        for(int j=0;j<c;j++){
            System.out.print(a[i][j]+" ");
        }
        System.out.println(" ");
    }
        // int transpose[][]=new int[c][r];
    //         it is using extra array
    //     for(int i=0;i<c;i++){
    //         for(int j=0;j<c;j++){
    //         transpose[i][j]=a[j][i];
    //         }
    // }
    // for(int i=0;i<c;i++){
    //     for(int j=0;j<c;j++){
    //         System.out.print(transpose[i][j]);
    //     }
    //     System.out.println(" ");
    // }
       
    
    // now without using any array
    System.out.println("the transpose array is");
    for(int i=0;i<c;i++){
        for(int j=i;j<r;j++){
            int temp=a[i][j];
            a[i][j]=a[j][i];
            a[j][i]=temp;
        }
    }
    for(int i=0;i<r;i++){
        for(int j=0;j<c;j++){
            System.out.print(a[i][j]+" ");
        }
        System.out.println(" ");
    }
  }
}
