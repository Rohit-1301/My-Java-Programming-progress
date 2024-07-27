package twodarrayofjava;

import java.util.ArrayList;
import java.util.Collections;

public class reversearraylist {
    static void reversearray(ArrayList<Integer> list){
        int i=0;
        int j=list.size()-1;
        while (i<j) {
            int temp=list.get(i);
            list.set(i,list.get(j));
            list.set(j,temp);
            i++;
            j--;
            
        }
    }
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<Integer>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(5);
        list.add(7);
        list.add(11);
        list.add(13);
        list.add(17);  
        System.out.println("the array of the given list is:");
        System.out.println(list);
        //reversing the array usiing methods
        //  System.out.println("the reverse of the array is:");
        //  reversearray(list);
        //  System.out.println(list);

         //reversing the arraylist using collection importing
         Collections.reverse(list);
         System.out.println(list);

         //ascending the array list and descending the array list
        System.out.println("ascending the array");
        Collections.sort(list);
        System.out.println(list);
        System.out.println("descending the array");
        Collections.sort(list,Collections.reverseOrder());
        System.out.println(list);
    }
}
