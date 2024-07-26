package arraysofjava;

import java.util.Scanner;

public class secondmax {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the length of a an array :");
        int n=sc.nextInt();
        int a[]=new int[n];
        int max=Integer.MIN_VALUE;
        int min=Integer.MAX_VALUE;
        

        for(int i=0;i<n;i++){
            a[i]=sc.nextInt();
        }
        for(int i=0;i<n;i++){
            if(a[i]>max){
                max=a[i];
            }
        }
    System.out.println(max);
    max=Integer.MIN_VALUE;
    
    int secondmax=Integer.MIN_VALUE;  
        for(int i=0;i<n;i++){
            if(a[i]>secondmax && max>a[i]){
                secondmax=a[i];
            }
        }
        System.out.println(secondmax);
        for(int i=0;i<n;i++){
            if(a[i]<min){
                min=a[i];
            }
        }
     System.out.println(min);
    
     int secondmin=Integer.MAX_VALUE;
        for(int i=0;i<n;i++){
            if(a[i]<secondmin && min<a[i]){
                secondmin = a[i];
            }
        }
        System.out.println(secondmin);
    }
}
