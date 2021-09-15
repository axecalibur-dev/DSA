class Solution {
    public static class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
            next = null;
        }
    }

    public static Node insertBegin(Node head, int x) {
        Node temp = new Node(x);
        temp.next = head;
        return temp;
    }

    public static void printList(Node head) {
        Node current = head;
        while (current != null) {
            System.out.println("Current Data > " + current.data);
            current = current.next;
        }
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
        head = insertBegin(head, 5);

        System.out.println("After Insertion -->");
        printList(head);
    }
}