package twodarrayofjava;

import java.util.Scanner;



public class rectanglesum {
   
static void printmatrix(int matrix[][], int r, int c) {
    for (int i = 0; i < r; i++) {
        for (int j = 0; j < c; j++) {
            System.out.print(matrix[i][j] + " ");
        }
        System.out.println();
    }
}
 

    static int find(int[][] matrix,int x1,int x2,int y1,int y2){
        int sum=0;
        for(int i=x1;i<=x2;i++){
            for(int j=y1;j<=y2;j++){
                sum=sum+matrix[i][j];
            }
        }
        return sum;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the no.of rows");
        int r=sc.nextInt();
        System.out.println("enter the no.of columns");
        int c=sc.nextInt(); 
        int a[][]=new int[r][c];
        for(int i=0; i<r; i++) {
            for(int j=0; j<c; j++) {
               a[i][j]=sc.nextInt();
            }

        printmatrix(a, r, c);
        System.out.println("enter the co-ordinates of rectangle");
        int x1=sc.nextInt();
        int x2=sc.nextInt();
        int y1=sc.nextInt();
        int y2=sc.nextInt();
       find(a,x1,x2,y1,y2);
    }
}
}
