package LinkedList.SingleLinkedlist;
public class linkedlist {
    Node head;
    static class Node{
        int data;
        Node next;
        Node(int data){
            this.data = data;
            next = null;
        }
    }
    public void push(int data){
        Node new_node = new Node(data);
        new_node.next = head;
        head = new_node; // To push anything to the head of the Linkedlist.
    }
    public void insertafter(Node prevNode, int data){
        if(prevNode == null){
            System.out.println("Null");
            return;
        }
        Node new_node = new Node(data);
        new_node.next = prevNode.next;
        prevNode.next = new_node;
    }
    public static linkedlist insert(linkedlist list, int data){
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
    void deleteNode(int key){
        Node temp = head;
        Node prev = null;
        if(temp != null && temp.data == key){
            head = temp.next;
            return;
        }
        while(temp != null && temp.data != key){
            prev = temp;
            temp = temp.next;
        }
        if (temp == null){
            return;
        }
        prev.next = temp.next;
    }
    public static void Print(linkedlist list){
        Node currNode = list.head;
        while(currNode != null){
            System.out.print(currNode.data + " ");
            currNode = currNode.next;
        }
    }
    public static void main (String[]args){
        linkedlist list = new linkedlist();
        System.out.println("Linkedlist before deleting of Node.");
        list = insert(list, 1);
        list = insert(list, 2);
        list = insert(list, 3);
        list = insert(list, 4);
        list = insert(list, 5);
        list = insert(list, 6);
        Print(list);
        System.out.println("\n___________________\n");
        System.out.println("After deletion of 4.");
        list.deleteNode(4);
        Print(list);
    }
}
