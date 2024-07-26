package ifelseofjava;

import java.util.Scanner;
public class oddeven {
    public static void main(String[] args) {
    Scanner sc= new Scanner(System.in);
    System.out.println("the value of y is");
     int y=sc.nextInt();
    
     if(y%2==0){
        System.out.println("the no.is even");
     }
     else{
        System.out.println("the no. is odd");
     }
    }
}
