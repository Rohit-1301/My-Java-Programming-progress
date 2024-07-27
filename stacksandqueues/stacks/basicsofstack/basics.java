package stacksandqueues.stacks.basicsofstack;
import java.util.Stack;
public class basics {
    public static void main(String[] args) {
        Stack<Integer> st=new Stack<>();
        System.out.println(st.isEmpty());
        st.push(1);
        st.push(2);
        st.push(45);
        st.push(3);
        st.push(81);
        System.out.println("the stack which is created by me is :");
        System.out.println(st);
        System.out.println("the last element of the stack which is inserted in the stack is: "+st.peek());
        System.out.println("the size of tthe given stack is: "+st.size());
        while(st.size()>1){
            st.pop();
        }
        System.out.println("the fist element which is iinserted in the given stack is: "+st.peek());
        System.out.println(st.isEmpty());
    }
}
