import java.util.LinkedList;
import java.util.Queue;

class Solution {
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

    public static int findLargest(Node root) {

        int maxValue = Integer.MIN_VALUE;
        if (root == null) {
            return Integer.MIN_VALUE;
        }

        Queue<Node> queue = new LinkedList<>();
        queue.add(root);

        while (queue.isEmpty() == false) {
            Node tempNode = queue.poll();
            if (tempNode.key > maxValue) {
                maxValue = tempNode.key;
            }

            if (tempNode != null) {
                if (tempNode.left != null) {
                    queue.add(tempNode.left);
                }
                if (tempNode.right != null) {
                    queue.add(tempNode.right);
                }
            }

        }

        return maxValue;

    }

    public static void main(String[] args) {
        Node root = new Node(20);
        root.left = new Node(80);
        root.right = new Node(310);
        root.right.left = new Node(40);
        root.right.right = new Node(50);
        int res = findLargest(root);
        System.out.println(res);
    }
}