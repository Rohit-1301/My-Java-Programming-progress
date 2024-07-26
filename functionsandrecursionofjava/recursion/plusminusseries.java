package functionsandrecursionofjava.recursion;

import java.util.Scanner;

public class plusminusseries {
    static int sumseries(int n){
        int sum = 0;
        if(n==0){
            return 0;
        }
       if(n%2==0){
        sum=sumseries(n-1)-n;
       }
       else{
        sum=sumseries(n-1)+n;
       }
       return sum;
    }
   public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    System.out.println("enter the no. of terms whose sum of series u want to check");
    int n=sc.nextInt();
    System.out.println(sumseries(n));
   }

}
