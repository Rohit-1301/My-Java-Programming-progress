package twodarrayofjava;

import java.util.ArrayList;
import java.util.Collections;

public class stringreverse {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<String>();
        list.add("Hello");
        list.add("World");
        list.add("Java");
        list.add("Programming");
        list.add("My ");
        list.add("Name");
        list.add("Is");
        list.add("Rohit");
        list.add("Gupta");
        System.out.println("the array of the given list in ascending order is: ");
        Collections.sort(list);
        System.out.println(list);
        System.out.println("the decending oreder of the string is: ");
        Collections.sort(list,Collections.reverseOrder());
        System.out.println(list);
    }
}
