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
    public static void InsertatStart(int data){
        Node new_node = new Node(data);
        if(head == null){
            head = new_node;
            tail = new_node;
            head.next = null;
            head.prev = null;
        }
        else{
            head.prev = new_node;
            new_node.next = head;
            new_node.prev = null;
            head = new_node;
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
    public static boolean IsEmpty(){
        return head == null;
    }
    public static void Print(){
        if(IsEmpty()){
            System.out.println("Nothing");
        }
        else{
            Node curr = head;
            System.out.println("In Forward Direction: ");
            while(curr != null){
                System.out.print(curr.data + " ");
                curr = curr.next;
            }
            Node Rcurr = tail;
            System.out.println("\nIn Reverse Direction: ");
            while(Rcurr != null){
                System.out.print(Rcurr.data + " ");
                Rcurr = Rcurr.prev;
            }
        }
    }
    public static void main(String[]args){
        DoublyLinkedlist list = new DoublyLinkedlist();
        list.Insert(1);
        list.Insert(2);
        list.Insert(3);
        list.Insert(4);
        list.Insert(5);
        list.Insert(6);
        list.InsertatStart(0);
        Print();
    }
}
