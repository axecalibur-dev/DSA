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

    public static Node insertSorted(Node head, int value) {
        Node newNode = new Node(value);
        Node current = head;
        if (head == null) {
            return newNode;
        }

        if (value < head.data) {
            newNode.next = head;
            return newNode;
        }

        while (current.next != null && current.next.data < value) {
            current = current.next;
        }

        newNode.next = current.next;
        current.next = newNode;

        return head;

    }

    public static void main(String[] args) {
        Node head = new Node(10);
        Node second = new Node(20);
        Node third = new Node(30);
        head.next = second;
        second.next = third;
        third.next = null;

        head = insertSorted(head, 2);

        printList(head);
    }
}