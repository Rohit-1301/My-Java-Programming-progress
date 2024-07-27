package patternprinting;

import java.util.Scanner;

public class emptyrectanglepattern {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("eneter no.of rows");
        int r=sc.nextInt();
        System.out.println("enter no. of columns");
        int c=sc.nextInt();
        for(int i=1;i<=r;i++){
            for(int j=1;j<=c;j++){
                if(i==1 || i==r || j==1 || j==3){
                    System.out.print("*");
                    
                }
                else{
                    System.out.println("");
                }

            }
            System.out.println();
        }
    }
}
