import java.util.Scanner;

public class areaofcircle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("the radius of circle is: ");

        int r=sc.nextInt();
       
        double pie =3.14;
        double area=pie*r*r;
        System.out.println("the are of circle is:");
        System.out.println(area);
    }
    
}
