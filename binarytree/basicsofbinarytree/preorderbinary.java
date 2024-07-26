package binarytree.basicsofbinarytree;

import java.util.LinkedList;
import java.util.Queue;

public class preorderbinary {
    static class Node {
        int data;
        Node left;
        Node right;

        public Node(int data) {
            this.data = data;
            this.left = null;
            this.right = null;
        }
    }

    static class binarytree {
        static int idx = -1;

        public static Node buildtree(int node[]) {
            idx++;
            if (node[idx] == -1) {
                return null;
            }
            Node newNode = new Node(node[idx]);
            newNode.left = buildtree(node);
            newNode.right = buildtree(node);
            return newNode;
        }

    }

    public static void preorder(Node root) {

        if (root == null) {
            return;
        }
        System.out.print(root.data+" ");
        preorder(root.left);
        preorder(root.right);
    }
    public static void inorder(Node root) {
        if (root == null) {
            return;
        }
        inorder(root.left);
        System.out.print(root.data+" ");
        inorder(root.right);
    }
    public static void postorder(Node root){
        if (root == null) {
            return;
        }
        postorder(root.left);
        postorder(root.right);
        System.out.print(root.data+" ");
        
    }
    public static void levelorder(Node root) {
        if (root == null)
            return;
        Queue<Node> q = new LinkedList<>();
        q.add(root);
        q.add(null);
        while (!q.isEmpty()) {
            Node curr = q.remove();
            if (curr == null) {
                System.out.println();
                if (!q.isEmpty()) {
                    q.add(null);
                } else {
                    break;
                }
            } else {
                System.out.print(curr.data + " ");
                if (curr.left != null) {
                    q.add(curr.left);
                }
                if (curr.right != null) {
                    q.add(curr.right);
                }
            }

        }
    }
        public static int countnodes(Node root){
            if(root == null){
                return 0;
            }
            int left = countnodes(root.left);
            int right = countnodes(root.right);
            return left+right+1;
        }
        public static int sumofnodes(Node root){
            if(root == null){
                return 0;
            }
            int left = sumofnodes(root.left);
            int right = sumofnodes(root.right);
            return left+right+root.data;
        }
        public static int height(Node root){
            if(root == null){
                return 0;
            }
            int left = height(root.left);
            int right = height(root.right);
            return Math.max(left,right)+1;
        }
        public static int diameter(Node root){//it's time complexity is O(n^2)
            if(root == null){
                return 0;
            }
            int left = height(root.left);
            int right = height(root.right);
            int leftdiameter = diameter(root.left);
            int rightdiameter = diameter(root.right);
            return Math.max(left+right+1,Math.max(leftdiameter,rightdiameter));
        }
        //now we  are using another approach to find max diameter of the tree by O(n) time complexity
        public static class TreeInfo{
            int height;
            int diameter;
            public TreeInfo(int height,int diameter){
                this.height = height;
                this.diameter = diameter;
            }
        }
        public static TreeInfo diameterOptimised(Node root){
            if(root==null) {
                return new TreeInfo(0,0);
            }
            TreeInfo left = diameterOptimised(root.left);
            TreeInfo right = diameterOptimised(root.right);
            int myheight= Math.max(left.height,right.height)+1;
            int ld = left.diameter;
            int rh=right.diameter;
            int rd = left.height+right.height+1;
            int diameter = Math.max(Math.max(ld,rh),rd);
            TreeInfo myInfo= new TreeInfo(myheight,diameter);
            return myInfo;
        }
    public static void main(String[] args) {
        int node[] = { 1, 2, 4, -1, -1, 5, -1, -1, 3, -1, 6, -1, -1 };
        binarytree tree = new binarytree();
        Node root = tree.buildtree(node);
        System.out.println("the root of the binary tree is : " + root.data);
        System.out.println("the preorder traversal of the binary tree is : ");
        preorder(root);
        System.out.println();
        System.out.println("the inorder traversal of the binary tree is : ");
        inorder(root);
        System.out.println();
        System.out.println("the postorder traversal of the binary tree is : ");
        postorder(root);
        System.out.println();
        System.out.println("the level order of the binary tree is: ");
        levelorder(root);
        System.out.println("the number of nodes in the binary tree is : "+countnodes(root));
        System.out.println("the sum of nodes in the binary tree is : "+sumofnodes(root));
        System.out.println("the height of the binary tree is : "+height(root));
        System.out.println("the diameter of the binary tree is : "+diameter(root));
        System.out.println("the max diameter of the binary tree is : "+diameterOptimised(root).diameter);
    }
}
