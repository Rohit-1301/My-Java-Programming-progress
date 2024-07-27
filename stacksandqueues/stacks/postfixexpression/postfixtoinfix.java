package stacksandqueues.stacks.postfixexpression;
import java.util.*;
public class postfixtoinfix {
    public static void main(String[] args) {
        String postfix="963+4*6/-";
        Stack<String> val=new Stack<>();
        for(int i=0;i<postfix.length();i++){
            char ch=postfix.charAt(i);
            int ascii=(int)ch;
            if(ascii>=48 && ascii<=57){
                String str=""+ch;
                val.push(str);
            }
            else if(ch=='+' || ch=='-' || ch=='*' || ch=='/'){
                String v1=val.pop();
                String v2=val.pop();
                String strs=ch+v2+v1;
                val.push(strs);
            }
        }
    }
}
