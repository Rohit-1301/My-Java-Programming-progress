package binarysearch;
import java.util.*;
public class mountainarray {
    static void diisplayarray(int a[],int n){
        for(int i=0;i<n;i++){
            System.out.print(a[i]+" "); 
        }
    }
   static int peakIndexInMountainArray(int[] arr) {
        int start=0;
        int end=arr.length-1;
        int ans=-1;
        while(start<=end){
            int mid=start+(start+end)/2;
            if(arr[mid]<arr[mid+1]){
                start=mid+1;
                ans=mid+1;
            }
            else{
                end=mid-1;
            }
        }
        return ans;
    }

    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int start=0;
        System.out.println("eneter the length of an array");
        int n=sc.nextInt();
        int a[]=new int[n];
        for(int i=0;i<n;i++){
            a[i]=sc.nextInt();
        }
        diisplayarray(a, n);
        
       

        System.out.println("the index of the peak element is: ");
        peakIndexInMountainArray(a);
    }
}
