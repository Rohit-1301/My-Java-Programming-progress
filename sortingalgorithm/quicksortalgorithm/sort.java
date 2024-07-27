package sortingalgorithm.quicksortalgorithm;

import java.util.Scanner;

public class sort {
    static void displayarray(int a[],int n){
        for(int i=0;i<n;i++){
            System.out.print(a[i]+" ");
        }
        System.out.println();
    }
    static void swap(int a[],int i,int j){
        int temp=a[i];
        a[i]=a[j];
        a[j]=temp;
    }
    static void quicksort(int a[],int low,int high){
        if(low<high){
            int pi=partition(a,low,high);
            quicksort(a,low,pi-1);
            quicksort(a,pi+1,high);
        }

    }
    static int partition(int a[],int low,int high){
        int pivot=a[high];
        int i=low-1;
        for(int j=low;j<=high-1;j++){
            if(a[j]<pivot){
                i++;
                swap(a,i,j);
            }
        }
        swap(a,i+1,high);
        return i+1;
    }
    
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the length of an array");
        int n=sc.nextInt();
        int a[]=new int[n];
        for(int i=0;i<n;i++){
            a[i]=sc.nextInt();
        }
        System.out.println("the array before sorting");
        displayarray(a,n);
        quicksort(a,0,n-1);
        System.out.println("the array after sorting");  
        displayarray(a,n);
    }
}
