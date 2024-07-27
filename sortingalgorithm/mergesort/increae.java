package sortingalgorithm.mergesort;

import java.util.*;

public class increae {
   static void dispalayarray(int[] a){
      for(int i=0;i<a.length;i++){
         System.out.print(a[i]+" ");
      }
      System.out.println();
   }
   static void merge(int a[], int l, int mid, int r){
      int n1=mid-l+1;
      int n2=r-mid;
      int[] left=new int[n1];
      int[] right=new int[n2];
      for(int i=0;i<n1;i++){
         left[i]=a[l+i];

      }
      for(int i=0;i<n2;i++){
         right[i]=a[mid+1+i];
      }
      int i=0,j=0,k=l;
      while(i<n1 && j<n2){
         if(left[i]<=right[j]){
            a[k]=left[i];
            i++;
         }else{
            a[k]=right[j];
            j++;
         }
         k++;
      }
      while(i<n1){
         a[k]=left[i];
         i++;
         k++;
      }
      while(j<n2){
         a[k]=right[j];
         j++;
         k++;
      }
   }
   static void mergesort(int[] a, int l, int r){
      if(l>=r) return;
      int mid=(l+r)/2;
      mergesort(a, l, mid);
      mergesort(a, mid+1, r);
      merge(a, l, mid, r);
   }
   public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    System.out.println("enter the length of an array");
    int n=sc.nextInt();
    int a[]=new int[n];
    for(int i=0;i<n;i++){
        a[i]=sc.nextInt();

   }
   System.out.println("the array before sorted is");
   dispalayarray(a);
   
  mergesort(a, 0, n-1);
  System.out.println("the array after sorted is");
  dispalayarray(a);
}
}