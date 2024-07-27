package triedatastructure.basicsoftrie;

import java.util.*;

public class classroom {
    static class Node {
        Node[] children;
        boolean endofword;

        public Node() {
            children = new Node[26];
            for (int i = 0; i < 26; i++) {
                children[i] = null;
            }
            endofword = false;
        }
    }

    static Node root = new Node();

    public static void insert(String word) {
        Node curr = root;
        for (int i = 0; i < word.length(); i++) {
            int idx = word.charAt(i) - 'a';
            if (curr.children[idx] == null) {
                curr.children[idx] = new Node();
            }
            if (idx == word.length() - 1) {
                curr.children[idx].endofword = true;
            }
            curr = curr.children[idx];
        }
    }

    public static boolean search(String key) {
        Node curr = root;
        for (int i = 0; i < key.length(); i++) {
            int idx = key.charAt(i) - 'a';
            if (curr.children[idx] == null) {
                return false;
            }
            if (i == key.length() - 1 && curr.children[idx].endofword == false) {
                return false;
            }
            curr = curr.children[idx];
        }
        return true;
    }

    public static boolean wordbreak(String key) {
        if (key.length() == 0) {
            return true;
        }
        for (int i = 1; i <= key.length(); i++) {
            String partone = key.substring(0, i);
            String parttwo = key.substring(i);
            if (search(partone) && wordbreak(parttwo)) {
                return true;
            }
        }
        return false;
    }
        public static boolean prefix(String prefix){
            Node curr=root;
            for(int i=0;i<prefix.length();i++){
                int idx=prefix.charAt(i)-'a';
                if(curr.children[idx]==null){
                    return false;
                }
                
                curr=curr.children[idx];
            }
            return true;
        }
    public static void main(String[] args) {

        String word[] = { "i", "like", "sam", "samsung", "mobile" };
        String key = "ilikesamsung";
        for (int i = 0; i < word.length; i++) {
            insert(word[i]);
        }
        System.out.println(wordbreak(key));
        // String classes[]={"apple","app","apply","woman","man"};
        // for (int i = 0; i < classes.length; i++) {
        //     insert(classes[i]);
        // }
        // String prefix="man";
        // System.out.println(prefix(prefix));
        // Scanner sc = new Scanner(System.in);
        // System.out.println("enter the word u want to search in a trie");

        // // if(search(key)){
        // // System.out.println("the given key is found");
        // // }
        // // else{
        // // System.out.println("the given key is not found");
        // // }

    }
}
