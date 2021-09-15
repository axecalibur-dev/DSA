import java.util.*;

class Solution {
    public static class Node {
        int data;
        Node left;
        Node right;

        Node(int d) {
            this.data = d;
            left = right = null;
        }
    }

    public static Node getDeepest(Node root) {
        Node value = null;
        if (root == null) {
            return null;
        }

        Queue<Node> queue = new LinkedList<>();
        queue.add(root);
        while (queue.isEmpty() == false) {
            value = queue.poll();
            if (value.left != null) {
                queue.add(value.left);
            }

            if (value.right != null) {
                queue.add(value.right);
            }
        }

        return value;
    }

    public static void main(String[] args) {
        Node root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(3);
        root.left.left = new Node(4);
        root.left.right = new Node(5);
        root.right.left = new Node(6);
        root.right.right = new Node(7);
        root.right.right.right = new Node(8);

        Node value = getDeepest(root);
        System.out.println(value.data);
    }
}