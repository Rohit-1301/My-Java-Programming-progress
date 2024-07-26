package classandobject.exceptionhandling;
import java.util.*;
public class trycatch {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        try{
            int a=sc.nextInt();
            int b=sc.nextInt();
            System.out.println(a/b);
        }
        catch(Exception e){
            System.out.println("we failed to run program. Reason: "+e);
        }
        finally{
            System.out.println("finally block is complete");
        }
    }
}
