package classandobject.inheritance;

import java.util.Scanner;

class Studentsdata {
    String studentname;

    String month;
    int date;
    int year;

    public Studentsdata(String studentname, String month, int date, int year) {
        this.studentname = studentname;
        this.month = month;
        this.date = date;

        this.year = year;
    }

    public String getstudentname() {
        return studentname;
    }

    public int getdate() {
        return date;
    }

    public String getmonth() {
        return month;
    }

    public int getyear() {
        return year;
    }

}

class tenth extends Studentsdata {
    int tenthmarks;

    public tenth(String studentname, int date, String month, int year, int tenthmarks) {
        super(studentname, month, date, year);
        this.tenthmarks = tenthmarks;
    }

    public int gettenthmarks() {
        return tenthmarks;
    }
}

class twelth extends Studentsdata {
    int twelthmarks;

    public twelth(String studentname, int date, String month, int year, int twelthmarks) {
        super(studentname, month, date, year);
        this.twelthmarks = twelthmarks;
    }

    public int gettwelthmarks() {
        return twelthmarks;
    }
}

class graduation extends Studentsdata {
    int graduationmarks;

    public graduation(String studentname, int date, String month, int year, int graduationmarks) {
        super(studentname, month, date, year);
        this.graduationmarks = graduationmarks;
    }

    public int getgraduationmarks() {
        return graduationmarks;
    }
}

public class Students {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the name of the student");
        String studentname = sc.nextLine();
        System.out.println("enter the date of birth");
        int date = sc.nextInt();
        String month = sc.nextLine();
        
        int year = sc.nextInt();
        System.out.println("enter the marks of the student in tenth grade");
        int tenthmarks = sc.nextInt();
        System.out.println("enter the marks of the student in twelth grade");
        int twelthmarks = sc.nextInt();
        System.out.println("enter the marks of the student in graduation");
        int graduationmarks = sc.nextInt();
        tenth t = new tenth(studentname, date, month, year, tenthmarks);
        twelth t1 = new twelth(studentname, date, month, year, twelthmarks);
        graduation t2 = new graduation(studentname, date, month, year, graduationmarks);
        System.out.println("Studentsname: " + t.getstudentname() + " Students date of birth " + t.getdate() + "-"
                + t.getmonth() + " " + t.getyear() + " Students scored marks in tenth grade " + t.gettenthmarks());
        System.out.println("Studentsname: " + t.getstudentname() + " Students date of birth " + t.getdate() + "-"
                + t.getmonth() + " " + t.getyear() + " Students scored marks in twelth grade " + t1.gettwelthmarks());
        System.out.println("Studentsname: " + t.getstudentname() + " Students date of birth " + t.getdate() + "-"
                + t.getmonth() + " " + t.getyear() + " Students scored marks in graduation " + t2.getgraduationmarks());

    }
}
