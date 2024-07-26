package arraysofjava;

import java.util.Scanner;

public class inplacereversearray {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the length of the array: ");
        int n=sc.nextInt();
        int a[]=new int[n];
        for(int i=0;i<n;i++){
            a[i]=sc.nextInt();
        }
        // for(int i=0;i<n;i++){
        //     System.out.print(a[i]+" ");
        // }
        System.out.println(" ");
        int j=0;
        int i=n-1;
        int temp;
        while(j>i){
             temp=a[j];
            a[j]=a[i];
            a[i]=temp;
            System.out.println(a[j]);
            i++;
            j--;
        }
        // for(i=0;i<n;i++){
        //     System.out.print(a[i]+" ");
        // }
        }
}

