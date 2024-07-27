package stringsofjava.stringbuilder;

import java.util.*;

public class toggle {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        StringBuilder str=new StringBuilder(sc.nextLine());
        System.out.println(str);
        for(int i=0;i<str.length();i++) {
            char ch=str.charAt(i);
            boolean flag=true;// ch is capital letter
            int ascii=(int)ch;
            if(ascii>=97) flag=false; //ch is small letter
            if(ch==' ') continue;
            if(flag==true){
                ascii+=32;
                char dh=(char)ascii;
                str.setCharAt(i,dh);
            }
            else{
                ascii-=32;
                char dh=(char)ascii;
                str.setCharAt(i,dh);
            }

    }
    System.out.println(str);
}
}