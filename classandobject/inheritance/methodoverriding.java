package classandobject.inheritance;
class A{
    public int a;
    public int seta(int a){
        return a;
    }
    public int geta(){
        return a;
    }
 
    public void m(){
        System.out.println("hello");
    }
    
}
class b extends A{
    public int b;
    public int setb(int b){
        return b;
    }
    public int getb(){
        return b;
    }
    @Override
    public void m(){
        System.out.println("bello");
    }
}
public class methodoverriding {
    
    public static void main(String[] args) {
        A a=new A();
        b b=new b();
        a.m();
        b.m();
    }
}
