package LinkedList.DoublyLinkedlist;

import java.time.Duration;
import java.time.Instant;

public class searchDoubly {
    static Node head;
    static Node tail;
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
    public static boolean IsEmpty(){
        return head == null;
    }
    public static void Print(){
        Node Curr = head;
        Node RCurr = tail;
        if(IsEmpty()){
            return;
        }
        else{
            while (Curr != null){
                System.out.print(Curr.data + " ");
                Curr = Curr.next;
            }
            System.out.println("\n");
            while (RCurr != null){
                System.out.print(RCurr.data + " ");
                RCurr = RCurr.prev;
            }
        }
    }
    public static void search(int key){
        Instant start = Instant.now();
        Node SCurr = head;
        Node SRCurr = tail;
        boolean issearch = false;
        if(SCurr != null && SCurr.data == key){
            issearch = true;
            System.out.println(issearch);
            Instant end1 = Instant.now();
            Duration timeElapsed1 = Duration.between(start, end1);
            System.out.println(timeElapsed1);
            return;
        }
        else if(SRCurr != null && SRCurr.data == key) {
            issearch = true;
            System.out.println(issearch);
            return;
        }
        while ((SCurr != null && SRCurr != null) && (SCurr.data != key && SRCurr.data != key)) {
            SCurr = SCurr.next;
            SRCurr = SRCurr.prev;
        }
        if (SCurr == null && SRCurr == null){
            System.out.println("\n"+issearch);
            return;
        }
        issearch = true;
        System.out.println("\n"+issearch);
        Instant end = Instant.now();
        Duration timeElapsed = Duration.between(start, end);
        System.out.println(timeElapsed);

    }
    public static void find(int key) {
        Instant start = Instant.now();
        Node fscurr = head;
        Node dfscurr = tail;
        boolean findd =  false;
        if (fscurr != null && dfscurr.data == key) {
            System.out.println("List is empty");
            return ;
        }


        while(fscurr != null && fscurr.data != key) {
            fscurr = fscurr.next;
        }

        if (fscurr == null) {
            return;
        }

       findd = true;
        System.out.println(findd);
        Instant end = Instant.now();
        Duration timeElapsed = Duration.between(start, end);
        System.out.println(timeElapsed);


    }
    public static void main(String[]args){
        searchDoubly list = new searchDoubly();
        list.Insert(1);
        list.Insert(2);
        list.Insert(3);
        list.Insert(4);
        list.Insert(5);
        list.Insert(6);
        list.Insert(7);
        list.Insert(8);
        list.Insert(9);
        list.Insert(10);
        list.Insert(122);
        list.Insert(1);
        list.Insert(2);
        list.Insert(3);
        list.Insert(4);
        list.Insert(5);
        list.Insert(6);
        list.Insert(7);
        list.Insert(8);
        list.Insert(9);
        list.Insert(101);
        list.Insert(11);
        Print();
        search(1);
//Dont know why searching from both ends taking more time than searching from one end like singly linkedlist.
        find(101);
    }
}
