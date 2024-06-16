package java_collections.LinkedListExc;

public class addAtBeginning {

    static class Node{
        int val;
        Node next;

        Node(int val){
            this.val = val;
        }
    }
    static Node head = null;
    static Node tail = null;

    public static void addNumberInLk(int val){
        Node newNode = new Node(val);
        if(head==null || tail==null){
            head = newNode;
            tail = newNode;
        }else{
            tail.next = newNode;
            newNode.next = null;
            tail = newNode;
        }
    }


    public static void addNumberAtBeginning(int val){
        Node newNode = new Node(val);
        if(head==null){
            newNode = head;
        }
        else{
            newNode.next = head;
            head = newNode;
        }

    }

    public static void printLk(Node headNode){
        while (headNode!=null){
            System.out.println(headNode.val);
            headNode = headNode.next;
        }
    }

    public static void main(String[] args) {
        addNumberInLk(10);
        addNumberInLk(20);
        addNumberInLk(30);
        addNumberAtBeginning(40);
        printLk(head);

    }
}
