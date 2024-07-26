package classandobject;

public class constructor {
    public static void main(String[] args) {
        System.out.println(stu.getnumberofstudents());
        stu s1 = new stu("Rohit", 96, 96.56);
        stu s2 = new stu("Aditya", 98, 91.56);
        System.out.println(s1.getnumberofstudents());
        System.out.println(s2.getnumberofstudents());
        // final keyword is the most important keyword which is used to not change any
        // particular value even any function is try to override it
        //static keyword is a global variable if we use this in a class then we can count how many no. of classes are formed eg;- is given below
        
    }
}