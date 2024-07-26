package functionsandrecursionofjava.recursion;

import java.util.Scanner;

public class kmultiples {
    static void multy(int n,int k){

        if(k==1){
           System.out.print(n+" ");
           return;
        }
        multy(n,k-1);
       System.out.print(n*k+" ");
       
       return;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the no. whose multiples u want");
        int n=sc.nextInt();
        System.out.println("enter how many multiples u want for  "+n);
        int k=sc.nextInt();
        multy(n,k);
        
    }
}
