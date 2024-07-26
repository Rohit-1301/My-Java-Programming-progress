package classandobject.interfacesnk;
abstract class parent{
    abstract public void greet();
}
class child extends parent{
    public void greet(){
        System.out.println("hello");
    }
}
    abstract class child3 extends parent{
    public void th(){
        System.out.println("hello");
    }
}
public class abstractclass {
    public static void main(String[] args) {
        child c=new child();
        c.greet();
       
    }
    

}
