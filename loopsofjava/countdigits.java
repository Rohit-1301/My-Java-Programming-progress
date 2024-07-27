package loopsofjava;

import java.util.Scanner;

public class countdigits {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter which value of n no. of digits you want to count");
        int n = sc.nextInt();
        System.out.println("Enter any value of y");
        int y=sc.nextInt();
        int r = 0;
        int s=0;
       
          while (n>0) {
            n=n/10;
            r++;
          }
          while (y>0) {
            s+=y%10;
            y=y/10;
          }
        System.out.println("the no. of digits of value n is :" + r);
        System.out.println("the sum of the digits of given no.is: "+s);
    }
}
