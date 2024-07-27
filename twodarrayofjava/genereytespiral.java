package twodarrayofjava;

import java.util.Scanner;

public class genereytespiral {
    static void printmatrix(int[][] matrix){
        for(int i=0; i<matrix.length; i++){
            for(int j=0; j<matrix[i].length; j++){
                System.out.print(matrix[i][j]+" ");
            }
            System.out.println(" ");
        }
    }
    static int[][] generatespiral(int n){
        int[][] spiral=new int[n][n];
        int toprow=0,bottomrow=n-1,leftcol=0,rightcol=n-1;
        int totalelement=1;
        while(totalelement<=n*n){
            for(int i=leftcol; i<=rightcol && totalelement<=n*n; i++){
                spiral[toprow][i]=totalelement++;
                
            }
            toprow++;
            for(int i=toprow; i<=bottomrow && totalelement<=n*n; i++){
                spiral[i][rightcol]=totalelement++;
                
            }
            rightcol--;
            for(int i=rightcol; i>=leftcol && totalelement<=n*n; i--){
                spiral[bottomrow][i]=totalelement++;
                
            }
            bottomrow--;
            for(int i=bottomrow; i>=toprow && totalelement<=n*n; i--){
                spiral[i][leftcol]=totalelement++;
                
            }
            leftcol++;
        }
        return spiral;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number of rows and columns");
        int n=sc.nextInt();
        int[][] spiral=generatespiral(n);
        printmatrix(spiral);
    }
}
