package Stack;

import java.util.Scanner;

public class threads {
    static int total = 200;

    static class mythread extends Thread {
        public void run() {
            System.out.println("I'm Thread One");
            System.out.println("Deposit 200");
            Scanner sc = new Scanner(System.in);
            total = total + 200;
            System.out.println("Total Now: "+total);
            System.out.println("Withdraw 200");
            total = total - 200;
            System.out.println("Total Now: " + total);
            System.out.println("Q");
        }
    }

    public static void main(String[] args) throws InterruptedException {

        mythread t1 = new mythread();
        t1.start();
        t1.join();
        System.out.println("\nI'm Main One");
        System.out.println("Deposit 200");
        total = total + 200;
        System.out.println("Total Now: "+total);
        System.out.println("Withdraw 200");
        total = total - 200;
        System.out.println("Total Now: " + total);
        System.out.println("Q");
    }
}
