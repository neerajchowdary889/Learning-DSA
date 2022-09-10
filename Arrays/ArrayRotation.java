package Arrays;

public class ArrayRotation {
    public static void main (String[]args){
        int[] array = {1,2,3,4,5,6};
        int len = array.length;
        // rotations is d
        int d = 3;

        // Iteration start

        int j =0;
        int[] temp = new int[d];
        for (j = 0; j <= d - 1; j++) {
            temp[j] = array[j];
        }

        int tempint = 0;
        for (int k = d; k<=len; k++){
            array[tempint] = array[k];
        }

        for (int i = 0; i<=2 ; i++){

        }
    }
}
