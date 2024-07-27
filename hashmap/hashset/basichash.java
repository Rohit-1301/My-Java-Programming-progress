package hashmap.hashset;
import java.util.*;
public class basichash {
    public static void main(String[] args) {
        HashSet<String> st = new HashSet<>();
        st.add("Rohit Gupta");
        st.add("Aman SInhgh");
        st.add("Aditya Singh");
        st.add("Akshay Maniiyamparra");
        st.add("Sheshank SIngh");
        System.out.println(st);
        System.out.println(st.contains("Akshay Maniiyamparra"));
        System.out.println(st.size());
        st.remove("Sheshank SIngh");
        System.out.println(st.contains(st.contains("Sheshank SIngh")));
        System.out.println(st);
        System.out.println(st.size());
        for(String s: st){
            System.out.println(s);  
        }
    }
}
