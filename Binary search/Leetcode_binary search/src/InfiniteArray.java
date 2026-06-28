public class InfiniteArray {
    public static void main(String[] args) {
        int[] arr = {3, 5, 7, 9, 10, 13, 15, 17, 19, 21, 23, 25, 27, 29, 31, 33, 35, 37, 39, 41, 43, 45, 47, 49, 51, 53, 55, 57, 59, 59, 61, 63};
        int target = 10;
        System.out.println(ans(arr,target));
    }
    static  int ans(int[] arr, int target){
        //fist find the range
        // first start with a box of size 2 for searching the target in infinite array
        int start =0;
        int end =1;

        //condition for the target 
        while (target>arr[end]){
            int newStart= end+1;
            //double the box value
            //end = previous end + sizeofbox*2
            end = end +  (end-start+1)*2;
            start = newStart;

        }
        return binarySearch(arr, target, start, end);  
    }



    static int binarySearch(int[] arr, int target, int start, int end) {
        while(start <= end) {
            // find the middle element
//            int mid = (start + end) / 2; // might be possible that (start + end) exceeds the range of int in java
            int mid = start + (end - start) / 2;

            if (target < arr[mid]) {
                end = mid - 1;
            } else if (target > arr[mid]) {
                start = mid + 1;
            } else {
                // ans found
                return mid;
            }
        }
        return -1;
    }
}
