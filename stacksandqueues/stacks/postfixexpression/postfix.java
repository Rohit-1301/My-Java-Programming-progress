package stacksandqueues.stacks.postfixexpression;
import java.util.*;

public class postfix {
    public static void main(String[] args) {
        String s="9-(5+3)*4/6";
        Stack<String> val=new Stack<>();
        Stack<Character> op=new Stack<>();
        for(int i=0;i<s.length();i++){
            char ch=s.charAt(i);
            int ascii=(int)ch;
            if(ascii>=48 && ascii<=57){
                String str=""+ch;
                val.push(str);
            }
            else if(op.size()==0 || op.peek()=='(' || ch=='('){
                op.push(ch);
            }
         else if(ch==')'){
                while(op.peek()!='('){
                    String v1=val.pop();
                    String v2=val.pop();
                    char op1=op.pop();
                    String strs=v2+v1+op1;
                    val.push(strs);
                }
                op.pop();
            }
            else{
                if(op.peek()=='+' || op.peek()=='-'){
                    String v1=val.pop();
                    String v2=val.pop();
                    char op1=op.pop();
                    String strs=v2+v1+op1;
                    val.push(strs);
            }
            else if(op.peek()=='*' || op.peek()=='/'){
                String v1=val.pop();
                String v2=val.pop();
                char op1=op.pop();
                String strs=v2+v1+op1;
                val.push(strs);
         }
    }
}
        while(val.size()>1){
            String v1=val.pop();
            String v2=val.pop();
            char op1=op.pop();
            String strs=v2+v1+op1;
            val.push(strs);
        }
        String prefiix=val.pop();
        System.out.println(prefiix);
}
}