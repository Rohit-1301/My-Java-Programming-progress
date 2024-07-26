package functionsandrecursionofjava;

import java.util.Scanner;

public class sum {
    public static int sum(int a,int b){
        int ans=a+b;
        return ans;
    }

    public static void main(String[] args) {
         Scanner sc=new Scanner(System.in);
    
        System.out.println("enter value of a");
        int x=sc.nextInt();
       System.out.println("enter value of b");
       int y=sc.nextInt();
       int add=sum(x,y);
       System.out.println("the sum of two number is: "+add);
       System.out.println(Math.sqrt(6));
       System.out.println(Math.sqrt(9));
       System.out.println(Math.floor(6.4));
       System.out.println(Math.ceil(9.5));
    }
    }
