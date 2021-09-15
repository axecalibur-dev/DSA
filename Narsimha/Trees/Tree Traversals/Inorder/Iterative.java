import java.util.*;
import java.io.*;
import java.lang.*;

class Node {
    int key;
    Node left;
    Node right;

    Node(int k) {
        key = k;
        left = right = null;
    }
}

class GFG {

    public static void main(String args[]) {
        Node root = new Node(10);
        root.left = new Node(20);
        root.right = new Node(30);
        root.right.left = new Node(40);
        root.right.right = new Node(50);

        preorder(root);
    }

    public static void preorder(Node root) {
        if (root == null) {
            return;
        }

        Stack<Node> nodeStack = new Stack<>();
        nodeStack.push(root);
        while (nodeStack.empty() == false) {
            Node myNode = nodeStack.peek();
            if (myNode.right != null) {
                nodeStack.push(myNode.right);
            }

            System.out.println(myNode.key);
            nodeStack.pop();

            if (myNode.left != null) {
                nodeStack.push(myNode.left);
            }
        }

    }
}