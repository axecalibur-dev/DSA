import java.lang.instrument.UnmodifiableClassException;

import javax.swing.plaf.basic.BasicInternalFrameTitlePane.SystemMenuBar;

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

    public static int prev = Integer.MIN_VALUE;

    public static boolean checkBST(Node root) {
        if (root == null) {
            return true;
        }

        if (!checkBST(root.left)) {
            return false;
        }

        if (root.data < prev) {
            return false;
        }

        prev = root.data;

        return checkBST(root.right);

    }

    public static void main(String[] args) {
        Node root = new Node(6);
        root.left = new Node(2);
        root.right = new Node(8);
        root.left.left = new Node(1);
        root.left.right = new Node(9);

        if (checkBST(root) == true) {
            System.out.println("IS BST");
        }

        else {
            System.out.println("NOT A BST");
        }
    }
}