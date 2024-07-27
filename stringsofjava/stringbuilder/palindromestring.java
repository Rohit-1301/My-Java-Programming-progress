package stringsofjava.stringbuilder;

import java.util.Scanner;

import stringsofjava.substring;

public class palindromestring {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        StringBuilder str=new StringBuilder(sc.nextLine());
        System.out.println(str);
        StringBuilder str2=new StringBuilder();
        int count=0;
        for(int i=0;i<str.length();i++) {
            for(int j=i;j<str.length()+1;j++) {
              str.substring(i,j);
              str2=str.reverse();
                
    }
            if(str==str2) {
                
                count++;
            }
}
        System.out.println(count);     
}
}