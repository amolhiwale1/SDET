package java_collections.LinkedListExc;

public class DeleteNodeAtGivenIndex {

    static class Node{
        int val;
        Node next;
        Node(int val){
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

    public static void deleteNodeAtGivenIndex(int index){
        int count = 1;
        Node current = head;
        while (current!=null && count !=index-1){
            current = current.next;
            count++;
        }
        assert current != null;
        current.next = current.next.next;

    }

    public static void printLinkedList(){
        while (head!=null){
            System.out.println(head.val);
            head = head.next;
        }
    }

    public static void main(String[] args) {

        addNodes(10);
        addNodes(20);
        addNodes(30);
        addNodes(40);
        addNodes(50);
        printLinkedList();
        deleteNodeAtGivenIndex(3);
        printLinkedList();
    }
}
