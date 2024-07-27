package stacksandqueues.stacks.basicsofstack;
import java.util.*;
public class copystack {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the no.of elements u want in a stack");
        int n=sc.nextInt();
        Stack<Integer> st=new Stack<>();
        System.out.println("enter the elements in the stack");
        for(int i=0;i<n;i++){
            st.push(sc.nextInt());
        }
        Stack<Integer> st1=new Stack<>();
        while(st.size()>0){
            st1.push(st.pop());
        }
        System.out.println("the stack st1 is: ");
        System.out.println(st1);
        Stack<Integer> st2=new Stack<>();
        while(st1.size()>0){
            st2.push(st1.pop());
        }
        System.out.println("the stack st2 is the copy of st and it is in order: ");
        System.out.println(st2);
        System.out.println("the reverse order of st stack is:");
        while(st2.size()>0){
            st.push(st2.pop());
        }
        System.out.println(st);
    }
}
