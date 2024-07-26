package arraysofjava;

import java.util.Scanner;

public class sorted {
    public static void main(String[] args) {
        boolean check=false;
        Scanner sc=new Scanner(System.in);
        System.out.println("eneter length of an array: ");
        int n=sc.nextInt();
        int a[]=new int[n];
        for(int i=0;i<n;i++){
            a[i]=sc.nextInt();
        }
        for(int i=0;i<n;i++){
            System.out.println(a[i]);
        }
        for(int i=1;i<n;i++){
            if(a[i]<a[i-1]){
                check=true;
            }
        }
        if(check==true){
            System.out.println("the given array is not sorted");
        }
        else{
            System.out.println("the given array is sorted");
        }
    }
}
