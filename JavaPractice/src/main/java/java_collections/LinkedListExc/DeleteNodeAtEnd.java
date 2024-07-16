package java_collections.LinkedListExc;

public class DeleteNodeAtEnd {

    static class Node  {
        int val;
        Node next;

       public Node(int val) {
           super();
           this.val = val;
        }
    }

    static Node head = null;
    static Node tail = null;

    public static void addNodes(int val){
        Node newNode = new Node(val);
        if(head == null || tail == null){
            head = newNode;
            tail = newNode;
        }else{
            tail.next = newNode;
            newNode.next = null;
            tail = newNode;
        }
    }

    public static void deleteNodeAtEnd(Node headNode){
        Node current = headNode;
        while(current.next.next!=null){
            current = current.next;
        }
        current.next = null;
        tail = current;
    }

    public static void printLinkedList(Node headNode){
        while (headNode!=null){
            System.out.println(headNode.val);
            headNode = headNode.next;
        }
    }

    public static void main(String[] args) {
        addNodes(10);
        addNodes(20);
        addNodes(30);
        addNodes(40);
        addNodes(50);
        printLinkedList(head);
        System.out.println("*****************************");
        deleteNodeAtEnd(head);
        printLinkedList(head);

    }
}
