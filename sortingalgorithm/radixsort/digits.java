package sortingalgorithm.radixsort;
import java.util.*;
public class digits {
    static void displayarray(int arr[], int n){
        for(int i=0;i<n;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }
    static int max(int arr[], int n){
        int max=arr[0];
        for(int i=1;i<n;i++){
            if(arr[i]>max){
                max=arr[i];
            }
        }
        return max;
    }
    static void countsort(int arr[], int n,int place){
        int max=max(arr,n);
        int count[]=new int[10];
        int output[]=new int[n];
        for(int i=0;i<n;i++){
            count[(arr[i]/place)%10]++;
        }
        for(int i=1;i<count.length;i++){
            count[i]+=count[i-1];
        }
        for(int i=n-1;i>=0;i--){
            int idx=count[(arr[i]/place)%10]-1;
            output[idx]=arr[i];
            count[(arr[i]/place)%10]--;
        }
        for(int i=0;i<n;i++){
            arr[i]=output[i];
        }
    }
    static void radixsort(int arr[], int n){
        int max=max(arr,n);
        for(int place=1;max/place>0;place*=10){
            countsort(arr, n,place);
        }
    }
    public static void main(String[] args) {
        System.out.println("enter the length of an array");
        Scanner sc=new Scanner(System.in);
        int n =sc.nextInt();
        int arr[]= new int[n];
        System.out.println("Enter elements of an array ");
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        radixsort(arr, n);
        displayarray(arr, n);
    }
}
