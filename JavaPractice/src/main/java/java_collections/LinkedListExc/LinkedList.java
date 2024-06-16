package java_collections.LinkedListExc;

public class LinkedList {

     static class Node {
        int val;
        Node next;

        Node(int val) {
            this.val = val;
        }
    }

    Node head = null;
    Node tail = null;

    public void addNewNodeAtEnd(int n) {
        Node newNode = new Node(n);
        if (head == null) {
            head = newNode;
            tail = newNode;
        } else {
            tail.next = newNode;
            newNode.next = null;
            tail = newNode;
        }

    }

    public void printLinkedList(Node headNode) {
        while (headNode != null) {
            System.out.println(headNode.val);
            headNode = headNode.next;
        }


    }

    public static void main(String[] args) {
        LinkedList lk = new LinkedList();
        lk.addNewNodeAtEnd(10);
        lk.addNewNodeAtEnd(20);
        lk.addNewNodeAtEnd(30);
        lk.addNewNodeAtEnd(40);
        lk.addNewNodeAtEnd(50);
        lk.printLinkedList(lk.head);
    }

}



