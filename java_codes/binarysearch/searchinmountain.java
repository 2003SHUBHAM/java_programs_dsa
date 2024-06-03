package binarysearch;

public class searchinmountain {
    public static void main(String[] args) {
        int [] arr = {4,5,6,7,0,1,2};
        int ans = search(arr,0);
        System.out.println(ans);
    }
    static  int search(int [] arr , int target){
        int max = findindex(arr);
        int start = 0;
        int end = arr.length -1;
        if( target >= arr[start]){
          return  binary(arr,0,max,target);
        }

        return  binary(arr,max +1,end,target);
    }
    static int binary(int [] arr , int start , int end , int target) {
        if (arr.length == 0) {
            return -1;
        }
        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (arr[start] < arr[mid]) {

                if (target > arr[mid]) {
                    start = mid + 1;
                } else if (target < arr[mid]) {
                    end = mid - 1;
                } else {
                    return mid;
                }
            } else {
                if (target > arr[mid]) {
                    end = mid - 1;
                } else if (target < arr[mid]) {
                    start = mid + 1;
                } else {
                    return mid;
                }
            }


        }
        return -1;
    }
    static int findindex(int [] arr){
        int start = 0;
        int end = arr.length -1;
        while(start < end){
            int mid = start +(end - start)/2;
            if(arr[mid] > arr[mid +1]){
                // it means you are in the left part of the array so use left side
                end = mid;
            }
            else {
                // it means that mid +1 element is lager than middle element so mid +1 may be the possible
                start = mid +1;
            }
        }
        return start ;
    }
}
