public class MountainArray {
    public static void main(String[] args) {

    }
    public int peakIndexMountainArray(int[] arr){
        int start=0;
        int end= arr.length-1;

            while(start <= end) {
            // find the middle element
            //int mid = (start + end) / 2; // might be possible that (start + end) exceeds the range of int in java
            int mid = start + (end - start) / 2;

            if (arr[mid]> arr[mid+1]) {
                // you are in dec part of the array
                // this may be the ans but look the LHS 
                end = mid;
            } else if (arr[mid]< arr[mid+1]) {
                // you are in the asc part of the array 
                start = mid + 1;    // bcz we know mid+1 element > mid element 
            }
        }
        return start;
        // in the end, start == end and pointing to the largest number bcz of above two checks
        // start and end are always trying to find max element in the above two checks
        // hence, when they are pointing to the just one element that is the max one bcz that is that what checks say
        // more eleboration: at every point of time for start and end, they have the best possible ans till that time and if we are saying that only one item is reamining hence bcz of above line that is the best possible answer
        
        }   
    }