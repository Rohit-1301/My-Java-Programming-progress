package functionsandrecursionofjava.recursion;

import java.util.Scanner;

public class voidsubsequences {
    static void subsequences(String str,String curr){
       
        if(str.length()==0){
            System.out.println(curr);
            return;
        }
        char current=str.charAt(0);
        String remstring=str.substring(1);
     subsequences(remstring, curr+current);//current included
     subsequences(remstring,curr);//current not included

    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String str=sc.nextLine();
        subsequences(str, "");

    }
}
