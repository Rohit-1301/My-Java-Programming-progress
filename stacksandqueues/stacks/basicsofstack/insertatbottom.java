package stacksandqueues.stacks.basicsofstack;
import java.util.*;
public class insertatbottom {
    public static Stack insertatanyindex(Stack st,int ele,int idx){
        
        Stack<Integer> st1=new Stack<>();
        while(st.size()>idx){
           st1.push((Integer) st.pop());
        }
        st1.push(ele);
        while(st1.size()>0){
            st.push(st1.pop());
        }
      
        
        return st;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the no.of elements u want in a stack");
        int n=sc.nextInt();
        Stack<Integer> st=new Stack<>();
        System.out.println("enter the elements in the stack");
        for(int i=0;i<n;i++){
            st.push(sc.nextInt());
        }
        System.out.println("enter the element u want to insert ");
        int ele=sc.nextInt();
        System.out.println("enter the index at which u want to insert the element");
        int idx=sc.nextInt();
        System.out.println(insertatanyindex(st, ele,idx));
    }
}
