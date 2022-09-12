package LinkedList.DoublyLinkedlist;

public class DoublyLinkedlist {
     static Node head = null;
     static Node tail = null;
    static class Node{
        int data;
        Node next;
        Node prev;
        Node(int data){
            this.data = data;
            this.next = null;
            this.prev = null;
        }
    }
    public static void Insert(int data){
        Node new_node = new Node(data);
        if(head == null){
            head = new_node;
            tail = new_node;
            head.next = null;
            head.prev = null;
        }
        else{
            tail.next = new_node;
            new_node.prev = tail;
            tail = new_node;
            tail.next = null;
        }

    }
    public static void main(String[]args){
        DoublyLinkedlist list = new DoublyLinkedlist();
    }
}
