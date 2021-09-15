import java.util.*;

class Solution {
    public static class Node {
        int data;
        Node left;
        Node right;

        Node(int d) {
            this.data = d;
            right = null;
            left = null;
        }
    }

    public static int traversal(Node root) {
        if (root == null) {
            return 0;
        }
        int count = 0;
        Queue<Node> queue = new LinkedList<>();
        queue.add(root);
        while (queue.isEmpty() == false) {
            Node out = queue.poll();
            System.out.println(out.data);

            if (out.left == null && out.right != null || out.left != null && out.right == null) {
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
        int res = traversal(root);
        System.out.println(res);
    }
}