package functionsandrecursionofjava.recursion;
import java.util.*;
public class printnaturalnumbers {
    static void printnatural(int n){
        if(n==1){
            System.out.println(n);
            return ;
        }
        printnatural(n-1);
        System.out.println(n);
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the no. of terms u want to print");
        int n=sc.nextInt();
        printnatural(n);
    }
}
