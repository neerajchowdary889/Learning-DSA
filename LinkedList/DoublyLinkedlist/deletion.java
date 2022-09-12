package LinkedList.DoublyLinkedlist;

public class deletion {
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
            int i = 0;
            while(curr != null){
                System.out.print(curr.data + " ");
                curr = curr.next;
                i++;
            }
            Node Rcurr = tail;
            System.out.println("\nIn Reverse Direction: ");
            while(Rcurr != null){
                System.out.print(Rcurr.data + " ");
                Rcurr = Rcurr.prev;
            }
            System.out.println("\nLenght of List: "+i);
        }
    }
    public static void delete(int key){
        Node temp = head;
        Node Btemp = null;
        Node Ftemp = null;
        if (temp != null && temp.data == key){
            head = temp.next;
            head.prev = null;
            temp.next = null;
            return;
        }
        while(temp != null && temp.data != key){
            temp = temp.next;
            Ftemp = temp.next;

            System.out.println("Temp: "+temp.data);
            Btemp = temp.prev;
            System.out.println("Btemp: "+Btemp.data);
            if (Ftemp == null){
                Ftemp = temp;
            }
            System.out.println("Ftemp: "+Ftemp.data);
        }
        if (temp == null){
            return;
        }
        System.out.println("Present: " + temp.data);
//        System.out.println("Present: " + temp.prev.data);
        System.out.println("Present: " + Btemp.next.data);
        System.out.println("Present: " + Btemp.data);
        System.out.println("Present: " + Ftemp.data);
        if(Ftemp == temp){
            Btemp.next = null;
            tail = Btemp ;
        }
        else {
            Ftemp.prev = temp.prev;
            Btemp.next = temp.next;
        }
    }
    public static void main(String[]args){
        deletion list = new deletion();
        list.Insert(1);
        list.Insert(2);
        list.Insert(3);
        list.Insert(4);
        list.Insert(5);
        list.Insert(6);
        delete(6);
        Print();
    }
}
