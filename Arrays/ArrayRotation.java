package Arrays;

public class ArrayRotation {
    public static void main (String[]args){
        int[] array = {1,2,3,4,5,6,7,8,9,10};
        int len = array.length;

        // rotations is d
        int d = 5;

        // Iteration start

        int j =0;
        int[] temp = new int[d];
        for (j = 0; j <= d - 1; j++) {
            temp[j] = array[j];
        }

        int tempint = 0;
        for (int k = d; k<=len-1; k++){
            array[tempint] = array[k];
            tempint++;
        }

        int tempint2 = 0;
        for (int i = len-d; i<=len-1 ; i++){
            array[i] = temp[tempint2];
            tempint2++;
        }

        for (int z = 0; z <=len-1; z++){
            System.out.println(array[z]);
        }
    }
}
// Output: 6, 7, 8, 9, 10, 1, 2, 3, 4, 5