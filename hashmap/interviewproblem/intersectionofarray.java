package hashmap.interviewproblem;
import java.util.*;
public class intersectionofarray {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the size of an array 1:");
        int n=sc.nextInt();
        int a[]=new int[n];
        System.out.println("enter the elements of an array ");
        for(int i=0;i<n;i++){
            a[i]=sc.nextInt();
        }
        System.out.println("enter the size of an array 2:");
        int m=sc.nextInt();
        int b[]=new int[m];
        System.out.println("enter the elements of an array");
        for(int i=0;i<m;i++){
            b[i]=sc.nextInt();
        }
       HashMap<Integer,Integer> map=new HashMap<>();
        for(int i=0;i<n;i++){
            map.put(a[i],1);
        }
        for(int i=0;i<m;i++){
            if(map.containsKey(b[i])){
                map.put(b[i],map.get(b[i])+1);
            }
            else{   
                map.put(b[i],1);
            }
        }
        HashSet<Integer> list=new HashSet<>();
        for(var e:map.keySet()){
            if(map.get(e)>1){
                list.add(e);
            }
        }
        
        System.out.println("the elements present in both the array are: "+list);
       
}
}