package arraysofjava;

import java.util.Scanner;

public class reversearray {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the length of the string");
        int n=sc.nextInt();
        int a[]=new int[n];
        for(int i=0;i<n;i++){
            a[i]=sc.nextInt();
        }
        for(int i=0;i<n;i++){
            System.out.println(a[i]);
        }
    
        int ans[]=new int[n];
        for(int i=n-1;i>=0;i--){
            for(int j=0;j<n;j++){

          
            ans[j]=a[i];
          
        }
        System.out.print(ans[i]+" ");
        }
       
}
}