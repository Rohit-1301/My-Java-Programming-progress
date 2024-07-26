package backtracking;

import java.util.*;

public class nqueen {
    public static void nqueens(char board[][], int row) {
        int n = board.length;
        if (row == n) {
            for (int i = 0; i < n; i++) {
                for (int j = 0; j < n; j++) {
                    System.out.print(board[i][j] + " ");
                }
                System.out.println(" ");
            }
            System.out.println(" ");
            return;
        }
        for (int col = 0; col < n; col++) {
            if (isSafe(board, row, col)) {
                board[row][col] = 'Q';
                nqueens(board, row + 1);
                board[row][col] = 'X';
            }
        }
    }

    public static boolean isSafe(char board[][], int row, int col) {
        int n = board.length;
        for (int i = 0; i < n; i++) {
            if (board[row][i] == 'Q')
                return false;
        }
        for (int j = 0; j < n; j++) {
            if (board[j][col] == 'Q')
                return false;
        }
        int i = row;
        int j = col;
        while (i >= 0 && j < n) {
            if (board[i][j] == 'Q')
                return false;
            i--;
            j++;
        }
        i = row;
        j = col;
        while (i < n && j < n) {
            if (board[i][j] == 'Q')
                return false;
            i++;
            j++;
        }
        i = row;
        j = col;
        while (i < n && j >= 0) {
            if (board[i][j] == 'Q')
                return false;
            i++;
            j--;
        }
        i = row;
        j = col;
        while (i >= 0 && j >= 0) {
            if (board[i][j] == 'Q')
                return false;
            i--;
            j--;
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the order of an array you want to place the queen");
        int n = sc.nextInt();
        char board[][] = new char[n][n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                board[i][j] = 'X';
            }
        }
        nqueens(board, 0);
        sc.close();
    }
}
