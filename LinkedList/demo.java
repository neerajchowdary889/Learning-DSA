package LinkedList;

public class demo{
    Node head;
    static class Node{
        Node next;
        int data;
        Node(int data){
            this.data = data;
            next = null;
        }
    }
    public static demo insert(demo list, int data){
        Node new_node = new Node(data);
        new_node.next = null;
        if (list.head == null){
            list.head = new_node;
        }
        else{
            Node last = list.head;
            while(last.next != null){
                last = last.next;
            }
            last.next = new_node;
        }
        return list;
    }
    public static void Print(demo list){
        Node currNode = list.head;
        while(currNode != null){
            System.out.println(currNode.data+ " ");
            currNode = currNode.next;
        }
    }
    public static void main (String[]args){
        demo list = new demo();
        list = insert(list, 1);
        list = insert(list, 2);
        list = insert(list, 3);
        list = insert(list, 4);
        list = insert(list, 5);
        Print(list);
    }
}