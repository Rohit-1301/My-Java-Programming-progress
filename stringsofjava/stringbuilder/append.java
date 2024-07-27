package stringsofjava.stringbuilder;
import java.util.*;
public class append {
    public static void main(String[] args) {
        StringBuilder sb=new StringBuilder("hello");
        System.out.println(sb);
        sb.setCharAt(0, 'm');
        System.out.println(sb);
        sb.append("true");
        System.out.println(sb);
        sb.insert(2,'y');
        System.out.println(sb);
        sb.deleteCharAt(2);
        System.out.println(sb);
    }
}
