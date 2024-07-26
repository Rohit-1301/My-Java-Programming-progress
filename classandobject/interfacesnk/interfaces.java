package classandobject.interfacesnk;

import java.util.Scanner;

interface bicycle{
    int a=45;
    void applybreak(int decrement);
    void speedup(int increment);
}
class herocycle implements bicycle{
    public void applybreak(int decrement){
        System.out.println("applying break");
    }
    public void speedup(int increment){
        System.out.println("speeding up");
    }
}
public class interfaces {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        herocycle h=new herocycle();
        h.applybreak(1);
        h.speedup(2);
        System.out.println(bicycle.a);
        //in interface we can't change the value of any properties as they are final variable
    }
}
