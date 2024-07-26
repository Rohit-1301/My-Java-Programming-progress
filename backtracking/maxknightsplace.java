package backtracking;

import java.util.*;

public class maxknightsplace {
    static int max = -1;
    static int num=-1;
    public static boolean helper(char board[][], int row, int col) {
        int n = board.length;
        // 2 up right
        int i, j;
        i = row - 2;
        j = col + 1;
        if ((i >= 0 && j < n) && board[i][j] == 'k')
            return false;
        // 2 up left
        i = row - 2;
        j = col - 1;
        if ((i >= 0 && j >= 0) && board[i][j] == 'k')
            return false;
        // 2 down left
        i = row + 2;
        j = col - 1;
        if ((i < n && j >= 0) && board[i][j] == 'k')
            return false;
        // 2 down right;
        i = row + 2;
        j = col + 1;
        if ((i < n && j < n) && board[i][j] == 'k')
            return false;
        // 2 right up
        i = row - 1;
        j = col + 2;
        if ((i >= 0 && j < n) && board[i][j] == 'k')
            return false;
        // 2 right down
        i = row + 1;
        j = col + 2;
        if ((i < n && j < n) && board[i][j] == 'k')
            return false;
        // 2 left up
        i = row - 1;
        j = col - 2;
        if ((i >= 0 && j >= 0) && board[i][j] == 'k')
            return false;
        // 2 left down
        i = row + 1;
        j = col - 2;
        if ((i < n && j >= 0) && board[i][j] == 'k')
            return false;

        return true;
    }

    public static void printboard(char board[][], int row, int col, int nofknights) {
        int n = board.length;
        if (row == n) {
           max=Math.max(max,nofknights);
            return;
        }  else if (helper(board, row, col)==true) {
            board[row][col] = 'k';
            if (col != n - 1)
                printboard(board, row, col + 1, nofknights + 1);
            else
                printboard(board, row + 1, 0, nofknights + 1);
            board[row][col] = '.';
        } 
           if (col != n - 1)
                printboard(board, row, col + 1, nofknights);
            else
                printboard(board, row + 1, 0, nofknights);
          

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the no. of rows in a chessboard");
        int n = sc.nextInt();
        
        char board[][] = new char[n][n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                board[i][j] = '.';
            }
        }

        printboard(board, 0, 0, 0);
        System.out.println("the maximum no. of knights that can be placed in the board is "+max);
        sc.close();
    }
}
