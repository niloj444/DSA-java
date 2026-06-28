import java.util.Arrays;

public class InsertionSort {
    public static void main(String[] args) {
        int[] arr = {5, 3, 4, 1, 2};

        // Call insertion sort method
        insertionSort(arr);

        // Print sorted array
        System.out.println(Arrays.toString(arr));
    }
    static void insertionSort(int[] arr){
        for (int i = 0; i < arr.length-1; i++) {
            for (int j = i+1; j >0 ; j--) {
                if(arr[j]<arr[j-1]){
                    swap(arr, j, j-1);
                }
                else{
                    break;
                }
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
