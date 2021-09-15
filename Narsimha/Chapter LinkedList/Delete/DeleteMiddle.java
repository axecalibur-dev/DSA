import java.util.Currency;

import javax.swing.JEditorPane;

class Solution {
    public static class Node {
        Node next;
        int data;

        Node(int data) {
            this.data = data;
            next = null;

        }
    }

    public static void printList(Node head) {
        Node current = head;
        while (current != null) {
            System.out.println(current.data + "->");

            current = current.next;
        }
    }

    public static Node deleteX(Node head, int pos) {
        Node current = head;
        for (int i = 0; i < pos - 2; i++) {
            current = current.next;
        }

        current.next = current.next.next;
        return head;
    }

    public static void main(String[] args) {
        Node head = new Node(10);
        Node second = new Node(20);
        Node third = new Node(30);
        Node fourth = new Node(40);
        Node fifth = new Node(50);
        head.next = second;
        second.next = third;
        third.next = fourth;
        fourth.next = fifth;
        fifth.next = null;
        head = deleteX(head, 2);
        printList(head);
    }
}