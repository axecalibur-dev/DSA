class Solution {
    public static class Node {
        int key;
        Node left;
        Node right;

        Node(int k) {
            this.key = k;
            left = null;
            right = null;
        }
    }

    public static void main(String args[]) {
        Node root = new Node(10);
        root.left = new Node(20);
        root.right = new Node(30);
        root.right.left = new Node(40);
        root.right.right = new Node(50);
        traversal(root);
    }

    public static void traversal(Node root) {
        if (root != null) {
            System.out.println(root.key);
            traversal(root.left);
            traversal(root.right);
        }
    }

}