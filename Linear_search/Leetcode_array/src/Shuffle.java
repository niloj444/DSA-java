import java.util.Arrays;

public class Shuffle {
    public static void main(String[] args) {
        int[] nums = {2, 5, 1, 3, 4, 7};
        int n = 3;
        int[] result = shuffle(nums, n);
        System.out.println(Arrays.toString(result));

    }

    static int[] shuffle(int[] nums, int n) {
        int[] f = new int[nums.length];

        for (int i = 0; i < n; i++) {
            f[2 * i] = nums[i];             //for x1,x2,x3 elements to get stored
            f[2 * i + 1] = nums[i + n];     // //for y1,y2,y3 elements to get stored
        }
        return f;
    }
}
/*ANOTHE APPROACH*/

//import java.util.Arrays;
//
//public class Shuffle {
//    public static void main(String[] args) {
//        int[] nums = {2, 5, 1, 3, 4, 7};
//        int n = 3;
//
//        int[] result = shuffle(nums, n);
//        System.out.println(Arrays.toString(result));
//    }
//
//    static int[] shuffle(int[] nums, int n) {
//        int[] result = new int[nums.length];
//
//        int k = 0;
//
//        for (int i = 0; i < n; i++) {
//            result[k] = nums[i];
//            k++;
//
//            result[k] = nums[i + n];
//            k++;
//        }
//
//        return result;
//    }
//}
