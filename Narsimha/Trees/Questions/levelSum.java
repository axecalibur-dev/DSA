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

        int result = root.data;
        Queue<Node> queue = new LinkedList<>();
        queue.add(root);
        while (queue.isEmpty() == false) {
            int count = queue.size();
            int sum = 0;

            while (count > 0) {
                Node out = queue.poll();
                sum = sum + out.data;

                if (out.left != null) {
                    queue.add(out.left);
                }

                if (out.right != null) {
                    queue.add(out.right);
                }

                count--;
            }

            result = Math.max(result, sum);
        }

        return result;
    }

    public static void main(String[] args) {
        Node root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(3);
        root.left.left = new Node(4);
        root.left.right = new Node(5);
        root.right.right = new Node(8);
        root.right.right.left = new Node(6);
        root.right.right.right = new Node(7);
        int res = traversal(root);
        System.out.println(res);
    }
}