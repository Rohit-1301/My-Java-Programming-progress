package functionsandrecursionofjava.recursion;
import java.util.*;
public class printreversenaturalnumbers {
    static void reverse(int n){
        if(n==1){
            System.out.print(n);
            return;
        }
        System.out.print(n+" ");
        reverse(n-1);
    }
    public static void main(String[] args) {
       Scanner sc=new Scanner(System.in);
       System.out.println("enter the no. of natural numbers");
       int n=sc.nextInt(); 
       reverse(n);
    }
}
