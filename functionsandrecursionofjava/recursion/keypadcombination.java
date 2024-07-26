package functionsandrecursionofjava.recursion;

import java.util.*;

public class keypadcombination {
    static void keypad(String s, String kp[], String res){
       
        if(s.length()==0){
            System.out.print(res+" ");
            return;
        }
      int currnumber=s.charAt(0)-'0';
      String currentchoices=kp[currnumber];
      for(int i=0;i<currentchoices.length();i++){
        keypad(s.substring(1), kp, res+currentchoices.charAt(i));
    }
    return ;
}
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the keypad digits");
        String s=sc.nextLine();
        String kp[]={"","","abc","def","ghi","jkl","mno","pqrs","tuv","wxyz"};
     keypad(s, kp, "");
    }
}
