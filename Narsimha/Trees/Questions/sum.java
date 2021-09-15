import java.security.spec.EncodedKeySpec;

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

    public static int sum(Node root) {
        if (root == null) {
            return 0;
        }

        return sum(root.left) + sum(root.right) + root.key;
    }

    public static void main(String[] args) {
        Node root = new Node(2);
        root.left = new Node(8);
        root.right = new Node(3);
        root.right.left = new Node(4);
        root.right.right = new Node(5);
        int res = sum(root);
        System.out.println(res);
    }
}