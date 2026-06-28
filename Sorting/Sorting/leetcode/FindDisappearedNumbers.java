//import java.util.ArrayList;
import java.util.*;
public class FindDisappearedNumbers {
    public static void main(String[] args) {
       int[] nums = {4,3,2,7,8,2,3,1};
       System.out.println(findDisappearedNumbers(nums));

    }
    public static List<Integer> findDisappearedNumbers(int [] nums){
        
        int i = 0;
        while (i < nums.length) {

        int correct = nums[i]-1;
        if(nums[i] != nums[correct]) {

                swap(nums, i, correct);
            } else {
                i++;
            }
        }

        // just find the missing numbers
        List<Integer> ans = new ArrayList<>();

        for (int index = 0; index < nums.length; index++) {

            if (nums[index] != index+1) {         // check if index no i containing the element or not
                ans.add(index+1);              // if not then add the missing number
            }
        }

        // If all indices are correct,
        // then the missing number is n
        // return that n 
        return ans;
    }
    static void swap(int[] arr, int first, int second) {
        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;
    }
}
  