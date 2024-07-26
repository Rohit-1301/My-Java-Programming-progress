package classandobject.exceptionhandling;

import java.util.*;

class myexception extends Exception {
    @Override
    public String toString() {

        return super.toString();
    }

    @Override
    public String getMessage() {
        return super.getMessage() + " I am a custom exception";
    }
}

public class exceptionclass {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        if (a < 99) {
            try {
                throw new myexception();
            } catch (Exception e) {
                System.out.println(e.getMessage());
                System.out.println(e.toString());
                System.out.println(e);
                e.printStackTrace();
            }
        }
        System.out.println("thank you");
    }
}
