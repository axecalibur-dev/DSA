import java.util.*;

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

    public static void levelOrderTraversal(Node root) {
        if (root == null) {
            return;
        }

        Queue<Node> queue = new LinkedList<>();
        queue.add(root);
        while (queue.isEmpty() == false) {
            Node out = queue.poll();
            System.out.println(out.data);

            if (out.left != null) {
                queue.add(out.left);
            }

            if (out.right != null) {
                queue.add(out.right);
            }
        }
    }

    public static int countLeaves(Node root) {
        int count = 0;
        if (root == null) {
            return 0;
        }

        Queue<Node> queue = new LinkedList<>();
        queue.add(root);
        while (queue.isEmpty() == false) {
            Node out = queue.poll();
            if (out.left == null && out.right == null) {
                count++;
            }

            if (out.left != null) {
                queue.add(out.left);
            }

            if (out.right != null) {
                queue.add(out.right);
            }
        }

        return count;
    }

    public static void main(String[] args) {
        Node root = new Node(10);
        root.left = new Node(20);
        root.right = new Node(30);
        levelOrderTraversal(root);
        int count = countLeaves(root);
        System.out.println(count);
    }
}