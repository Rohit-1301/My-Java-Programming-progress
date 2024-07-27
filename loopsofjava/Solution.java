package loopsofjava;

import java.util.Scanner;

public class Solution {

    public boolean isPalindrome(int x) {

        int ans = 0;
        if (x < 0) {
            return false;
        }
        while (x != 0 || x > 0) {
            ans = ans * 10 + x % 10;
            x /= 10;
        }

        return (x==ans || x==ans/10);
        

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        System.out.println(new Solution().isPalindrome(x));
    }
}
