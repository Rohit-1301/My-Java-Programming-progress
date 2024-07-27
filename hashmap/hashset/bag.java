package hashmap.hashset;
import java.util.*;
public class bag {
    public static int maxelementintable(int bag[]){
        HashSet<Integer> table=new HashSet<>();
        int max=0;
        for(int i=0;i<bag.length;i++){
            int num=bag[i];
            if(table.contains(num)){
                table.remove(num);
            }
            else{
                table.add(num);
                max=Math.max(max,table.size());
            }
            }
            return max;
        }


    
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the size of array");
        int n=sc.nextInt();
        int a[]=new int[n];
        System.out.println("enter the elements of an array");
        for(int i=0;i<n;i++){
            a[i]=sc.nextInt();
        }
        System.out.println("the amximum element in a table is: "+maxelementintable(a));
    }
}
