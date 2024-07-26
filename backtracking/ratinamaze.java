package backtracking;
import java.util.*;
public class ratinamaze {
    public static int ratinamaze(int sr,int sc,int erow,int ecolumn){
       if(sr>erow || sc>ecolumn) return 0;
       if(sr==erow && sc==ecolumn) return 1;
       int rightways=ratinamaze(sr,sc+1,erow,ecolumn);
       int downways=ratinamaze(sr+1,sc,erow,ecolumn);
       return rightways+downways;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the no. of rows in a maze");
        int n=sc.nextInt();
        System.out.println("enter the no. of columns in a maze");
        int m=sc.nextInt();
        
        
        int count=ratinamaze(1,1,n,m);
        System.out.println("the total no. of ways in a ratmaze to reach to destination is : "+count);
    }
}
