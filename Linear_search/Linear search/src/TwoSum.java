public class TwwoSum{
    public static void main(String[] args) {
        int[] arr={2,7,11,13};
        int target= 9;
        int ans=twoSum(arr, target);
        System.out.println(ans);

    }
    static int twoSum(int[] arr, int target){
        for(int i=0;i<arr.length;i++){
            for (int j =i+1 ; j < arr.length; j++) {
                int element = arr[i]+arr[j];
                if(element==target){
                    return i;
                }
            }
        }
    return -1;
    }

}