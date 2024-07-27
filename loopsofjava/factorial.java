package loopsofjava;

import java.util.Scanner;

public class factorial {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter which no. factorial you want: ");
        int y=sc.nextInt();
        int fact=1;
        
        for(int i=1;i<=y;i++){
            fact=fact*i;
           
        }
        System.out.println("the factorial of given no. is: "+fact);
    }
}
