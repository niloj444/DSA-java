public class RotationCount {

    public static void main(String[] args) {

        // Rotated sorted array
        int[] arr = {4, 5, 6, 7, 0, 1, 2};

        // Print the number of rotations
        System.out.println("Rotation Count: " + countRotations(arr));
    }

    static int countRotations(int[] arr) {

        // Search space starts from the entire array
        int start = 0;
        int end = arr.length - 1;

        // Continue until only one element remains
        while (start < end) {

            // Calculate middle index safely
            int mid = start + (end - start) / 2;

            /*
             * Compare middle element with the last element.
             *
             * Example:
             * [4,5,6,7,0,1,2]
             *            ^
             *           end
             *
             * If arr[mid] > arr[end],
             * then the minimum element must be on the right side.
             */

            if (arr[mid] > arr[end]) {

                // Discard left half including mid
                // because minimum cannot be there
                start = mid + 1;

            } else {

                /*
                 * arr[mid] <= arr[end]
                 *
                 * This means:
                 * 1. mid itself could be the minimum element
                 * 2. or the minimum lies somewhere on the left side
                 *
                 * Therefore, keep mid in the search space.
                 */

                end = mid;
            }
        }

        /*
         * Loop ends when start == end
         *
         * At this point only one element remains,
         * and that element is the minimum element.
         *
         * Index of minimum element = rotation count
         */

        return start;
    }
}