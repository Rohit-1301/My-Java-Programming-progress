package ifelseofjava;
import java.util.Scanner;
public class areaperimeter {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("the length of a rectangle is :");
        double l=sc.nextInt();
        System.out.println("the breadth of a rectangle is: ");
        double b=sc.nextInt();
      
        double a=l*b;
        System.out.println("the area of a rectangle is : "+a);
      
        double p=2*(l+b);
        System.out.println("the perimeter of a rectangle is: "+p);
        if(a>p){
            System.out.println("area is greater than pereimeter");
        }
       else if(p>a){
        System.out.println("perimeter is greater than area");
       }
        else{
            System.out.println("the given quadrilateral is square");
        }
    }
}
