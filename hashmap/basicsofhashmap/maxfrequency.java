package hashmap.basicsofhashmap;

import java.util.*;

public class maxfrequency {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the length of an array :");
        int n = sc.nextInt();
        int a[] = new int[n];
        System.out.println("enter the elements of an array :");
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }
        Map<Integer, Integer> frequency = new HashMap<>();
        int maxfrequency = -1;
        int key=Integer.MIN_VALUE;
        for (int e : a) {
            if (!frequency.containsKey(e)) {
                frequency.put(e, 1);
                
            } else {
                frequency.put(e, frequency.get(e) + 1);
               
            }
        }
        for(var e: frequency.entrySet()){
            if(e.getValue()>maxfrequency){
                maxfrequency=e.getValue();
                key=e.getKey();
            }
        }
        System.out.println(frequency.entrySet());
        System.out.printf("the maximum frequency of element in an array is %d and its frquency is %d", key,
                maxfrequency);
    }
}
