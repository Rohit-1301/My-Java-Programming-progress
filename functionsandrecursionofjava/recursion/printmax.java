package functionsandrecursionofjava.recursion;
import java.util.*;
public class printmax {
    static int print(int a[],int n){
        if(n==0){
            return 0;
        }
        if(a[n-1]>print(a,n-1)){
            return a[n-1];
        }
        return print(a,n-1);
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the no. of elements");
        int n=sc.nextInt();
        int a[]=new int[n];
        for (int i=0; i<n;i++) {
            a[i]=sc.nextInt();
    }
    System.out.println(print(a,n));
}
}