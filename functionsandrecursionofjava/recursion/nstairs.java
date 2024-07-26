package functionsandrecursionofjava.recursion;
import java.util.*;

public class nstairs {
    public static int climbstairs(int n,int i) {
       if(n==i) return 1;
       if(n<i) return 0;
       return climbstairs(n-1,i)+climbstairs(n-2,i)%1000000007;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the number of stairs");
        int n=sc.nextInt();
        int i=0;
        System.out.println("the number of ways to climb the stairs is: "+climbstairs(n,i));
    }
}
