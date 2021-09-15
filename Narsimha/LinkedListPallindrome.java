import java.util.*;

class Solution {
    static class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
            next = null;
        }
    }

    public static void printList(Node head) {
        Node current = head;
        while (current != null) {
            System.out.print(current.data + "->");
            current = current.next;
        }
    }

    public static boolean isPallindrome(Node head) {
        Node current = head;
        boolean isPalin = true;
        Stack<Integer> stack = new Stack<Integer>();
        while (current != null) {
            stack.push(current.data);
            current = current.next;
        }

        current = head;
        // Node run = head;
        // System.out.println(" I RUN");
        while (current != null) {

            int stackOut = stack.pop();
            if (current.data == stackOut) {
                isPalin = true;

            } else {
                isPalin = false;
                break;
            }

            current = current.next;

        }

        return isPalin;
    }

    public static void main(String[] args) {
        Node head = new Node(120);
        Node second = new Node(20);
        Node third = new Node(120);
        head.next = second;
        second.next = third;
        third.next = null;

        // printList(head);
        boolean res = isPallindrome(head);
        System.out.println(res);
    }
}