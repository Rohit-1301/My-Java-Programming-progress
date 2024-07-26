package classandobject.multithreading;

class myThread extends Thread{
    @Override
    public void run(){
        System.out.println("I am running thread 1");
        System.out.println("It doesn't have any error");
    }
}

class mythread2 extends Thread{
    @Override
    public void run(){
        System.out.println("I am running thread 2");
        System.out.println("It doesn't have any error I think so");
    }
}

public class usingthread {
    public static void main(String[] args) {
        myThread t1 = new myThread();
        mythread2 t2 = new mythread2();
        t1.start();
        t2.start();
    }
}