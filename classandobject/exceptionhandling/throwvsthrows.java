package classandobject.exceptionhandling;
import java.util.*;
class Negativeradiusexception extends Exception{

    @Override
    public String toString() {
        return "Radius cannot be negative";
    }
    @Override
    public String getMessage() {
        return "Radius cannot be negative";
    }
}
public class throwvsthrows {
    public static double areaofcircle(double r) throws Negativeradiusexception{
        if(r<0){
            throw new Negativeradiusexception();
        }
        double pie=3.14;
        double area=pie*r*r;
        return area;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        try{
            System.out.println("enter the radius of the circle");
            double r=sc.nextDouble();
            System.out.println(areaofcircle(r));

        }
        catch(Negativeradiusexception e){
            System.out.println(e.getMessage());
    }
}
}