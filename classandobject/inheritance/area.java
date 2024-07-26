package classandobject.inheritance;

import java.util.Scanner;

class Circledata {
    double radius;
    double pie = 3.14;

    public double getr() {
        return radius;
    }

    public void setr(double radius) {
        this.radius = radius;
    }

}

class Circlearea extends Circledata {

    public double getarea(double radius) {
        double area = radius * radius * pie;
        return area;
    }

}

public class area {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the radius of circle");
        double radius = sc.nextDouble();
        Circlearea c = new Circlearea();

        System.out.println("the area of the circle is " + c.getarea(radius));
    }
}
