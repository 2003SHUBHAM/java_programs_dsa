package binarysearch;
import java.util.Arrays;
public class rotationbs {
    public static void main(String[] args) {
        int [] arr = {4,5,6,0,1,2,3};
        int target = 2;
        System.out.println(findelement(arr,target));
    }
    static int findelement(int [] arr,int target) {
        int pivot = findpivot(arr);
        int start = 0;
        int end = arr.length - 1;
        if (arr[start] > arr[pivot + 1]) {
            end = pivot;
            while (start <= end) {
                // find the middle element
//            int mid = (start + end) / 2; // might be possible that (start + end) exceeds the range of int in java
                int mid = start + (end - start) / 2;

                if (target < arr[mid]) {
                    end = mid - 1;
                } else if (target > arr[mid]) {
                    start = mid + 1;
                } else {
                    // ans found
                    return mid;
                }
            }

        }else {
            start = pivot +1;
            while (start <= end) {
                // find the middle element
//            int mid = (start + end) / 2; // might be possible that (start + end) exceeds the range of int in java
                int mid = start + (end - start) / 2;

                if (target < arr[mid]) {
                    end = mid - 1;
                } else if (target > arr[mid]) {
                    start = mid + 1;
                } else {
                    // ans found
                    return mid;
                }
            }

        }
        return -1;
    }
    static int findpivot(int [] arr){
        int  pivot = 0;
        int end =   arr.length - 1;


        while( pivot <end) {

            // find the middle element
//            int mid = (start + end) / 2; // might be possible that (start + end) exceeds the range of int in java
            int mid =  pivot + (end -  pivot) / 2;
            if( arr[mid] < arr[mid+1]) {
                 pivot = mid +1;

            }

            else  {
                end = mid;
            }

        }
        return  pivot;
    }
    }


