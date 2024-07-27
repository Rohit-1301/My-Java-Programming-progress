package hashmap.hashset;
import java.util.*;;
public class unsortedarrayproblem {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the size of array");
        int n=sc.nextInt();
        int arr[]=new int[n];
        System.out.println("Enter the elements of array");
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        HashSet<Integer> set=new HashSet<>();
        for(int i=0;i<n;i++){
            set.add(arr[i]);
        }
        int maxconsecutive=0;
        for(var i: set){
            int currentconsecutive=1;
            int currentnum=i;
            if(!set.contains(i-1)){
                while(set.contains(currentnum+1)){
                    currentconsecutive++;
                    currentnum++;
                }
                maxconsecutive=Math.max(maxconsecutive,currentconsecutive);
            }
            }
            System.out.println("the maximum consecutive element in an array is: "+maxconsecutive);
        }

    }

