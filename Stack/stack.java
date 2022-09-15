package Stack;

public class stack {
    final static int max = 10;
    static int top;
    static int[] data = new int[max];
    stack(){
        top = -1;
    }
    static boolean isEmpty(){
        if (top < 0){
            System.out.println("Stack is Empty");
        }
        return (top<0);
    }
    public static void push(int value){
        if (top >= max-1){
            System.out.println("StackOverflow");
            return;
        }
        else{
            data[top++] = value;
            System.out.println(value+" Pushed to stack.");
            return;
        }
    }
    public static void pop(){
        if(top < 0){
            System.out.println("StackUnderflow");
            return;
        }
        else{
            int key  = data[top--];
            System.out.println(key+" is Popped out from stack.");
            return;
        }
    }
    
}
