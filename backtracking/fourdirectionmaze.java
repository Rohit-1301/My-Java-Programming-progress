package backtracking;

import java.util.*;

public class fourdirectionmaze {
    public static int ratinamaze(int sr, int sc, int erow, int ecolumn, boolean[][] isvisited) {
        if (sr < 0 || sc < 0)
            return 0;
        if (sr > erow || sc > ecolumn)
            return 0;
        if (isvisited[sr][sc] == true)
            return 0;
        if (sr == erow && sc == ecolumn)
            return 1;
        isvisited[sr][sc] = true;
        int rightways = ratinamaze(sr, sc + 1, erow, ecolumn, isvisited);
        int downways = ratinamaze(sr + 1, sc, erow, ecolumn, isvisited);
        int leftways = ratinamaze(sr, sc - 1, erow, ecolumn, isvisited);
        int upways = ratinamaze(sr - 1, sc, erow, ecolumn, isvisited);
        int count = rightways + downways + leftways + upways;
        isvisited[sr][sc] = false;
        return count;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the no. of rows in a maze");
        int n = sc.nextInt();
        System.out.println("enter the no. of columns in a maze");
        int m = sc.nextInt();
        boolean isvisited[][] = new boolean[n][m];
        int count = ratinamaze(0, 0, n - 1, m - 1, isvisited);
        System.out.println("the total no. of ways in a ratmaze to reach to destination is : " + count);
        sc.close();
    }
}
