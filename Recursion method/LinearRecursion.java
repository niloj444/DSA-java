
import java.util.ArrayList;


public class LinearRecursion {
    public static void main(String[] args) {
         int [] arr={12,11,4,46};
         int target=4;
        System.out.println(find(arr, target,0));
        System.out.println(findIndex(arr, target,0));
        System.out.println(findLastIndex(arr, target,3));
    }
    static boolean find(int[] arr,int target, int index){
        if(index== arr.length){
            return false;
        }
        return arr[index]==target || find(arr, target, index+1);
    }
    static int findIndex(int[] arr,int target, int index){
        if(index== arr.length){
            return -1;
        }
        if(arr[index]==target){
            return index;
        }
        else{
        return  findIndex(arr, target, index+1);
        }
    }
    static int findLastIndex(int[] arr,int target, int index){
        if(index== -1){
            return -1;
        }
        if(arr[index]==target){
            return index;
        }
        else{
        return  findLastIndex(arr, target, index-1);
        }

        
    
}

}

