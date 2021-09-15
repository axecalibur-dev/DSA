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

    public static Node getLCA(Node root, int n1, int n2) {
        if (root == null) {
            return null;
        }

        if (root.data == n1 || root.data == n2) {
            return root;
        }

        Node LCA1 = getLCA(root.left, n1, n2);
        Node LCA2 = getLCA(root.right, n1, n2);

        if (LCA1 != null && LCA2 != null) {
            return root;
        }

        if (LCA1 != null) {
            return LCA1;

        }

        else {
            return LCA2;
        }
    }

    public static void main(String[] args) {
        Node root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(3);
        root.left.left = new Node(4);
        root.left.right = new Node(5);
        root.right.left = new Node(6);
        root.right.right = new Node(7);
        Node lca = getLCA(root, 4, 6);

        System.out.println(lca.data);
    }
}