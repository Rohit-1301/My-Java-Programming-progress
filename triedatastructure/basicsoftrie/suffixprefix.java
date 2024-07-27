package triedatastructure.basicsoftrie;

import java.util.*;

import stringsofjava.substring;

public class suffixprefix {
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

    public static int countnodes(Node root) {
        int count = 0;
        if (root == null) {
            return 0;
        }
        for (int i = 0; i < 26; i++) {
            if (root.children[i] != null) {
                count += countnodes(root.children[i]);
            }
        }
        return count + 1;
    }

    public static String ans = "";

    public static void longestprefix(Node root, StringBuilder sb) {
        if (root == null) {
            return;
        }

        for (int i = 0; i < 26; i++) {
            if (root.children[i] != null && root.children[i].endofword == true) {
                sb.append((char) (i + 'a'));
                if (sb.length() > ans.length()) {
                    ans = sb.toString();
                }
                longestprefix(root.children[i], sb);
                sb.deleteCharAt(sb.length() - 1);
            }
        }
    }

    public static void main(String[] args) {
        String standard[] = { "a",  "banana", "app","ap", "appl", "apply" };
        for (int i = 0; i < standard.length; i++) {
            insert(standard[i]);
        }
        // System.out.println("the no. of substrings form by given string is:
        // "+countnodes(root));
        // String standard[]={"a","ap","banana","app","appl","apply","apple"};
        // for(int i=0;i<standard.length;i++){
        // insert(standard[i]);
        // }
        longestprefix(root, new StringBuilder(""));
        System.out.println("the longest prefix is: " + ans);
    }
}
