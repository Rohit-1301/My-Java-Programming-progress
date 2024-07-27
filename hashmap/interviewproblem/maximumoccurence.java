package hashmap.interviewproblem;
import java.util.*;
public class maximumoccurence {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the size of an array");
        int n=sc.nextInt();
        int a[]=new int[n];
        System.out.println("enter the elements of an array");
        for(int i=0;i<n;i++){
            a[i]=sc.nextInt();
        }
        HashMap<Integer,Integer> map=new HashMap<>();
        for(int i=0;i<n;i++){
            if(map.containsKey(a[i])){
                map.put(a[i],map.get(a[i])+1);
            }
            else{
                map.put(a[i],1);
            }
        }
        int occur=-1;
       List<Integer> list=new ArrayList<>();
        for(var e:map.keySet()){
            if(map.get(e)>n/3){
                list.add(e);

            }
        }
        System.out.println("the maximum occurence of an element in an array is "+list);
    }
}
