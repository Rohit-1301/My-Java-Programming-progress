package backtracking;
import java.util.*;
public class printmaze{
    public static void print(int sr,int sc,int erow,int ecolumn,String s){
        if(sr>erow || sc>ecolumn) return;
        if(sr==erow && sc==ecolumn){
            System.out.println(s);
            return;
        }
        print(sr+1,sc,erow,ecolumn,s+"D");
        print(sr,sc+1,erow,ecolumn,s+"R");
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the no. of rows in a maze");
        int n=sc.nextInt();
        System.out.println("enter the no. of columns in a maze");
        int m=sc.nextInt();
        print(1,1,n,m," ");
    }
}