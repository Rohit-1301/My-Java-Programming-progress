package functionsandrecursionofjava.recursion;

import java.util.*;

public class subsequence {
    static ArrayList<String> sequence(String s) {
        ArrayList<String> ans = new ArrayList<String>();
        if(s.length()==0) {
            ans.add("");
            return ans;
        } 

        char current=s.charAt(0);
        ArrayList<String> smallans=sequence(s.substring(1));
        for(String ss: smallans){
            ans.add(ss);
            ans.add(current+ss);
        }
        return ans;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine();
        ArrayList<String> ans = sequence(s);
       
       for (String ss : ans) {
            System.out.print(ss+" ");
       }
    }
}
