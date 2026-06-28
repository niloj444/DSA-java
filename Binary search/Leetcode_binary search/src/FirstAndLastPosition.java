import java.util.Arrays;

public class FirstAndLastPosition {
    public static void main(String[] args) {
        int[] nums={5,7,7,7,8,8,10};
        int target=7;
        System.out.println(Arrays.toString(searchRange(nums,target)));
        
    }

static int[] searchRange(int[] nums, int target) {

    int[] ans = {-1, -1};       // initalise as -1,-1 as said in question already

    // check for first occurrence
    int start = search(nums, target, true);

    // check for last occurrence
    int end = search(nums, target, false);

    ans[0] = start;
    ans[1] = end;

    return ans;
}
    // this function just returns the index value of target
static int search(int[] nums, int target, boolean findStartIndex) {
        int ans = -1;
        int start = 0;
        int end = nums.length - 1;
        while(start <= end) {
            // find the middle element
            //int mid = (start + end) / 2; // might be possible that (start + end) exceeds the range of int in java
            int mid = start + (end - start) / 2;

            if (target < nums[mid]) {
                end = mid - 1;
            } else if (target > nums[mid]) {
                start = mid + 1;
            } else {
                // potential ans found
                ans = mid;
                if (findStartIndex) {   // for true
                    end = mid - 1;      // may be the more ans can be possible lie in LHS
                } else {                // for false
                    start = mid + 1;    // may be the more ans can be possible lie in RHS
                }
            }
        }
        return ans;
    }
}