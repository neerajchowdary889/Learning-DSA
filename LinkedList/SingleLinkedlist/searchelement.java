package LinkedList.SingleLinkedlist;

public class searchelement {
    static Node head;

     static class Node{
        Node next;
        int data;
        Node(int data){
            this.data = data;
            next = null;
        }
    }
    public static searchelement insert(searchelement list, int data){
         Node new_node = new Node(data);
         new_node.next = null;
         if(list.head == null){
             list.head = new_node;
         }
         else{
             Node last = list.head;
             while(last.next!=null){
                 last = last.next;
             }
             last.next = new_node;
         }
         return list;
    }
    public static void searchNode(int key){
         // if element is present then it will print true.
         Node CurrNode = head;
         boolean element = false;
         if(CurrNode != null && CurrNode.data == key){
             element = true;
             System.out.println(element);
             return;
         }
         while(CurrNode != null && CurrNode.data != key){
             CurrNode = CurrNode.next;
         }
         if(CurrNode == null){
             return;
         }
         element = true;
        System.out.println(element);

    }
    public static void main (String[]args){
         searchelement list = new searchelement();
         list = insert(list, 1);
        list = insert(list, 4);
        list = insert(list, 3);
        list = insert(list, 2);
        list = insert(list, 6);
        list = insert(list, 5);
        searchNode(4);
    }
}
