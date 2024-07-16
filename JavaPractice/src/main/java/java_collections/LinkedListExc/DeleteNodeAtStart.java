package java_collections.LinkedListExc;

public class DeleteNodeAtStart {

    static class Node {
        int val;
        Node next;

        Node(int val) {
            this.val = val;
        }
    }
    static Node head = null;
    static Node tail = null;
    public static void addNodeAtStart(int val){
        Node newNode = new Node(val);
        if(head == null || tail == null){
            head = newNode;
            tail = newNode;
        }else{
            newNode.next = head;
            head = newNode;
        }
    }

    public static void deleteNodeAtStart(){
        head = head.next;
    }

    public static void printLinkedList(Node headNode){
        while (headNode!=null){
            System.out.println(headNode.val);
            headNode = headNode.next;
        }
    }

    public static void main(String[] args) {
         addNodeAtStart(10);
        addNodeAtStart(20);
        addNodeAtStart(30);
        addNodeAtStart(50);
        addNodeAtStart(70);
        printLinkedList(head);
        System.out.println("*********************");
        deleteNodeAtStart();
        printLinkedList(head);
    }
}
