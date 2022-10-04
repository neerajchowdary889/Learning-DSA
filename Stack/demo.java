package Stack;
import java.util.Scanner;
public class demo {
    public static void main(String[] args)
    {
        Scanner myObj = new Scanner(System.in);
        System.out.println("enter name , Full Name,Age, address,height,marks");
        String name = myObj.next();

        String empty = myObj.nextLine();
        String Fullname= myObj.nextLine();

        int Age = myObj.nextInt();

        String empty1 = myObj.nextLine();
        String Address =myObj.nextLine();

        double Height = myObj.nextDouble();

        Float Marks= myObj.nextFloat();

        System.out.println("Name:" +name);
        System.out.println("Full Name:" +Fullname);
        System.out.println("Age:" +Age);
        System.out.println("Address:" +Address);
        System.out.println("Height:" +Height+ "cm");
        System.out.println("Marks:" +Marks);

    }
}
