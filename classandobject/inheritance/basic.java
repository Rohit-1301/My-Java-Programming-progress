package classandobject.inheritance;

class base {
    int x;

    public int setx(int x) {
        return x;
    }

    public int getx() {
        System.out.println("i am in base class and returning x");
        return x;
    }
}

class derived extends base {
    int y;

    public int sety(int y) {
        return y;
    }

    public int gety() {
        System.out.println("i am in derived class and returning y");
        return y;
    }
}

public class basic {
    public static void main(String[] args) {
        base b = new base();
        derived d = new derived();
        b.x = 10;
        d.x = 20;
        d.y = 30;
        System.out.println(b.getx());
        System.out.println(d.getx());
        System.out.println(d.gety());
    }
}
