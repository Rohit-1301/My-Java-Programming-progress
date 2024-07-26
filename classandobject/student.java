
package classandobject;

import java.util.*;

public class student {
    public static class Student {
        String name;
        int rollno;
        double marks;

    }
    static int newrn(Student x){
        return x.rollno+5;
    }

    public static void main(String[] args) {
        Student x = new Student();
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the name of the student");
        x.name = sc.nextLine();
        System.out.println("enter the rollno of the student");
        x.rollno = sc.nextInt();
        System.out.println("enter the marks of the student");
        x.marks = sc.nextDouble();
        System.out.println("the name of the student is " + x.name + " Roll no. of the student is  " + x.rollno
                + " The marks secured by the student is " + x.marks);
                System.out.println("the new roll no of the student is "+newrn(x));
    }
}
//note we have to declare class before the main function and we have to declare the object of the class in the main dunction
//it is very important to declare the object of the class before the main function as if we pass object to function
//if it is decalred in the main function it will throw an error
//classes are passed by reference
// default value of string in class is null , int is 0 , double is 0.0