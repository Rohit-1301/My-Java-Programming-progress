package hashmap.hashmapimplementation;

import java.util.LinkedList;
import java.util.HashMap;

public class hashing {
    static class Myhashmap<K, V> {
        public static final int defaultsize = 4;
        public static final float loadfactor = 0.75f;

        private class Node {
            K key;
            V value;

            Node(K key, V value) {
                this.key = key;
                this.value = value;
            }
        }

        private int n;
        private LinkedList<Node>[] bucket;

        private void initbuckets(int N) {
            bucket = new LinkedList[N];
            for (int i = 0; i < N; i++) {
                bucket[i] = new LinkedList<>();
            }
        }

        public Myhashmap() {
            initbuckets(defaultsize);
        }

        private int hashfun(K key) {
            int hc = key.hashCode();
            return (Math.abs(hc)) % bucket.length;
        }

        private int searchinbucket(LinkedList<Node> bucket, K key) {
            for (int i = 0; i < bucket.size(); i++) {
                if (bucket.get(i).key == key) {
                    return i;
                }
            }
            return -1;
        }

        private void rehash() {
            LinkedList<Node>[] oldbucket = bucket;
            initbuckets(oldbucket.length * 2);
            n=0;
            for(var bucket: oldbucket){
                for(var node:bucket){
                    put(node.key, node.value);
                }
            }
        }
        public int size() {
            return n;
        }

        public void put(K key, V value) {
            int bi = hashfun(key);
            LinkedList<Node> searchnode = bucket[bi];
            int search = searchinbucket(searchnode, key);
            if (search == -1) {
                Node node = new Node(key, value);
                searchnode.add(node);
                n++;
            } else {
                Node currnode = new Node(key, value);
                currnode.value = value;
            }
            if(n>=bucket.length*loadfactor){
                rehash();
            }

        }

        public V get(K key) {
            int bi = hashfun(key);
            LinkedList<Node> searchnode = bucket[bi];
            int search = searchinbucket(searchnode, key);
            if (search != -1) {
                return searchnode.get(search).value;
            } else {
                return null;
            }
        }

        public V remove(K key) {
            int bi = hashfun(key);
            LinkedList<Node> searchnode = bucket[bi];
            int search = searchinbucket(searchnode, key);
            if (search != -1) {
                Node currnode = searchnode.get(search);
                V value = currnode.value;
                searchnode.remove(currnode);
                n--;
                return value;
            }
            return null;
        }
        public int capacity(){
            return bucket.length;
        }

        public float loadfactor(){
            return (n*1.0f/bucket.length);  
        }

    }

    public static void main(String[] args) {
        Myhashmap<String, Integer> map = new Myhashmap<>();
        System.out.println("putting an elemnt in a hashmap");
        map.put("Rohit", 96);
        map.put("Aman", 97);
        map.put("Aditya", 98);
        map.put("Akshay", 99);
        map.put("Sheshank", 100);
        System.out.println("the size of the hashmap is: " + map.size());
        System.out.println("the value of the key Aditya is: " + map.get("Aditya"));
        System.out.println("the value of the key Sheshank is: " + map.get("Sheshank"));
        System.out.println("the value of the key Rohit is: " + map.get("Rohit"));
        System.out.println("removing the elemnt from the hashmap");
        System.out.println(map.remove("Akshay"));
        System.out.println("the value of the key Aditya is: " + map.get("Aditya"));
        System.out.println("the size of the hashmap is: " + map.size());
        System.out.println("the capacity of the hashmap is: " + map.capacity());
        System.out.println("the load factor of the hashmap is: " + map.loadfactor());
    }
}
