package binarysearch;

public class infinitearray {
    public static void main(String[] args) {
  int [] nums = {2,3, 5,7,8,9,16,17,34,35,67,89,78,98};
  int target = 4;
  int ans = search(nums ,target);
        System.out.println(ans);
    }
    static int search(int []nums , int target){
        int start = 0;
        int end = 1;
       while(target > nums[end]){
          int temp = end +1;
           end = end + (end - start +1)*2;
           start = temp;
       }
     return bs(nums , target , start , end );

    }
    static int bs( int [] nums,int target , int start , int end ){
        while(start <= end) {
            // find the middle element
//            int mid = (start + end) / 2; // might be possible that (start + end) exceeds the range of int in java
            int mid = start + (end - start) / 2;

            if (target <  nums[mid]) {
                end = mid - 1;
            } else if (target >  nums[mid]) {
                start = mid + 1;
            } else {
                // ans found
                return mid;
            }
    }
        return -1;
    }

}
