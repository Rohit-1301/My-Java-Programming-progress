package sortingalgorithm.bubblesort;
import java.util.*;
public class zeros {
    static void sort(int a[],int n){
        for(int i=0;i<n-1;i++){
            for(int j=0;j<n-i-1;j++){
                if(a[j]==0 && a[j+1]!=0){
                    int temp=a[j];
                    a[j]=a[j+1];
                    a[j+1]=temp;
                }
            }
        }
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the length of an array");
        int n=sc.nextInt();
        int a[]=new int[n];
        for(int i=0;i<n;i++){
            a[i]=sc.nextInt();
        }
        sort(a, n);
        for(int i=0;i<n;i++){
            System.out.print(a[i]+" ");
        }
    }
}
