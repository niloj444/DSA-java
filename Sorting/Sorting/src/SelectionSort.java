import java.util.Arrays;

public class SelectionSort {

    public static void main(String[] args) {

        // Array to be sorted
        int[] arr = {5, 4, 3, 2, 1};

        // Call selection sort method
        selectionSort(arr);

        // Print sorted array
        System.out.println(Arrays.toString(arr));
    }

    static void selectionSort(int[] arr) {

        // Outer loop runs n times
        for (int i = 0; i < arr.length; i++) {

            // Find the last index of the unsorted part
            // After every pass, one element gets sorted at the end
            int lastIndex = arr.length - 1 - i;

            // Find the index of the maximum element
            // from index 0 to last
            int maxIndex = getMaxIndex(arr, 0, lastIndex);

            // Place the maximum element at its correct position
            swap(arr, maxIndex, lastIndex);
        }
    }

    // Returns the index of the maximum element
    // between start and last indices
    static int getMaxIndex(int[] arr, int start, int last) {

        // Assume first element is maximum
        int max = start;

        // Traverse the unsorted part of the array
        for (int i = start; i <= last; i++) {

            // If current element is greater than current maximum
            if (arr[i] > arr[max]) {

                // Update maximum index
                max = i;
            }
        }

        // Return index of largest element found
        return max;
    }

    // Swaps two elements in the array
    static void swap(int[] arr, int first, int second) {

        // Store first element temporarily
        int temp = arr[first];

        // Put second element at first position
        arr[first] = arr[second];

        // Put stored value at second position
        arr[second] = temp;
    }
}