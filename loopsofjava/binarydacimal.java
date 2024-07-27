package loopsofjava;

import java.util.Scanner;

public class binarydacimal {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter binary number");
        int a=sc.nextInt();
        int b=1;
        int ans=0;
        while(a>0){
            int digit=a%10;
            ans+=digit*b;
            a/=10;
            b*=2;
        }
        System.out.println("the decimal number of given binary no.is: "+ans);
    }
}
