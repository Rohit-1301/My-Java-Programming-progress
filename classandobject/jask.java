package classandobject;

import java.util.Scanner;

class Studentsg {
    private String name;
    private int rollno;
    private double marks;

    public int setrollno(int rollno) {
        return rollno;
    }

    public String setname(String name) {
        return name;
    }

    public double setmarks(double marks) {
        return marks;
    }

    public String getname() {
        return name;
    }

    public int getrollno() {
        return rollno;
    }

    public double getmarks() {
        return marks;
    }
    public Studentsg(String name,int rollno,double marks){
        this.name=name;
        this.rollno=rollno;
        this.marks=marks;
    }
    public Studentsg() {
    }
}

public class jask {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String name;
        int rollno;
        double marks;
        Studentsg s = new Studentsg("Rohit Gupta",96,97.336);

        
        System.out.println("the name of the student is " + s.getname() + " Roll no. of the student is " + s.getrollno()
                + " The marks secured by the student is " + s.getmarks());

    }
}
