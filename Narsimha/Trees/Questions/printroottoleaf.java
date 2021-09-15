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

    public static void printPaths(Node root) {
        int path[] = new int[1000];
        recusriveCall(root, path, 0);
    }

    public static void recusriveCall(Node root, int path[], int pathLen) {
        if (root == null) {
            return;
        }

        path[pathLen] = root.data;
        pathLen++;

        if (root.left == null && root.right == null) {
            printArray(path, pathLen);
        }

        else {
            recusriveCall(root.left, path, pathLen);
            recusriveCall(root.right, path, pathLen);
        }
    }

    /* Utility function that prints out an array on a line. */
    static void printArray(int ints[], int len) {
        int i;
        for (i = 0; i < len; i++) {
            System.out.print(ints[i] + " ");
        }
        System.out.println("");
    }

    public static void main(String[] args) {
        Node root = new Node(10);
        root.left = new Node(8);
        root.right = new Node(2);
        root.left.left = new Node(3);
        root.left.right = new Node(5);
        root.right.left = new Node(2);
        printPaths(root);
    }
}