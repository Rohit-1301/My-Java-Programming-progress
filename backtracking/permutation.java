package backtracking;
import java.util.*;;
public class permutation {
    public static void permute(String p,String up,List<String> list){
        if(up.isEmpty()){
            list.add(p);
            return;
        }
        for(int i=0;i<up.length();i++){
            char c=up.charAt(i);
            String left=up.substring(0,i);
            String right=up.substring(i+1);
            permute(p+c,left+right,list);
        }
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the string ");
        String s=sc.nextLine();
        List<String> list=new ArrayList<>();
        permute("",s,list);
        for(int i=0;i<list.size();i++){
            System.out.println(list.get(i));
        }
        sc.close();
    }
}
