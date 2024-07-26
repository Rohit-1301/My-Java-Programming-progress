package functionsandrecursionofjava.recursion;

import java.util.*;

public class reversestring {
    static String reverse(String str,int idx){
        char ans;
        if(idx==-1){
            return "";
        }
       ans=str.charAt(idx);
      String reverse= ans+reverse(str, idx-1);
      return reverse;

    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String str=sc.nextLine();
        int idx=str.length()-1;
        System.out.println(str);
        String reverse=reverse(str, idx);
        System.out.println(reverse);
        if(str.equals(reverse)){
            System.out.println("the given string is palindrome");
        }
        else{
            System.out.println("the given string is not a palindrome");
        }

    }
}
