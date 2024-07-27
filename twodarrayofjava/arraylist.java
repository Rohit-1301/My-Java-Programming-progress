package twodarrayofjava;
import java.util.ArrayList;
public class arraylist {
    public static void main(String[] args) {
        Integer i=Integer.valueOf(4);
        System.out.println(i);
        Float f=Float.valueOf(4.5f);
        System.out.println(f);
        ArrayList<Integer> a=new ArrayList<>();
       a.add(2);
       a.add(90);
       a.add(29);
       a.add(987);
       System.out.println(a.get(0));
       System.out.println(a.size());
       //printing array using loops
        for(int j=0;j<a.size();j++){
            System.out.print(a.get(j)+" ");
        }
        //printing array without using loops
        System.out.println(a);

        //adding element at any index
        a.add(1,200);
        System.out.println(a);
        System.out.println(a.size());

        //modifying an array
        a.set(0, 56);
        System.out.println(a);

        //removing element at any index 
        a.remove(0);
        System.out.println(a);

        //removing element in an array using value
        a.remove(Integer.valueOf(200));
        System.out.println(a);

        //checking existence of any elemment
        boolean ans=a.contains(Integer.valueOf(200));
        System.out.println(ans);

        //if we don't specify anything in class then we can add anything
        ArrayList b=new ArrayList();
        b.add("progress");
        b.add(100);
        b.add(true);
        System.out.println(b);

        //use of lastindex and index methods
        a.lastIndexOf(200);
        a.indexOf(20);
        System.out.println(a.lastIndexOf(200));
        System.out.println(a.indexOf(29));

    }
}
