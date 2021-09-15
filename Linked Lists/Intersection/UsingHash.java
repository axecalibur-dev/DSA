import java.util.*;

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

    public static int getIntersection(Node head1, Node head2) {
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

    public static void main(String[] args) {
        Node head = new Node(5);
        Node second = new Node(8);
        Node third = new Node(7);
        Node fourth = new Node(10);
        Node fifth = new Node(12);
        Node sixth = new Node(15);
        Node seventh = new Node(9);
        head.next = second;
        second.next = third;
        third.next = fourth;
        fourth.next = fifth;
        fifth.next = sixth;
        sixth.next = null;
        seventh.next = fourth;
        int value = getIntersection(head, seventh);
        System.out.println(value);
    }

}