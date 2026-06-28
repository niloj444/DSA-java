public class SearchInRotatedSortedArray {
         static int search(int[] nums, int target) {

            // Initialize the search range
            int start = 0;
            int end = nums.length - 1;

            // Continue searching while the range is valid
            while (start <= end) {

                // Find the middle elementl
                int mid = start + (end - start) / 2;

                // If target is found, return its index
                if (nums[mid] == target) {
                    return mid;
                }

                // Check if the left half is sorted
                if (nums[start] <= nums[mid]) {

                    // Check if target lies in the sorted left half
                    if (target >= nums[start] && target < nums[mid]) {

                        // Search in the left half
                        end = mid - 1;

                    } else {

                        // Search in the right half
                        start = mid + 1;
                    }

                } else {

                    // Right half is sorted

                    // Check if target lies in the sorted right half
                    if (target > nums[mid] && target <= nums[end]) {

                        // Search in the right half
                        start = mid + 1;

                    } else {

                        // Search in the left half
                        end = mid - 1;
                    }
                }
            }

            // Target not found
            return -1;
        }

        public static void main(String[] args) {

            int[] nums = {4, 5, 6, 7, 0, 1, 2};
            int target = 0;

            int result = search(nums, target);

            System.out.println("Target found at index: " + result);
        }
    }

