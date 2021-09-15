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

    public static boolean getElement(Node root, int data) {
        if (root == null) {
            return false;
        }

        Queue<Node> queue = new LinkedList<>();
        queue.add(root);

        while (queue.isEmpty() == false) {
            Node tempOut = queue.poll();
            if (tempOut.key == data) {
                return true;
            }

            if (tempOut != null) {
                if (tempOut.left != null) {
                    queue.add(tempOut.left);
                }

                if (tempOut.right != null) {
                    queue.add(tempOut.right);
                }
            }
        }

        return false;

    }

    public static void main(String[] args) {
        Node root = new Node(20);
        root.left = new Node(80);
        root.right = new Node(310);
        root.right.left = new Node(40);
        root.right.right = new Node(50);
        boolean res = getElement(root, 310);
        System.out.println(res);
    }
}