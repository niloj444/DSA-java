import java.util.Arrays;

public class CyclicSort {
    public static void main(String[] args) {
        int[] arr = {3, 5, 2, 1, 4};

        // Call cyclic sort method
        cyclicSort(arr);

        // Print sorted array
        System.out.println(Arrays.toString(arr));
    }
    static void cyclicSort(int[] arr){
        int i=0;
        while(i<arr.length) {
            int correct = arr[i]-1;          // Find the correct index for the current element 
            if(arr[i]!= arr[correct]){          //ex: 1st ith element is 3, now its correct index should be 3-1=2th index
                                            // If the current element is not at its correct position,
                swap(arr, i, correct);      // swap it with the element at its correct position
            }
            else{
                i++;                        //if at correct position then iterate to next check 
            }
        }
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
