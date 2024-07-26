package backtracking;
import java.util.*;
public class ratmaxeoptimized {
    public static int ratinamaze(int sr, int sc, int erow, int ecolumn, int a[][]) {
        if (sr < 0 || sc < 0)
            return 0;
        if (sr > erow || sc > ecolumn)
            return 0;
        if (a[sr][sc] == 0)
            return 0;
        if (sr == erow && sc == ecolumn)
            return 1;
        if(a[sr][sc]==-1)
            return 0;
        a[sr][sc] = -1;
        int rightways = ratinamaze(sr, sc + 1, erow, ecolumn, a);
        int downways = ratinamaze(sr + 1, sc, erow, ecolumn, a);
        int leftways = ratinamaze(sr, sc - 1, erow, ecolumn, a);
        int upways = ratinamaze(sr - 1, sc, erow, ecolumn, a);
        int count = rightways + downways + leftways + upways;
        a[sr][sc] = 1;
        return count;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the no. of rows in a maze");
        int n = sc.nextInt();
        System.out.println("enter the no. of columns in a maze");
        int m = sc.nextInt();
        int a[][] = new int[n][m];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                a[i][j] = sc.nextInt();
            }
        }
       
        int count = ratinamaze(0, 0, n - 1, m - 1, a);
        System.out.println("the total no. of ways in a ratmaze to reach to destination is : " + count);
        sc.close();
    }
}
