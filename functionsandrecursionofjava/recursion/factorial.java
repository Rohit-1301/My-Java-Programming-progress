package functionsandrecursionofjava.recursion;
import java.util.*;
public class factorial {
   static int factorials(int n){
    if(n==1){
       return 1;
       
    }
    int ans=n*factorials(n-1);
    return ans;
   }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the valueof n");
        int n=sc.nextInt();
        System.out.println("enter the value of r");
        int r=sc.nextInt();
        int nfact=factorials(n);
        int rfact=factorials(r);
        int nrfact=factorials(n-r);
        int combination=nfact/(rfact*nrfact);
        System.out.println("the combination of the given "+n+" "+r+" is "+combination);
    }
}
