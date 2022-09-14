package LinkedList.CircularLinkedlist;

public class CircularSingle {
    static Node head;
    static class Node{
        int data;
        Node next;
        Node(int data){
            this.data = data;
            this.next = null;
        }
    }
    public static void insert(int data){
        Node newnode = new Node(data);
        if(head == null){
            head = newnode;
            head.next = head;
        }
        else{
            Node curr = head;
            while(curr.next != head){
                curr = curr.next;
            }
            curr.next = newnode;
            newnode.next = head;
        }
    }
    public static void Print(){
        Node print = head;
        while(print.next != head){
            System.out.print(print.data + " ");
            print = print.next;
        }
        if(print.next == head){
            System.out.print(print.data + "  -- END");
            return;
        }
    }
    public static void delete(int key){
        Node delete = head;
        if(head != null && head.data == key){
            Node last = head;
            while(last != null && last.next != head){
                last = last.next;
            }
            last.next = head.next;
            head = last.next;
        }
        else{
            Node last = head;
            Node Back = null;
            while(last != null && last.data != key){
                Back = last;
                last = last.next;
            }
            Back.next = last.next;
        }
    }
    public static void main(String[]args){
        CircularSingle list = new CircularSingle();
        list.insert(1);
        list.insert(2);
        list.insert(3);
        list.insert(4);
        list.insert(5);
        delete(3);
        Print();
    }
}
