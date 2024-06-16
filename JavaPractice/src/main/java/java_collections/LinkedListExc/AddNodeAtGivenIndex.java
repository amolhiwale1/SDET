package java_collections.LinkedListExc;

public class AddNodeAtGivenIndex {

    static class Node {
        int val;
        Node next;

        Node(int val) {
            this.val = val;
        }
    }

    static Node head = null;
    static Node tail = null;

    public static void addNodes(int val) {
        Node newNode = new Node(val);
        if (head == null || tail == null) {
            head = newNode;
            tail = newNode;
        } else {
            tail.next = newNode;
            newNode.next = null;
            tail = newNode;
        }
    }

    public static void addNodeAtGivenIndex(int val, int index) {
        int count = 1;
        Node current = head;
        while (current != null && count != index - 1) {
            current = current.next;
            count++;
        }
        Node newNode = new Node(val);
        assert current != null;
        Node temp = current.next;
        current.next = newNode;
        newNode.next = temp;

    }

    public static void printLinkedList(Node newNode){
        while (newNode!=null){
            System.out.println(newNode.val);
            newNode = newNode.next;
        }
    }

    public static void main(String[] args){
        addNodes(10);
        addNodes(20);
        addNodes(30);
        addNodes(40);
        addNodes(50);
        addNodes(60);
        addNodeAtGivenIndex(55, 4);
        printLinkedList(head);
    }

}
