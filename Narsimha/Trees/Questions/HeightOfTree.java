import java.util.*;

class Solve {
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

    public static int getDepth(Node root) {
        if (root == null) {
            return 0;
        }

        int leftDepth = getDepth(root.left);
        int rightDepth = getDepth(root.right);

        return (leftDepth > rightDepth) ? leftDepth + 1 : rightDepth + 1;
    }

    public static void main(String[] args) {
        Node root = new Node(20);
        root.left = new Node(80);
        root.right = new Node(310);
        root.right.left = new Node(40);
        root.right.right = new Node(50);
        int res = getDepth(root);
        System.out.println(res);
    }
}