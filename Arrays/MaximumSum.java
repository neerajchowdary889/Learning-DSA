package Arrays;
import java.util.Arrays;
class shiftarray{
    static int[] Shift(int[] array){
        int len = array.length;
        int z = 0;
        int temporary = array[z];
        for(int k = 0; k < len-1 ; k++){
            array[k] = array[k+1];
        }
        array[len-1] = temporary;
        int x = 0;
        while(x <= len -1){
            x++;
        }
        return array;
    }
}
public class MaximumSum {
    static int temp = 0;
    public static void main (String[]args){
        int[] array = {4, 9, 6, 5, 3};
        int len = array.length;
        int[] temparray = new int[len];
        for(int j = 0; j<=len-1; j++) {
            for (int i = 0; i <= len - 1; i++) {
                int arraytemp = array[i] * i;
                temp = temp + arraytemp;
            }
            temparray[j] = temp;
            System.out.println(temparray[j]);
            shiftarray.Shift(array);
            temp = 0;
        }
        Arrays.sort(temparray);
        System.out.println("Maximum Possible sum is : "+temparray[len-1]);
    }

}
