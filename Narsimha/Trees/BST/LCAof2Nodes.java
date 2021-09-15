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

    public static Node insertRec(Node root, int key) {
        if (root == null) {
            root = new Node(key);

            return root;
        }

        if (key < root.data) {
            root.left = insertRec(root.left, key);
        }

        else if (key > root.data) {
            root.right = insertRec(root.right, key);
        }

        return root;
    }

    public static void preorder(Node root) {
        if (root != null) {
            System.out.println(root.data);
            preorder(root.left);
            preorder(root.right);
        }
    }

    public static void main(String[] args) {
        Node root = new Node(4);
        insertRec(root, 2);
        insertRec(root, 8);
        insertRec(root, 5);
        insertRec(root, 1);
        insertRec(root, 7);
        insertRec(root, 6);

        preorder(root);
    }
}