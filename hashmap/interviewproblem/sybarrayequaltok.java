package hashmap.interviewproblem;

import java.util.*;

public class sybarrayequaltok {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the size of an array: ");
        int n = sc.nextInt();
        int a[] = new int[n];
        System.out.println("eneter the elemeents in ana araay: ");
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }
        System.out.println("enter the value of k: ");
        int k = sc.nextInt();
        int sum = 0;
        int ans = 0;
        HashMap<Integer, Integer> map = new HashMap<>();
        map.put(0, 1);
        for (int i = 0; i < n; i++) {
            sum += a[i];
            if (map.containsKey(sum - k)) {
                ans += map.get(sum - k);
            }
            if (map.containsKey(sum)) {
                map.put(sum, map.get(sum) + 1);
            } else {
                map.put(sum, 1);
            }
        }
        System.out.println("the number of subarrays are: " + ans);
    }
}
