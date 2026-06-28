public class MissingNumber {

    public static void main(String[] args) {
        int[] nums = {4, 0, 2, 1};

        System.out.println(missingNumber(nums));
    }

    static int missingNumber(int[] nums) {

        int i = 0;

        while (i < nums.length) {

            int correct = nums[i];

            // Place the number at its correct index
            // only if it is within array bounds
            if (nums[i] < nums.length &&
                    nums[i] != nums[correct]) {

                swap(nums, i, correct);
            } else {
                i++;
            }
        }

        // Find the first index whose value
        // does not match the index
        for (int index = 0; index < nums.length; index++) {

            if (nums[index] != index) {         // check if index no i containing the element or not
                return index;                   // if not then return the missing number
            }
        }

        // If all indices are correct,
        // then the missing number is n
        // return that n 
        return nums.length;
    }

    static void swap(int[] arr, int first, int second) {
        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;
    }
}