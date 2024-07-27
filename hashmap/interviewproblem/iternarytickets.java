package hashmap.interviewproblem;
import java.util.*;
public class iternarytickets {
    public static String getstart(HashMap<String,String> ticket){
        HashMap<String,String> rev=new HashMap<>();
        for(String e:ticket.keySet()){
            rev.put(ticket.get(e),e);
        }
        for(String e:ticket.keySet()){
            if(!rev.containsKey(e)){
                return e;
            }
        }
        return null;
    }
    public static void main(String[] args) {
       HashMap<String,String> ticket=new HashMap<>();
       ticket.put("Chennai","Banglore");
       ticket.put("Delhi","Chennai");
       ticket.put("Mumbai","Delhi");
       ticket.put("Kolkata","Mumbai");
       String start=getstart(ticket);
      while(ticket.containsKey(start)){
          System.out.print(start+"-> ");
          start=ticket.get(start);
      }
        System.out.print(start);

    }
}
