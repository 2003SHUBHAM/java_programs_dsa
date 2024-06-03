package binarysearch;

public class orderagnosticbs {
    public static void main(String[] args) {
        int [] arr = {9,8,7,6,5,4,3,2,1};
        int target = 4;
        System.out.println( binarySearch(arr,target));

    }

    static int binarySearch(int[] arr, int target) {
        int start = 0;
        int end = arr.length - 1;

        while (start <= end) {
            // find the middle element
//            int mid = (start + end) / 2; // might be possible that (start + end) exceeds the range of int in java
            int mid = start + (end - start) / 2;
            if (arr[start] < arr[end]) {
                if (target < arr[mid]) {
                    end = mid - 1;
                } else if (target > arr[mid]) {
                    start = mid + 1;
                } else {
                    // ans found
                    return mid;
                }
            }
            else{
                if (target < arr[mid]) {
                   start = mid +1;
                } else if (target > arr[mid]) {
                    end = mid -1;
                } else {
                    // ans found
                    return mid;
                }
            }
        }
        return -1;
    }
}