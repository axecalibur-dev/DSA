import java.security.spec.EncodedKeySpec;
import java.util.LinkedList;
import java.util.Queue;

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

    public static void mirror(Node root) {
        if (root == null) {
            return;
        }

        mirror(root.left);
        mirror(root.right);

        Node temp = root.left;
        root.left = root.right;
        root.right = temp;
    }

    public static void traversal(Node root) {
        Queue<Node> queue = new LinkedList<>();

        queue.add(root);
        while (queue.isEmpty() == false) {
            Node out = queue.poll();
            System.out.println(out.key);

            if (out.left != null) {
                queue.add(out.left);
            }

            if (out.right != null) {
                queue.add(out.right);
            }

        }
    }

    public static void main(String[] args) {
        Node root = new Node(20);
        root.left = new Node(80);
        root.right = new Node(310);
        root.right.left = new Node(40);
        root.right.right = new Node(50);
        traversal(root);
        mirror(root);
        System.out.println(">>>>>>>>>>>>>>.");
        traversal(root);

    }
}