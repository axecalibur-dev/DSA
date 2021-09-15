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

    public static boolean getElement(Node root, int data) {
        if (root == null) {
            return false;
        }

        if (root.key == data) {
            return true;
        }

        boolean res1 = getElement(root.left, data);
        if (res1) {
            return true;
        }

        boolean res2 = getElement(root.right, data);

        return res2;

    }

    public static void main(String[] args) {
        Node root = new Node(20);
        root.left = new Node(80);
        root.right = new Node(310);
        root.right.left = new Node(40);
        root.right.right = new Node(50);
        boolean res = getElement(root, 31110);
        System.out.println(res);
    }
}