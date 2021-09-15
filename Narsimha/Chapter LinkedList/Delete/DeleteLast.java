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

    public static Node deleteLast(Node head) {
        Node current = head;
        while (current.next.next != null) {
            current = current.next;
        }

        current.next = null;
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
        head = deleteLast(head);
        printList(head);
    }
}