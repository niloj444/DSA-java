import java.util.*;

public class FindAllDuplicate {
    public static void main(String[] args) {
        
    }
    public List<Integer> findAllDuplicates(int[] nums){
        int i=0;
        while(i<nums.length) {
            int correct = nums[i]-1;          
            if(nums[i]!= nums[correct]){       
                swap(nums, i, correct);     
            }
            else{
                i++;                        //if at correct position then iterate to next check 
            }
        }
        //find all missing
        List<Integer> ans = new ArrayList<>();

        for (int index = 0; index < nums.length; index++) {

            if (nums[index] != index+1) {        
                ans.add(nums[index]);          // If a number is not at its correct position,
                                                // that number is duplicated somewhere else    
            }
        }
        return ans;
    }

    static void swap(int[] arr, int first, int second) {

        // Store first element temporarily
        int temp = arr[first];

        // Put second element at first position
        arr[first] = arr[second];

        // Put stored value at second position
        arr[second] = temp;
    }

}

