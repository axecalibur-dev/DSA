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

    public static boolean isCyclic(Node head) {
        Node current = head;
        while (current != null && current != head) {
            current = current.next;
        }

        return (current == head);
    }

    public static void main(String[] args) {
        Node head = new Node(10);
        Node second = new Node(20);
        Node third = new Node(30);
        head.next = second;
        second.next = third;
        third.next = head;

        boolean is = isCyclic(head);
        System.out.println(is);
    }
}