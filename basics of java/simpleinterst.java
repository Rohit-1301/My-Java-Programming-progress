import java.util.Scanner;

public class simpleinterst {
    public static void main(String[] args)  {
    Scanner sc= new Scanner(System.in);
    System.out.println("the value of priciple is :");
    int p=sc.nextInt();
    System.out.println("the value of time is :");
    int t=sc.nextInt();
    System.out.println("the value of rate is :");
    int r=sc.nextInt();
   
    double SI=(p*r*t)/100;
    System.out.println("The value of Simple Interst is: "+SI);
    }
}
