package ifelseofjava;

import java.util.Scanner;

public class dividedby2or3 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter any integer: ");
        int n=sc.nextInt();
        if(n%2==0 && n%3==0 && n%6==0){
            System.out.println("the given no.n is dived by 2,3 and 6");
        }
        else if(n%2==0 || n%3==0 || n%6==0){
            System.out.println("the given no.is divided by either  2 or 3 or 6");
        }
        else if(n%2==0 && n%3==0 && n%6!=0){
            System.out.println("the given no.is  divided by 2 and 3 but not by 6");
        }
        else{
            System.out.println("the given no.is not divided by 2 3 and 6");
        }
    }
}
