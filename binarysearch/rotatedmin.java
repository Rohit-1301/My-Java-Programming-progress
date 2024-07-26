package binarysearch;
import java.util.*;
public class rotatedmin {
    static void displayarray(int a[], int n) {
        for (int i = 0; i < n; i++) {
            System.out.print(a[i] + " ");
        }
        System.out.println();
    }
    static void rotate(int[] a, int k) {
        int n = a.length;
        k = k % n;
        reverse(a, 0, n - k - 1);
        reverse(a, n - k, n - 1);
        reverse(a, 0, n - 1);
    }

    static void reverse(int[] a, int start, int end) {
        while (start < end) {
            int temp = a[start];
            a[start] = a[end];
            a[end] = temp;
            start++;
            end--;
        }
    }
  
        static int min(int[] a, int n) {
            int start=0;
            int end=n-1;
            int ans=-1;
            
            while(start<=end){
                int mid=start+(end-start)/2;
                if(a[mid]>a[n-1]){
                  start=mid+1;
                  
                }
                else if(a[mid]<=a[n-1]){
                   ans=mid;
                   end=mid-1;
                }
               
            }
            return ans;
        }
  
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the length of an array");
        int n = sc.nextInt();
        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
    }
        System.out.println("array before rotating");
        displayarray(a, n);
        System.out.println("how many rotation do u want in an array");
        int k = sc.nextInt();
        rotate(a, k);
        System.out.println("array after rotating");
        displayarray(a, n);
        System.out.println("the minimum element in an array is");
      System.out.println(min(a, n));
        
}

}