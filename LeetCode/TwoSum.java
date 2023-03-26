package LeetCode;
import java.util.Scanner;
public class TwoSum {
    public int[] twoSum(int[] nums, int target){
        for(int i = 0; i <= nums.length; i++){
//            if(nums[i] + nums[i+1] == target){
//                int[] arr = {i , i+1};
//                return arr;
            for (int j =0; j <nums.length; j++){
                if (j == i){
                    continue;
                }
                else if(nums[i]+nums[j] == target){
                    int[] arr = {i , j};
                    return arr;
                }
                else{
                    continue;
                }
            }
        }
        return null;
    }
    public static void main (String[]args){
//        int[] array = {2,7,11,15};
//        int target = 18;
        int[] array = {3,2,3};
        int target = 6;
        TwoSum obj = new TwoSum();
        int[] value =  obj.twoSum(array, target);

        for(int i =0; i < value.length; i++){
            System.out.println(value[i]);
        }
    }
}
