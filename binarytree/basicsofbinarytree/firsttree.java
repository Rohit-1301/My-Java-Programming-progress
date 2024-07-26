package binarytree.basicsofbinarytree;

public class firsttree {
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
        System.out.println(root.data);
        if (root == null)
            return;
        preorder(root.left);
        preorder(root.right);
    }

    public static void main(String[] args) {
        int node[] = { 1, 2, 4, -1, -1, 5, -1, 3, -1, 6,-1,-1 };
        binarytree tree = new binarytree();
        Node root = tree.buildtree(node);
        System.out.println("the root of the binary tree is : " + root.data);

    }
}
