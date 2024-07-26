package functionsandrecursionofjava.recursion;

import java.util.Scanner;

public class retynindex {
    static int index(int a[],int n,int target,int idx) {
            if(idx==n) return 0;
            if(a[idx]==target){
                System.out.print(idx+" ");
            } 

            return index(a,n,target,idx+1);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the length of the target");
        int n = sc.nextInt();
        int a[] = new int[n];

        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }
        System.out.println("enter the target element");
        int target = sc.nextInt();
        int idx = 0;
        index(a, n, target, idx);
}
}