package stringsofjava;

public class stringsimmutability {
    public static void main(String[] args) {
        String s= "Gupta";
        System.out.println(s);
        
        String str=s.substring(0, 2);
        System.out.println(str);
        //as string is immutable in nature in java programming language we can't cahnge or manipulate any char in a string so we
        //use substring  method or directly make a new string
       int x=23/100;
       System.out.println(x);
    }
}
