package stacksandqueues.stacks.postfixexpression;
import java.util.*;
public class postfixevaluation {
    public static void main(String[] args) {
        String infix="963+4*6/-";
        Stack<Integer> val=new Stack<>();
        for(int i=0;i<infix.length();i++){
            char ch=infix.charAt(i);
            int ascii=(int)ch;
            if(ascii>=48 && ascii<=57){
                val.push(ch-48);
            }
            else if(ch=='+' || ch=='-' || ch=='*' || ch=='/'){
                int v2=val.pop();
                int v1=val.pop();
                if(ch=='+'){
                    val.push(v1+v2);
                }
                if(ch=='-'){
                    val.push(v1-v2);
                }
                if(ch=='*'){
                    val.push(v1*v2);
                }
                if(ch=='/'){
                    val.push(v1/v2);
                }
            }
        }
        System.out.println(val.peek());
    }
}
