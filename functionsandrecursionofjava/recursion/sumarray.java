package functionsandrecursionofjava.recursion;

import java.util.Scanner;

public class sumarray {
    static int suma(int a[],int idx){
        int n=a.length;
        int sum=0;
        if(idx==n-1) return a[idx];
        sum+=suma(a,idx+1);
        return sum+a[idx];
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the length of an array");
        int n=sc.nextInt();
        int a[]=new int[n];
        for(int i=0; i<n; i++){
            a[i]=sc.nextInt();
        }
        int idx=0;
        System.out.println(suma(a, idx));
    }
}
