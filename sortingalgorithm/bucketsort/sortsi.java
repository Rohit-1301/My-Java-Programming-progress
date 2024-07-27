package sortingalgorithm.bucketsort;
import java.util.*;
public class sortsi {
    static void bucketsort(float arr[]){
        int n=arr.length;
        //creating empty buckets
        ArrayList<Float> buckets[]=new ArrayList[n];
        for(int i=0;i<n;i++){
            buckets[i]=new ArrayList<Float>();
        }

        //adding elements in a buckets
        for(int i=0;i<n;i++){
            int bucketIndex=(int) arr[i]*n;
            buckets[bucketIndex].add(arr[i]);
        }
        //sorting ech buckets individually
        for(int i=0;i<n;i++){
            Collections.sort(buckets[i]);
        }
        //now merging each sort
        int index=0;
        for(int i=0;i<n;i++){
            ArrayList<Float> currBucket=buckets[i];
            for(int j=0;j<currBucket.size();j++){
                arr[index++]=currBucket.get(j);
            }
    }
}
    public static void main(String[] args) {
        System.out.println("the array before soorting is");
      float arr[]={0.1f,0.2f,0.5f,0.321f,0.241f,0.214f,0.415f,0.874f,0.74f,0.98f,0.125f,0.564f,0.6541f,0.652f,0.62f,0.31f,0.21f,0.15f};
      for (float f : arr) {
        System.out.print(f+ " ");
      }
      System.out.println("the array after sorting is");
      bucketsort(arr);
      for (float f : arr) {
        System.out.print(f+ " ");
      }
    }
}
