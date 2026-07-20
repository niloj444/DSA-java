//https://www.geeksforgeeks.org/dsa/recursive-programs-to-find-minimum-and-maximum-elements-of-array/
public class MinMaxElements {

    public static void main(String[] args) {

        int[] arr = {1, 4, 3, -5, -4, 8, 6};

        minMax(arr);
    }

    static void minMax(int[] arr) {

        if (arr.length == 0) {
            System.out.println("Array is empty");
            return;
        }

        helper(arr, 1, arr[0], arr[0]);
    }

    static void helper(int[] arr, int index, int min, int max) {

        if (index == arr.length) {
            System.out.println("Minimum = " + min);
            System.out.println("Maximum = " + max);
            return;
        }

        if (arr[index] < min) {
            min = arr[index];
        }

            if (arr[index] > max) {
            max = arr[index];
        }

        helper(arr, index + 1, min, max);
    }
}