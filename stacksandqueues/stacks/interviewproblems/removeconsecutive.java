package stacksandqueues.stacks.interviewproblems;
import java.util.*;
public class removeconsecutive {
    public static Stack consecutive(int a[]){
        Stack<Integer> st=new Stack<>();
        int count=0;
        int i=0;
        int j=0;
        int n=a.length;
       
        while(i<n){
            if(st.isEmpty()){
                st.push(a[i]);
                i++;
            }
            else{
                if(st.peek()==a[i]){
                   if(a[i]!=a[i+1]){
                    st.pop();
                    i++;
                   }
                   if(a[i]==a[i+1]){
                    count++;
                       i++;
                   }
              
            }
                else{
                    st.push(a[i]);
                    i++;
                }
            }
        }
        return st;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the no. of elements u want in a stack");
        int n=sc.nextInt();
        int a[]=new int[n];
        System.out.println("enter the element in a stack");
        for(int i=0;i<n;i++){
            a[i]=sc.nextInt();
        }
        System.out.println(consecutive(a));
    }
}
