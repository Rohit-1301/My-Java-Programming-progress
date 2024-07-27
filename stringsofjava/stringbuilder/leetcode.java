package stringsofjava.stringbuilder;

public class leetcode {
    public static void main(String[] args) {
        String str="aaabbbbccdddeeee";
        System.out.println(str);
        String strans="a";
        int count=1;
       for(int i=1;i<str.length();i++) {
        
        char current=str.charAt(i);
        char prev=str.charAt(i-1);
        if(current==prev) {
            count++;
        }
        else{
            strans+=count;
            count=1;
            strans+=current;
        }
    }
    strans+=count;
    System.out.println(strans);
}
}