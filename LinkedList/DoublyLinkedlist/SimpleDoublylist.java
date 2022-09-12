package LinkedList.DoublyLinkedlist;

public class SimpleDoublylist {
    Node head;
    static class Node{
        Node next;
        Node prev;
        int data;
        Node(int data){
           this.data = data;
        }
    }
    public void Insert(int data){
        Node new_node = new Node(data);
        Node last = head;
        new_node.next = null;
        if(head == null){
            new_node.prev = null;
            head = new_node;
            return;
        }
        while(last.next != null){
            last = last.next;
        }
        last.next = new_node;
        new_node.prev = last;
    }
    public void Print(){
        Node node = head;
        Node last = null;
        System.out.println("In Forward direction");

        while(node != null){
            System.out.print(node.data+" ");
            last = node;
            node = node.next;
        }
        System.out.println("\nIn Reverse direction");
        while(last != null){
            System.out.print(last.data+" ");
            last = last.prev;
        }

    }
    public static void main(String[]args){
        SimpleDoublylist list = new SimpleDoublylist();
        list.Insert(0);
        list.Insert(1);
        list.Insert(2);
        list.Insert(3);
        list.Insert(4);
        list.Print();
    }
}
