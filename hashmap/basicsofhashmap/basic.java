package hashmap.basicsofhashmap;
import java.util.*;
public class basic {
    public static void main(String[] args) {
        Map<String,Integer> map = new HashMap<>();
        map.put("Rohit", 96);
        map.put("Aman", 97);
        map.put("Aditya", 98);
        map.put("Akshay", 99);
        map.put("Sheshank", 100);
        System.out.println(map.get("Rohit"));
        map.remove("Sheshank");
        System.out.println(map.containsKey("Yash"));
        System.out.println(map.containsKey("Rohit"));
        System.out.println(map.keySet());
        System.out.println(map.values());
        System.out.println(map.entrySet());
        map.putIfAbsent("Rohit",500 );
        map.putIfAbsent("Sheshank", 45);
        for(var e: map.entrySet()){
            System.out.printf("The student name is %s and his marks is %d",e.getKey(),e.getValue());
            System.out.println();
        }
        
    }
}
