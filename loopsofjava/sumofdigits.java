package loopsofjava;
import java.util.*;
public class sumofdigits {
    static int sod(int n){
        if(n>=0 && n<=9){
            return n;
        }
        else{
            return sod(n/10)+n%10;
        }
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the no. whose sum of digits u want to check");
        int n=sc.nextInt();
        System.out.println("the sum of the given integer "+n+" is " +sod(n));
    }
}
