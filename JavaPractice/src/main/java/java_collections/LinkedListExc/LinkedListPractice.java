package java_collections.LinkedListExc;

import java.util.*;

public class LinkedListPractice {

    static class Node {
        int val;
        Node next;

        Node(int val) {
            this.val = val;
        }

        static Node head = null;
        static Node tail = null;

        public static void addNodeInLinkedList(int val) {
            Node newNode = new Node(val);
            if (head == null || tail == null) {
                head = newNode;
                tail = newNode;
            }
            else {
                tail.next = newNode;
                newNode.next = null;
                tail = newNode;
            }

        }

        public static void printLinkedList(Node headNode) {
            while (headNode != null) {
                System.out.println(headNode.val);
                headNode = headNode.next;
            }

        }

        public static void main(String[] args) {
            addNodeInLinkedList(10);
            addNodeInLinkedList(20);
            addNodeInLinkedList(30);
            addNodeInLinkedList(40);
            addNodeInLinkedList(403);
            printLinkedList(head);
        }

    }
}
