package functionsandrecursionofjava.recursion;
import java.util.*;
public class removea {
    static String answer(String s,int idx){
        if(idx==s.length()) return " ";
        String smallans=answer(s,idx+1);
        char current=s.charAt(idx);
        if(current!='a'){
            return current+smallans;
        }
        else{
            return smallans;
        }
    }
    static String ans(String s){
        if(s.length()==0)return "";
        String smallans=ans(s.substring(1));
        char current=s.charAt(0);
        if(current!='a'){
            return current+smallans;
        }
        else{
            return smallans;
        }
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner (System.in);
        String s=sc.nextLine();
      int idx=0;
     System.out.println(answer(s, idx));
     System.out.println(ans(s));
    }
}
