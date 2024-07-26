package arraysofjava.twopintersofarray;

import java.util.Scanner;

public class zeroones {
    static void printarray(int arr[]){
        int n=arr.length;
        for(int i=0;i<n;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println(" ");
        
    }
    static void swap(int a[],int i,int j){
        
        int temp=a[i];
        a[i]=a[j];
        a[j]=temp;

    }
    public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    System.out.println("enter the length of the array");
    int n=sc.nextInt();
    int a[]=new int[n];
    for(int i=0;i<n;i++){
        a[i]=sc.nextInt();
    }
    printarray(a);
   for(int i=0;i<n;i++){
    for(int j=n-1;j>=0;j++){
        swap(a, i, j);
        System.out.println(a[j]);
 
    }
  
   }
    }
}
