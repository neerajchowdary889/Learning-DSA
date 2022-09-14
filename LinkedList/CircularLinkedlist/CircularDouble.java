package LinkedList.CircularLinkedlist;

import LinkedList.DoublyLinkedlist.DoublyLinkedlist;

//Double circular linkedlist
public class CircularDouble {
    static Node head;
    static Node tail;
    static class Node{
        Node next;
        Node prev;
        int data;
        Node(int data){
            this.data = data;
            this.next = null;
            this.prev = null;
        }
    }
    public static void insert(int data){
        Node newnode = new Node(data);
        if(head == null){
            head = newnode;
            tail = newnode;
            head.prev = null;
            head.next = null;
        }
        else{
            tail.next = newnode;
            newnode.prev = tail;
            tail = newnode;
            tail.next = head;
            head.prev = tail;
        }
    }
    public static boolean IsEmpty(){
        return head == null;
    }
    public static void Print(String input){
        if(IsEmpty()){
            System.out.println("Nothing");
        }
        else{
            if(input == "f") {
                Node curr = head;
                System.out.println("In Forward Direction: ");
                while (curr != null) {
                    System.out.print(curr.data + " ");
                    curr = curr.next;
                    if (curr == tail) {
                        System.out.print("" + curr.data);
                        return;
                    }
                }
            }
            else if (input == "b") {
                Node Rcurr = tail;
                System.out.println("In Reverse Direction: ");
                while(Rcurr != null){
                    System.out.print(Rcurr.data + " ");
                    Rcurr = Rcurr.prev;
                    if(Rcurr == head){
                        System.out.println(Rcurr.data);
                        return;
                    }
                }
            }
        }
    }
    public static void main(String[]args){
        CircularDouble list = new CircularDouble();
        list.insert(1);
        list.insert(2);
        Print("b");
    }
}
