package classandobject;

public class stu {

    String name;
    private int rollno;
    double marks;
    private static int numberofstudents;

    public stu(String name, int rollno, double marks) {
        this.name = name;
        this.rollno = rollno;
        this.marks = marks;
    }

    public static int getnumberofstudents() {
        return numberofstudents;
    }

    public int getrollno() {
        return rollno;
    }

    public void setrollno(int rollno) {
        this.rollno = rollno;
    }
}
