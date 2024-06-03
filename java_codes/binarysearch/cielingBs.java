package binarysearch;

public class cielingBs {
    public static void main(String[] args) {
        int [] arr = {2,4,6,8,10};
        int ans = binary(arr,0,arr.length-1,80);
        System.out.println(ans);

    }
    //return the index of smallest element which is greater or equal to target element .
    static int binary(int [] arr , int start , int end , int target){
        if(arr.length ==0){
            return -1;
        }
        // if target element is greater than the element at last.
        if(target > arr[arr.length - 1]){
            return -1;
        }
        while (start <= end){
            int mid = start + (end-start)/2;

            if(target > arr[mid]){
                start = mid +1;
            }
            else if(target < arr[mid]){
                end = mid - 1;
            }
            else {
                return mid;
            }
        }
        return start ;
    }
}
