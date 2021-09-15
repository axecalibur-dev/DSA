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

    public static int findMaximum(Node root) {
        if (root == null) {
            return -1;
        } else {
            if (root.right == null) {
                return root.data;
            } else

            {
                return findMaximum(root.right);
            }
        }
    }

    public static void main(String[] args) {
        Node root = new Node(10);
        root.left = new Node(6);
        root.right = new Node(16);
        root.left.left = new Node(4);
        root.left.right = new Node(9);
        root.left.right.left = new Node(7);
        root.right.left = new Node(13);

        int val = findMaximum(root);
        System.out.println(val);
    }
}