package arraysofjava;

import java.util.Scanner;

public class uniquearray {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the length of an array: ");
        int n=sc.nextInt();
        int a[]=new int[n];
        int k=-1;
        for(int i=0;i<n;i++){
            a[i]=sc.nextInt();
        }
  for(int i=0;i<n;i++){
    for(int j=1;j<n;j++){
        if(a[i] == a[j]){
         a[i]=-1;
         a[j]=-1;
            }
            else if(a[i] > 0){
                k=a[i];
            }
        }
   }
   System.out.println("the  unique element is :"+k);
 

    }
}
