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

    public static boolean areQuasiIsomorphic(Node root1, Node root2) {
        if (root1 == null && root2 == null) {
            return true;
        }

        if (root1 == null && root2 != null || root2 == null && root1 != null) {
            return false;
        }

        return areQuasiIsomorphic(root1.left, root2.left) && areQuasiIsomorphic(root1.right, root2.right)
                || areQuasiIsomorphic(root1.left, root2.right) && areQuasiIsomorphic(root1.right, root2.left);
    }

    public static void main(String[] args) {
        Node root1 = new Node(1);
        root1.left = new Node(2);
        root1.right = new Node(3);
        root1.right.left = new Node(6);
        root1.right.left.left = new Node(8);
        root1.left.left = new Node(4);
        root1.left.right = new Node(5);
        root1.left.right.left = new Node(7);

        Node root2 = new Node(1);
        root2.left = new Node(5);
        root2.right = new Node(6);
        root2.left.left = new Node(3);
        root2.left.left.right = new Node(7);
        root2.right.left = new Node(8);
        root2.right.right = new Node(2);
        root2.right.left.left = new Node(4);

        boolean res = areQuasiIsomorphic(root1, root2);
        System.out.println(res);

    }
}