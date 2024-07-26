package binarytree.basicsofbinarytree;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;
public class levelorder{
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

    

    public static void main(String[] args) {
        int node[] = { 1, 2, 4, -1, -1, 5, -1, 3, -1, 6, -1, -1 };
        binarytree tree = new binarytree();
        Node root = tree.buildtree(node);
        System.out.println("the level order of the binary tree is: ");
        levelorder(root);
    }
}
