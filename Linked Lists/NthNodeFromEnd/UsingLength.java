import java.util.Currency;

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
            System.out.println(current.data);
            current = current.next;
        }
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
        printList(head);
        getN(head, 2);
    }

    public static void getN(Node head, int pos) {
        int len = 0;
        for (Node curr = head; curr != null; curr = curr.next) {
            len++;
        }

        if (len < pos) {
            return;
        }

        Node current = head;
        for (int i = 1; i < len - pos + 1; i++) {
            current = current.next;
        }

        System.out.println(current.data);
    }
}