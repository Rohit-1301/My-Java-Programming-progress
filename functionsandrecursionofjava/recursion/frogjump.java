package functionsandrecursionofjava.recursion;

import java.util.*;

public class frogjump {
    static int frogjump(int a[],int n,int idx){
        if(idx==n-1){
            return 0;
        }
        int op1=Math.abs(a[idx]-a[idx+1])+frogjump(a, n, idx+1);
        if(idx==n-2) return op1;
        int op2=Math.abs(a[idx]-a[idx+2])+frogjump(a, n, idx+2);
        return Math.min(op1,op2);

    }
    public static void main(String[] args) {
        
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the no. if elements in an array");
        int n=sc.nextInt();
        int a[]=new int[n];
        for (int i=0; i<n;i++) {
            a[i]=sc.nextInt();
        }
        int idx=0;
       int ans=frogjump(a,n,idx);
       System.out.println(ans);
    }
}
