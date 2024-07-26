package functionsandrecursionofjava.recursion;

import java.util.*;

public class targetcoinrec {
   public static int target(int n, int coin[]) {
      if (n == 0)
         return 0;
      if (n < 0)
         return Integer.MAX_VALUE;
      int ans = Integer.MAX_VALUE;
      for (int i = 0; i < coin.length; i++) {
         int mini = target(n - coin[i], coin);
         if (mini != Integer.MAX_VALUE) {
            ans = Math.min(ans, mini + 1);
         }
      }
      return ans;
   }

   public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
      System.out.println("enter the target");
      int n = sc.nextInt();
      int coin[] = { 1, 2, 5 };
      System.out.println("the number of ways to reach the target is: " + target(n, coin));
   }
}
