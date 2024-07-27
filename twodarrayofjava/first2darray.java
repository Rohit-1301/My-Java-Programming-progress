package twodarrayofjava;

import java.util.Scanner;

public class first2darray {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter no.of rows of an array a");
        int r=sc.nextInt();
        System.out.println("enter no. of columns in an array a");
        int c=sc.nextInt();
        int a[][]=new int[r][c];
        System.out.println("enter the elments of an array a");
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
        System.out.println("enter no.of rows of an array b");
        int m=sc.nextInt();
        System.out.println("enter no. of columns in an array b");
        int n=sc.nextInt();
        int b[][]=new int[m][n];
        System.out.println("enter the elments of an array b");
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                b[i][j]=sc.nextInt();
            }
        }
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                System.out.print(b[i][j]+" ");
            }
            System.out.println(" ");
        }
        int ans[][]=new int[r][n];
        if(c==m){
            for(int i=0;i<r;i++){
                for(int j=0;j<n;j++){
                    for(int k=0;k<c;k++){
                        ans[i][j]=a[i][k] * b[k][j];
                    }
                }
            }
            for(int i=0;i<m;i++){
                for(int j=0;j<n;j++){
                    System.out.print(ans[i][j]+" ");
                }
                System.out.println(" ");
            }
        }
        else{
            System.out.println("the given two array can't be multiplied");
        }
               
    }
}
