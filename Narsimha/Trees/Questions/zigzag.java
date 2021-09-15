import java.util.Stack;

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

    public static void zigzag(Node root) {
        if (root == null) {
            return;
        }

        Stack<Node> currentLevel = new Stack<>();
        Stack<Node> nextLevel = new Stack<>();
        currentLevel.push(root);
        boolean left2Right = true;
        while (currentLevel.isEmpty() == false) {
            Node out = currentLevel.pop();
            System.out.println(out.data);
            if (left2Right) {
                if (out.left != null) {
                    nextLevel.push(out.left);
                }

                if (out.right != null) {
                    nextLevel.push(out.right);
                }
            }

            else {
                if (out.right != null) {
                    nextLevel.push(out.right);
                }

                if (out.left != null) {
                    nextLevel.push(out.left);
                }
            }

            if (currentLevel.isEmpty() == true) {
                Stack<Node> temp = currentLevel;
                left2Right = !left2Right;
                currentLevel = nextLevel;
                nextLevel = temp;
            }
        }
    }

    public static void main(String[] args) {
        Node root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(3);
        root.left.left = new Node(7);
        root.left.right = new Node(6);
        root.right.left = new Node(5);
        root.right.right = new Node(4);
        zigzag(root);
    };
}