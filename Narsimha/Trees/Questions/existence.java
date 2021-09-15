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

    public static boolean existenceCheck(Node root, int sum) {

        if (root == null) {
            return false;
        }

        if (root.left == null && root.right == null && root.data == sum) {
            return true;
        } else {
            return existenceCheck(root.left, sum - root.data) || existenceCheck(root.right, sum - root.data);
        }

    }

    public static void main(String[] args) {
        Node root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(3);
        root.left.left = new Node(4);
        root.left.right = new Node(5);

        boolean va = existenceCheck(root, 98);
        System.out.println(va);
    }
}