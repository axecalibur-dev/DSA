class Solution {
    public static class Node {
        int data;
        Node left;
        Node right;

        Node(int d) {
            this.data = d;
            left = null;
            right = null;
        }
    }

    public static boolean printAncestors(Node root, int node) {
        if (root == null) {
            return false;
        }

        if (root.data == node) {
            return true;
        }

        if (printAncestors(root.left, node) || printAncestors(root.right, node)) {
            System.out.println(root.data);
            return true;
        }

        return false;
    }

    public static void main(String[] args) {
        Node root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(3);
        root.left.left = new Node(4);
        root.left.right = new Node(5);
        root.left.left.left = new Node(7);

        printAncestors(root, 7);
    }
}