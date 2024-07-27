package loopsofjava;

import java.util.Scanner;

public class naturalnumbers {
    public static void main(String[] args) {
      Scanner sc=new Scanner(System.in);
      System.out.println("enter how many numbers you want:  ");
      int y=sc.nextInt();

        
        for(int i=1;i<=y;i++){
            System.out.println(i);
        }
    }
}
