package Stack;

import java.util.Scanner;

public class lab {
    static class mythread extends Thread {
        public void run() {
            int i, count;
            System.out.println("Start Thread");
            System.out.println("\n Current Thread : Thread 0");
            System.out.print("Enter n value : ");
            Scanner sc=new Scanner(System.in);
            int n=sc.nextInt();

            System.out.println("Prime numbers between 1 to " + n + " are ");
            for (int j = 2; j <= n; j++) {
                count = 0;
                for (i = 1; i <= j; i++) {
                    if (j % i == 0) {
                        count++;
                    }
                }
                if (count == 2)
                    System.out.print(j + "  ");
            }
            System.out.println("Exit Thread");
        }
    }

    public static void main(String[] args) throws InterruptedException {

        mythread t1 = new mythread();
        t1.start();
        t1.join();

        System.out.println("\n Current Thread : Main");
     System.out.print("Enter n value : ");
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();

        System.out.println("\nOdd Number from 1 to "+n);
        for(int i = 0; i < n; i++){
           if (i%2 == 0){
               continue;
            }
           else{
               System.out.print(i+" ");
           }
        }
        System.out.println("Exit Thread");
        System.out.println("Exit Thread Main");
        System.out.println("End of execution");
    }
}
