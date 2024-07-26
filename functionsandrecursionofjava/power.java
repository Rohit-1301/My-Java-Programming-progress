package functionsandrecursionofjava;
import java.util.*;
public class power {
//     static int Power(int n,int y){
//         int result =0;
//         if(y==0){
//             return 1;
//         }
//         result=Power(n, y-1)*n;
//     return result;
// }
// alternative method
    static int Power(int n,int y){
        int result =1;
        if(y==0){
            return 1;
        }
        else if(y%2==0){
            result=Power(n,y/2)*Power(n,y/2);
        }
        else {
            result=Power(n,y/2)*Power(n,y/2)*n;
        }
      return  result;
}

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter base value: ");
        int n=sc.nextInt();
        System.out.println("enter the power:");
        int y=sc.nextInt();
        System.out.println(Power(n,y));
    }
}
