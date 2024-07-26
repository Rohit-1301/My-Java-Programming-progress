package functionsandrecursionofjava.recursion;

import java.util.*;

public class sumsequences {
    static void sumsubset(int a[],int n,int idx,int sum){
        if(idx>=n){
            System.out.println(sum);
            return;
        }
      sumsubset(a,n,idx+1,sum+a[idx]);//include
      sumsubset(a,n,idx+1,sum);//exclude
      
    }
    public static void main(String[] args) {
       
    
        Scanner scanner = new Scanner(System.in);
        System.out.println("enter the length of an array");
        int n=scanner.nextInt();
        int a[]=new int[n];
        for(int i=0; i<n; i++){
            a[i]=scanner.nextInt();
        }
        int idx=0;
        int sum=0;
        sumsubset(a, a.length,idx,sum);
    }
    }
