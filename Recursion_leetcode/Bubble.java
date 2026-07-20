import java.util.Arrays;

public class Bubble {
    public static void main(String[] args) {
        int [] arr= {5,1,4,2,3};
        sorting(arr, 4);
        System.out.println(Arrays.toString(arr));
    }
    static void sorting(int[] arr, int n){
        // base case
        if(n==1){
            return;
        }
        int count=0;

    for (int i = 1; i < arr.length; i++){
        if(arr[i]<arr[i-1]){
            int temp= arr[i];
            arr[i]=arr[i-1];
            arr[i-1]=temp;
            count++;
        }

    }
    if (count==0){
        return;
    }
    sorting(arr,n-1);
    }
}
