package arraysofjava;

import java.util.Scanner;
 
public class kstepsarray {
    static int[] rotate(int [] a,int k){
         int n=a.length;
         k=k%n;
         int[] ans=new int[n];
         int j=0;
         for(int i=n-k;i<=n;i++){
           ans[j++]=a[i];
         }
         for(int i=0;i<n-k;i++){
            ans[j++]=a[i];
         }
         return ans;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
       System.out.println("enter the length of the string");
       int n=sc.nextInt();
       System.out.println("enter to how much u want to rotate");
       int k=sc.nextInt();
       int a[]=new int[n];
       for(int i=0;i<n;i++){
        a[i]=sc.nextInt();
       }
       for(int i=0;i<n;i++){
        System.out.println(a[i]);
       }
      int ans[]=rotate(a, k);
        System.out.println(ans);
        printArray(ans);
    }
}
 