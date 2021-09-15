import java.util.*;

class Solution {
    public static class Node {
        int data;
        Node left;
        Node right;

        Node(int d) {
            this.data = d;
            right = null;
            left = null;
        }
    }

    static int diameter = 0;

    public static int traversal(Node root) {
        if (root == null) {
            return 0;
        }

        int leftHeight = traversal(root.left);
        int rightHeight = traversal(root.right);
        diameter = Math.max(diameter, 1 + leftHeight + rightHeight);

        return 1 + Math.max(leftHeight, rightHeight);
    }

    public static void main(String[] args) {
        Node root = new Node(10);
        root.left = new Node(20);
        root.right = new Node(30);
        root.right.left = new Node(40);
        root.right.right = new Node(60);
        root.right.left.left = new Node(50);
        root.right.right.right = new Node(70);
        traversal(root);
        System.out.println("DIA" + diameter);
    }
}