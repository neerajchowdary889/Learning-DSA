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
                        System.out.print(curr.data+ "  -- END");
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
                        System.out.println(Rcurr.data+ "  -- END");
                        return;
                    }
                }
            }
        }
    }
    public static void delete(int key){
        Node delete = head;
        Node deletiontemp = null;
        Node deletiontempB = null;
        if(head != null && head.data == key){
            deletiontemp = delete.next;
            tail.next = deletiontemp;
            deletiontemp.prev = tail;
            head = deletiontemp;
        }
        else{
            while(delete != null && delete.data != key){
                deletiontempB = delete;
                delete = delete.next;
                deletiontemp = delete.next;
            }
            deletiontempB.next = delete.next;
            deletiontemp.prev = delete.prev;
        }
    }
    public static void Search(int key) {
        Node search = head;
        boolean isTrue = false;
        if (search != null && search.data == key) {
            isTrue = true;
            System.out.println(isTrue);
            return;
        }
        while (search != null && search.data != key) {
            search = search.next;
            if (search != null && search == head) {
                return;
            }
        }
        if (search == null) {
            return;
        }
        isTrue = true;
        System.out.println(isTrue);
    }
        public static void main(String[]args){
        CircularDouble list = new CircularDouble();
        list.insert(1);
        list.insert(2);
        list.insert(3);
        list.insert(0);
        list.insert(4);
        list.insert(5);
        Search(6); // it return nothing because 6 was not in list.
        Search(1);
        delete(0);
        Print("f");
        System.out.println(" ");
        Print("b");
    }
}
