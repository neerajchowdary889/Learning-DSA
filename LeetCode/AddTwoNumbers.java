package LeetCode;
//public class AddTwoNumbers {
//    Node head;
//    static class Node{
//        int data;
//        Node next;
//        Node(int data){
//            this.data = data;
//            next = null;
//        }
//    }
//    public void push(int data){
//        Node new_node = new Node(data);
//        new_node.next = head;
//        head = new_node;
//    }
//    public <ListNode> ListNode addTwoNumbers(ListNode l1, ListNode l2) {
//        return null;
//    }
//    public static void main (String[]args){
//        AddTwoNumbers obj = new AddTwoNumbers();
////        obj.addTwoNumbers();
//    }
//}
import java.util.Arrays;
import java.util.List;
import java.util.LinkedList;
public class AddTwoNumbers{
    public <ListNode> int addTwoNumbers(ListNode l1, ListNode l2) {

        List<Integer> list1 = (List<Integer>) Arrays.asList(l1);
        List<Integer> list2 = (List<Integer>) Arrays.asList(l2);

        LinkedList<Integer> linkedList1 = new LinkedList<Integer>(list1);
        LinkedList<Integer> linkedList2 = new LinkedList<Integer>(list2);

        int L1 = 0;
        int L2 = 0;
        for (int num : linkedList1){
            L1 = L1*10+num;
        }
        String numStr = Integer.toString(L1); // convert to string
        String reversedStr = new StringBuilder(numStr).reverse().toString(); // reverse string
        int reversedNum = Integer.parseInt(reversedStr);

        for (int num2 : linkedList2){
            L2 = L2*10+num2;
        }
        String numStr2 = Integer.toString(L2); // convert to string
        String reversedStr2 = new StringBuilder(numStr).reverse().toString(); // reverse string
        int reversedNum2 = Integer.parseInt(reversedStr);

        return reversedNum+reversedNum2 ;
    }
    public static void main (String[]args){
        int[] arr = {2,4,3};
        int[] arr2 = {5,6,4};
        AddTwoNumbers obj = new AddTwoNumbers();
        int result = obj.addTwoNumbers(arr,arr2);
        System.out.println(result);
    }
}
