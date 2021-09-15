import javax.xml.crypto.dsig.keyinfo.RetrievalMethod;

class Solution {
    public static class Node {
        int data;
        Node left;
        Node right;

        Node(int data) {
            this.data = data;
            left = null;
            right = null;
        }
    }

    public static int findMinimum(Node root) {
        if (root == null) {
            return -1;
        }

        else {
            if (root.left == null) {
                return root.data;
            }

            else {
                return findMinimum(root.left);
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

        int val = findMinimum(root);
        System.out.println(val);
    }
}