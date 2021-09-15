class Solution {
    public static class Node {
        int data;
        Node next;
        Node prev;

        Node(int d) {
            this.data = d;
            next = null;
            prev = null;
        }
    }

    public static Node insertBeing(Node head, int data) {
        Node temp = new Node(data);
        temp.next = head;
        if (head != null) {
            head.prev = temp;
        }

        return temp;
    }

    public static void printList(Node head) {
        Node current = head;
        while (current != null) {
            System.out.print(current.data + "<->");
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
        third.prev = second;
        second.prev = head;
        head.prev = null;
        System.out.println("Before insertion");
        printList(head);
        System.out.println("After insertion");
        head = insertBeing(head, 0);
        printList(head);
    }
}