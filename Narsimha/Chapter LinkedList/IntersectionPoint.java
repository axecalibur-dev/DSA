import java.util.*;

class Solution {
    static class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
            next = null;
        }
    }

    public static int findIntersection(Node head1, Node head2) {
        HashSet<Node> set = new HashSet<>();
        Node current = head1;
        while (current != null) {
            set.add(current);
            current = current.next;
        }

        current = head2;
        while (current != null) {
            if (set.contains(current)) {
                return current.data;
            }

            current = current.next;
        }

        return -1;
    }

    public static void printList(Node head) {
        Node current = head;
        while (current != null) {
            System.out.print(current.data + "->");
            current = current.next;
        }
    }

    public static void main(String[] args) {
        Node head = new Node(10);
        Node second = new Node(20);
        Node third = new Node(30);
        Node fourth = new Node(40);
        Node fifth = new Node(50);
        Node sixth = new Node(60);
        Node seventh = new Node(70);

        // LINK

        head.next = second;
        second.next = third;
        third.next = fourth;
        fourth.next = fifth;
        sixth.next = seventh;
        seventh.next = third;
        fifth.next = null;
        // printList(head);
        int intersectionPoint = findIntersection(head, sixth);
        if (intersectionPoint == -1) {
            System.out.println("No intersection");
        } else {
            System.out.println(intersectionPoint);
        }
    }
}