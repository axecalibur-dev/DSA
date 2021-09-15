class Solution {
    public static class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
            next = null;
        }
    }

    public static void find(Node head, int k) {
        Node mainPointer = head;
        Node referencePointer = head;

        for (int i = 1; i <= k; i++) {
            referencePointer = referencePointer.next;
        }

        while (referencePointer != null) {
            referencePointer = referencePointer.next;
            mainPointer = mainPointer.next;
        }

        System.out.println(mainPointer.data);
    }

    public static void printList(Node head) {
        if (head == null) {
            System.out.println("Nothing to print");
        } else {
            Node current = head;
            while (current != null) {
                System.out.print(current.data + "->");

                current = current.next;
            }
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
        // printList(head);

        // printList(head);
        find(head, 1);

    }
}