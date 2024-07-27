package loopsofjava;

import java.util.Scanner;

public class reversedigits {
    public static void main(String[] args) {
        boolean flag=true;
        
        Scanner sc=new Scanner(System.in);
        System.out.println("enter which no.reverers would you want");
        int y=sc.nextInt();
        int r=0;
        while (y>0) {
            r=r*10+y%10;
            y=y/10;
            
        }
        
        System.out.println("the reverse no.is: "+r);
      
    }
}
