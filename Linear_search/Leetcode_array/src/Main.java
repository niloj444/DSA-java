import java.util.Arrays;

public class Main{
    public static void main(String[] args) {
        int[] arr={2,7,11,13};
        int target= 13;
        int [] ans=twoSum(arr, target);
        System.out.println(Arrays.toString(ans));

    }
        static int[] twoSum(int[] arr, int target){
            for(int i=0;i<arr.length;i++){
                for (int j =i+1 ; j < arr.length; j++) {
                    if(arr[i]+arr[j] == target){
                        return new int[]{i,j};
                    }
                }
            }
            return new int[]{};
        }

}