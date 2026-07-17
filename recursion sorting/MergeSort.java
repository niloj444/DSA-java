//import java.util.Arrays;

import java.util.Arrays;

public class MergeSort{
    public static void main(String [] args){
        int [] arr={5,4,3,2,1};
        arr=mergeSort(arr);
        System.out.println(Arrays.toString(arr));


    }
    static int [] mergeSort(int [] arr){
        if(arr.length == 1){        //   base condition
            return arr;
        }

        int mid=arr.length/2;          //devide the arr into 2 parts

        int []left=mergeSort(Arrays.copyOfRange(arr,0,mid));
        int []right=mergeSort(Arrays.copyOfRange(arr,mid,arr.length));

        return merge(left, right);

    }

    static int [] merge (int[] first, int [] second){
        int[] mix = new int [first.length + second.length];
        int i=0;
        int j=0;
        int k=0;
        
        // run until out of bound 
        while(i<first.length && j<second.length){
            if(first[i] < second[j]){       // if first of i is smalled than second if j, then add first of i in mix
                mix[k]=first[i];        
                i++;
            }
            else {
                mix[k]=second[j];           //else add second of j
                j++;
            }
            k++;
        }
        //it may be possible that one of the array is not complete(have some extra elements)
        //copy the remaining elements to mix[k] 
        while(i< first.length){
            mix[k]=first[i];
            i++;
            k++;
        }
        while(j< second.length){
            mix[k]=second[j];
            j++;
            k++;
        }
        return mix;
    }
}