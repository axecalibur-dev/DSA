import javax.xml.crypto.dsig.keyinfo.RetrievalMethod;

class Solution {
    public static class Node {
        int data;
        Node left;
        Node right;

        Node(int data) {
            this.data = data;
            left = null;
            right = null;
        }
    }

    public static Node findMinimum(Node root, int data) {
        if (root == null) {
            root = new Node(data);
            return root;
        }

        if (data < root.data) {
            root.left = findMinimum(root.left, data);
        } else if (data > root.data) {
            root.right = findMinimum(root.right, data);
        }

        return root;

    }

    public static void traverse(Node root) {
        if (root != null) {
            System.out.println(root.data);
            traverse(root.left);
            traverse(root.right);
        }

    }

    public static void main(String[] args) {
        Node root = new Node(10);
        root.left = new Node(6);
        root.right = new Node(16);
        root.left.left = new Node(4);
        root.left.right = new Node(9);
        root.left.right.left = new Node(7);
        root.right.left = new Node(13);

        traverse(root);

    }
}