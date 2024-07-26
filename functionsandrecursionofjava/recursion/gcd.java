package functionsandrecursionofjava.recursion;

import java.util.Scanner;

public class gcd {
    static int gcds(int a,int b){
        if(b==0){
            return a;
        }
        return gcds(b,a%b);
    }
    
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter value of 1st integer");
        int a=sc.nextInt();
        System.out.println("enter value of 2nd integer");
        int b=sc.nextInt();
        System.out.println("the value of the given two integer is: ");
       System.out.println(gcds(a, b));
        int lcm=(a*b)/gcds(a, b);
        System.out.println("the lcm of the given two integer is: "+lcm);
    
    }
}
