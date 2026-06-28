public class MissingPositive {
    static int firstMissingPositive(int[] nums) {

        int i = 0;

        while (i < nums.length) {

            int correct = nums[i]-1;
            // Place the number at its correct index
            // only if it is within array bounds
            // also check that elements > 0
            if (nums[i] > 0 && nums[i] <= nums.length &&
                    nums[i] != nums[correct]) {     

                swap(nums, i, correct);
            } else {
                i++;
            }
        }

        // Find the first index whose value
        // does not match the index
        for (int index = 0; index < nums.length; index++) {

            if (nums[index] != index+1) {         // check if index no i containing the element or not
                return index+1;                   // if not then return the missing number
            }
        }

        // If all indices are correct,
        // then the missing number is n+1
        // return that n+1
        return nums.length+1;
    }

    static void swap(int[] arr, int first, int second) {
        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;
    }

}