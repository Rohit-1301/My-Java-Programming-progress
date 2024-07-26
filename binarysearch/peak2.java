package binarysearch;
import java.util.*;
public class peak2 {
    static void displayarray(int a[][],int r, int c){
        for(int i=0;i<r;i++){
            for(int j=0;j<c;j++){
                System.out.print(a[i][j]+" ");
            }
            System.out.println();
        }
    }
    
    
    static boolean peakelement2(int a[][],int r,int c,int target){
      int i=0;
      int j=c-1;
      while(i<r && j>=0){
        if(a[i][j]==target){
            return true;
        }
        else if(a[i][j]<target){
            i++;
        }
        else{
            j--;
        }
    

        }
        
    return false;
}
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter no. of rows u want in an array");
        int r=sc.nextInt();
        System.out.println("enter no. of column u want in an array");
        int c=sc.nextInt();
        int a[][]=new int[r][c];
        for(int i=0;i<r;i++){
            for(int j=0;j<c;j++){   
                a[i][j]=sc.nextInt();
        }
    }
    displayarray(a,r,c);
 
  
    System.out.println("enter the target which u want to check in the matrix");
    int target=sc.nextInt();    
    System.out.println(peakelement2(a,r,c,target));
}
}