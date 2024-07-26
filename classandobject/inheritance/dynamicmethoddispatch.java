package classandobject.inheritance;
class phone{
    public void showtime(){
        System.out.println("time is 8 am");
    }
    public void on(){
        System.out.println("Phone is witching on...");
    }
}
class smartphone extends phone{
    public void music(){
        System.out.println("music is playing....");
    }
    public void on(){
        System.out.println("smartphone is on...");
    }
}
public class dynamicmethoddispatch {
    public static void main(String[] args) {
        phone a=new smartphone();
        a.on();
        a.showtime();
        // a.music(); it is not allowed

    }
}
