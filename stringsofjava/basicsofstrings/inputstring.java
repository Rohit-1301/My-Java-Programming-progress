package stringsofjava.basicsofstrings;
import java.util.*;
public class inputstring {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine();
        System.out.println(s);
        System.out.println(s.length());
        System.out.println(s.charAt(21));
        String str="Rohit is a Java developer";
        System.out.println(str.indexOf('r', 0));
       System.out.println(s.compareTo(str));
       System.out.println(str.compareTo(s));
       System.out.println(str.contains("Java"));
       System.out.println(str.toUpperCase());
       System.out.println(str.toLowerCase());
       System.out.println(s.concat(str));
       String a="1+1";
    int number=Integer.parseInt(a);
    
       System.out.println(number);
    
    }
}
