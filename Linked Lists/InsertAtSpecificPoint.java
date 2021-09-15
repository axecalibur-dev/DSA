class Solution {
    static class Node {
        int data;
        Node next;

        Node(int d) {
            this.data = d;
            next = null;
        }
    }

    public static void PrintList(Node head) {
        Node current = head;
        while (current != null) {
            System.out.println("Element : " + current.data + "->");
            current = current.next;
        }
    }

    public static Node insertPos(Node head, int pos, int data) {
        Node temp = new Node(data);
        if (pos == 1) {
            temp.next = head;
            return temp;
        }

        Node current = head;
        for (int i = 1; i < pos - 2 && current != null; i++) {
            current = current.next;
        }

        if (current == null) {
            return head;
        }

        temp.next = current.next;
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
        head = insertPos(head, 4, 45);
        PrintList(head);
    }
}