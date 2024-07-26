package classandobject.exceptionhandling;

import java.util.Scanner;

public class typesoferrors {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // int a=5 it is an syntax error in which when we wite the code during that time
        // it shows error due to not following conventional programming language method
        int a = 5;
        System.out.println(a);
        int b = 0;
        // System.out.println(a / b);
        // it is an logical error in which we are using zero as a divisor it is
        // basically dome by the developer or programmer who is working on it and it
        // will not give the output or the output which is not wnated
      
    //write prime number code
        for(int num=2;num<=32;num++){
            int count=0;
            for(int i=1;i<=num;i++){
                if(num%i==0){
                    count++;
                }
            }
            if(count==2){
                System.out.println(num);
            }
        }
    }
}