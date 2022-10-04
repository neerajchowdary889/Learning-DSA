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
            data[++top] = value;
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
            System.out.println("\n"+key+" is Popped out from stack.");
            return;
        }
    }
    static int peek(){
        if(top <  0){
            System.out.println("StackUnderflow");
            return 0;
        }
        else{
            int temp = data[top--];
            return temp;
        }
    }
    public static void Print(){
        System.out.println("Elements in Stack: ");
        for (int i = top ; i > -1; i--){
            System.out.print(data[i]+" ");
        }
    }
    public static void main (String[]args){
        stack Stack = new stack();
        push(10);
        push(20);
        push(30);
        push(40);
        push(50);
        push(60);
        Print();
        pop();
        Print();
        Stack.peek();
    }
}
