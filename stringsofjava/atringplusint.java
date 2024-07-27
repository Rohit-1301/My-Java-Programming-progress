package stringsofjava;

import java.util.*;

public class atringplusint {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String str=sc.nextLine();
        str+="abc";
        str+=10;
        System.out.println(str);
    }
}
