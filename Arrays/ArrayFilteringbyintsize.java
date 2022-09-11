package Arrays;

public class ArrayFilteringbyintsize {
    public static void main (String[]args){

        int[] array = {1,4,3,6,7,2,9,5,0};
        int len = array.length;

        // Block b input
        int b = 3;

        //Itertion start
        int j = 0;
        int z = 0;
        int[] temp = new int[len];
        int[] Array = new int[len];
        for (int i = 0; i < len; i++){
            //Seperating elements<d to temp and elements>d to Array

            int obj = array[i];
            if (obj<=b){
                temp[j] = array[i];
                j++; // j is the pointer that indicate the len of temp array.
            }

            else if(obj > b){
                Array[z] = array[i];
                z++; // z is the pointer that indicates the No.of elements that > b.
            }

        }
        // Appending the temp elements to the Array.
        int a = 0;
        for (int k = len-j; k<= len-1; k++){
            Array[k] = temp[a];
            a++;
        }

        // Printing all elements.
        for(int d = 0; d<=len-1; d++){
            System.out.println(Array[d]);
        }

    }
}
// Output will be 4, 6, 7, 9, 5, 1, 3, 2, 0