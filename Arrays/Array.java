package Arrays;

import javax.naming.Name;

class array{
    public int numb;
    public String Name;
    array(int numb, String Name){
        this.numb = numb;
        this.Name = Name;
    }
}
public class Array {
    public static void main (String[] args){

        int[] array = {1, 2, 3, 4, 5};

        int i = 0;

        for(i=0; i< array.length; i++){
            System.out.println("Array position "+i+" : "+ array[i]);
        }
        System.out.println("\n");
        array[] arr = new array[6];
        arr[0] = new array(1, "Richard");
        arr[1] = new array(2,"Gillfoyl");
        arr[2] = new array(3, "Dinesh");
        arr[3] = new array(4, "Erlich");
        arr[4] = new array(5, "Jared");
        arr[5] = new array(6, "Bighead");

        for (int j = 0; j <= array.length; j++){
            System.out.println("Silicon Valley: "+arr[j].numb +" "+ arr[j].Name);
        }
    }
}