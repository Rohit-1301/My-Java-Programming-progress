package binarytree.binarysearchtree;
import java.util.*;
public class firstbinary {
    static class Node{
        int data;
        Node left;
        Node right;
        public Node(int data){
            this.data=data;
            this.left=null;
            this.right=null;
        }
    }
    public static Node insert(Node root,int data){
        if(root==null){
            root=new Node(data);
            return root;
        }
        if(data<root.data){
            root.left=insert(root.left,data);
        }
        else{
            root.right=insert(root.right,data);
        }
        return root;
        }
        public static void inorder(Node root){
            if(root==null){
                return;
            }
            inorder(root.left);
            System.out.print(root.data+" ");
            inorder(root.right);
        }
        public static boolean search(Node root,int key){
            if(root==null){
                return false;
            }
            if(root.data==key){
                return true;
            }
            if(key<root.data){
                return search(root.left,key);
            }
            else{
                return search(root.right,key);
            }
            
        }
        public static Node delete(Node root,int key){
            if(root==null){
                return null;
            }
            if(key<root.data){
                root.left=delete(root.left,key);
            }
            else if(key>root.data){
                root.right=delete(root.right,key);
            }
            else{
                if(root.left==null){
                    return root.right;
                }
                else if(root.right==null){
                    return root.left;
                }
                Node temp=minvalue(root.right);
                root.data=temp.data;
                root.right=delete(root.right,temp.data);
            }
            return root;
        }
        public static Node minvalue(Node root){
            
            while(root.left!=null){
                
                root=root.left;
            }
            return root;
        }
        public static void printrange(Node root,int k1,int k2){
            if(root==null){
                return;
            }
           if(k1<=root.data && k2>=root.data){
                printrange(root.left,k1,k2);
                System.out.print(root.data+" ");
                printrange(root.right,k1,k2);
              
            }
            else if(k1<=root.data){
                printrange(root.left,k1,k2);
            }
            else{
                printrange(root.right,k1,k2);
            }
        }
        public static void path(ArrayList<Integer> path){
            for(int i=0;i<path.size();i++){
                System.out.print(path.get(i)+" ");
            }
            System.out.println();
        }
        public static void roottoleaf(Node root,ArrayList<Integer> path){
            if(root==null){
                return;
            }
            path.add(root.data);
            if(root.left==null && root.right==null){
                path(path);
            }
            roottoleaf(root.left,path);
            roottoleaf(root.right,path);
            path.remove(path.size()-1);
        }
    public static void main(String[] args) {
        int values[]={5,1,3,4,2,7};
        Node root=null;
        for(int i=0;i<values.length;i++){
            root=insert(root,values[i]);
        }
        System.out.println("enter the length of an array u want ");
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int a[]=new int[n];
        for(int i=0;i<n;i++){
            a[i]=sc.nextInt();  
        }
        Node roots=null;
        for(int i=0;i<n;i++){
            roots=insert(roots,a[i]);
        }
        System.out.println("the inorder trraversal of a binary search tree is : ");
        inorder(root);
        System.out.println();
        System.out.println("the inorder trraversal of a binary search tree is : ");
        System.out.println();
        inorder(roots);
        System.out.println();
        System.out.println("enter the key u want to search in a binary search tree");
        int key=sc.nextInt();
        if(search(roots,key)==true){
            System.out.println("the given key is found");
        }
        else{
            System.out.println("the given key is not found");
    }
    System.out.println("enter the key u want to delete in a binary search tree");
    int key1=sc.nextInt();
    delete(roots,key1);
    System.out.println("the inorder trraversal of a binary search tree is : ");
    inorder(roots);
    System.out.println();
    System.out.println("enter the range u want to print in a binary search tree");
   
    printrange(roots,0,9);
    System.out.println();
    System.out.println("the root to leaf path of a binary search tree is : ");
    ArrayList<Integer> path=new ArrayList<>();
    roottoleaf(roots,path);
}
}