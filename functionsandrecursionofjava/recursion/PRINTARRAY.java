package functionsandrecursionofjava.recursion;
import java.util.*;
public class PRINTARRAY {
    static void printarray(int a[],int idx,int n){
        if(idx==n) return; 
        System.out.print(a[idx]+" ");
       printarray(a, idx+1, n);
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the length of the array");
        int n=sc.nextInt();
        int a[]=new int[n];
        for(int i=0;i<n;i++){
            a[i]=sc.nextInt();
        }
        printarray(a, 0,n);
    }
}
