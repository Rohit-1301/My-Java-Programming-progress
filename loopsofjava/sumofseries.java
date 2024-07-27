package loopsofjava;

import java.util.Scanner;

public class sumofseries {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enetr how many terms series do you want");
      int  n=sc.nextInt();
      int sum=0;
   for(int i=1;i<=n;i++){
    sum+=i;
   }
      System.out.println("the sum of the given series is: "+sum);
    }
}
