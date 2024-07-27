package hashmap.interviewproblem;
import java.util.*;
public class anagram {
    public static boolean isanagram(String str1,String str2){
        if(str1.length()!=str2.length()){
            return false;
        }
        else{
            HashMap<Character,Integer> map1=getmap(str1);
            HashMap<Character,Integer> map2=getmap(str2);
            return map1.equals(map2);
        }
       
    }
    static HashMap<Character,Integer> getmap(String str){
        HashMap<Character,Integer> map=new HashMap<>();
        for(int i=0;i<str.length();i++){
            char ch=str.charAt(i);
            if(map.containsKey(ch)){
                map.put(ch,map.get(ch)+1);
            }
            else{
                map.put(ch,1);
            }
        }
        return map;
    }
    public static void main(String[] args) {
      Scanner sc=new Scanner(System.in);
      System.out.println("Enter the first string");
      String str1=sc.nextLine();
      System.out.println("Enter the second string");
      String str2=sc.nextLine();
      if(isanagram(str1,str2)){
          System.out.println("they are anagrams");
      } 
      else{
          System.out.println("they are not anagrams");
      }
    }
}

