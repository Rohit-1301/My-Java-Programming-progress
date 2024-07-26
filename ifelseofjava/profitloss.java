package ifelseofjava;

import java.util.Scanner;

public class profitloss {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter cost price: ");
        double cp=sc.nextInt();
        System.out.println("Enter your selling price: ");
        double sp=sc.nextInt();
        double y=sp-cp;
        if(sp>cp){
            System.out.println("seller made a profit and he makes a profit of: "+y);
            
        }
        else{
            System.out.println("seller made a loss and he makes a loss of: "+y*-1);
        }
    }
}
