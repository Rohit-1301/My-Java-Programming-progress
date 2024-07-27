package hashmap.interviewproblem;
import java.util.*;
public class unionoftwoarray {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the size of an array");
        int n=sc.nextInt();
        int a[]=new int[n];
        System.out.println("enter the elements of an array");
        for(int i=0;i<n;i++){
            a[i]=sc.nextInt();
        }
        System.out.println("enter the size of an array");
        int m=sc.nextInt();
        int b[]=new int[m];
        System.out.println("enter the elements of an array");
        for(int i=0;i<m;i++){
            b[i]=sc.nextInt();
        }
        HashSet<Integer> set=new HashSet<>();
        for(int i=0;i<n;i++){
            set.add(a[i]);
        }
        for(int i=0;i<m;i++){
            set.add(b[i]);
    }
    System.out.println(set);
    System.out.println(set.size());
}
}