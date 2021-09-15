class Solution {
    public static class Node {
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
            System.out.println("Current Data > " + current.data);
            current = current.next;
        }
    }

    public static Node insertEnd(Node head, int x) {
        Node temp = new Node(x);
        Node current = head;
        while (current.next != null) {
            current = current.next;
        }

        current.next = temp;
        return head;
    }

    public static void main(String[] args) {
        Node head = new Node(10);
        Node second = new Node(20);
        Node third = new Node(30);
        head.next = second;
        second.next = third;
        third.next = null;
        System.out.println("Before Insertion -->");
        printList(head);

        System.out.println("After Insertion --> ");
        head = insertEnd(head, 40);
        printList(head);
    }
}