// https://leetcode.com/problems/find-the-duplicate-number/
public class FindDuplicate {
    public int findDuplicate(int[] arr) {
        int i = 0;
        while (i < arr.length) {

            if (arr[i] != i + 1) {          // Check if the current element is at its correct position
            // For a number x, the correct index is x - 1

                int correct = arr[i] - 1;    
                // Find where the current element should be placed
                
                if (arr[i] != arr[correct]) {   // If the current number is not equal to the number
                // at its correct position, swap them
                    swap(arr, i , correct);
                } else {
                     // If both values are the same,
                    // it means the number already exists
                    // at its correct position
                    // Therefore, arr[i] is the duplicate
                    return arr[i];
                }
            } else {
                i++;
            }
        }
        return -1;
    }

    static void swap(int[] arr, int first, int second) {
        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;
    }
}