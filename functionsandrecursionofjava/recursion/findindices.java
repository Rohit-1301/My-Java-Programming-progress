package functionsandrecursionofjava.recursion;

import java.util.*;

import twodarrayofjava.arraylist;



public class findindices {
    static ArrayList<Integer> getIndices(int a[],int n,int target,int idx){
        if(idx==n){
            return new ArrayList<>();
        }
       ArrayList<Integer> ans = new ArrayList<>();
       if(a[idx]==target){
        ans.add(a[idx]);
    }
   ArrayList<Integer> smallans= getIndices(a, n, target, idx+1);
   ans.addAll(smallans);
    return ans;
}
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the length of an array");
        int n=sc.nextInt();
        int a[]=new int[n];
        for(int i=0; i<n; i++){
            a[i]=sc.nextInt();
        }
        int idx=0;
        System.out.println("enter the target value");
        int target=sc.nextInt();
       ArrayList<Integer> ans= getIndices(a, n, target, idx);
       for(Integer i: ans){
        System.out.println(i);
       }
    }
}
