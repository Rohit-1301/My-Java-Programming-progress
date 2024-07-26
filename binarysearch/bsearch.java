package binarysearch;

import java.util.Scanner;

public class bsearch {
  static boolean binarysearch(int arr[], int target) {
    int start = 0;
    int end = arr.length - 1;
    
    while (start <= end) {
        int mid = (start + end) / 2;
      if (target==arr[mid]) {
        return true;
      } else if (target < arr[mid]) {
        end = mid - 1;
      } else {
        start = mid + 1;
      }
      
    }
    return false;
  }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter size of array");
        int n = sc.nextInt();
        int arr[] = new int[n];
        System.out.println("Enter elements of array");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        for(int i=0;i<n;i++){
            for(int j=i+1;j<n;j++){
                if(arr[i]>arr[j]){
                    int temp=arr[i];
                    arr[i]=arr[j];
                    arr[j]=temp;
                }
            }
        }
        
        
        System.out.println("Enter element to search");
        int target = sc.nextInt();
        System.out.println(binarysearch(arr, target));
    }

}