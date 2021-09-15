import java.time.temporal.TemporalUnit;
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

    public static Node insertElement(Node root, int data) {
        if (root == null) {
            return null;
        }

        Queue<Node> queue = new LinkedList<>();
        queue.add(root);
        while (queue.isEmpty() == false) {
            Node tempOut = queue.poll();
            if (tempOut != null) {
                if (tempOut.left != null) {
                    queue.add(tempOut.left);

                }

                else {
                    tempOut.left = new Node(data);
                    return root;
                }

                if (tempOut.right != null) {
                    queue.add(tempOut.right);
                }

                else {
                    tempOut.right = new Node(data);
                    return root;
                }
            }
        }

        return root;
    }

    public static void main(String[] args) {
        Node root = new Node(20);
        root.left = new Node(80);
        root.right = new Node(310);
        root.right.left = new Node(40);
        root.right.right = new Node(50);
        Node res = insertElement(root, 999);
        System.out.println(res);
    }
}