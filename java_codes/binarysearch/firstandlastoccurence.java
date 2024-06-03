package binarysearch;
import java.util.Arrays;

public class firstandlastoccurence {
    public static void main(String[] args) {
     int [] nums = {9,4,5,5,5,5,5,3,3,3,2,2,4,5};
     int target = 2;
        System.out.println(Arrays.toString(search(nums, target)));
    }
    static int [] search(int [] nums , int target){
        int [] ans = {-1,-1};
        ans[0] = findstartindex(nums,target,true);
        if(ans[0] != -1){
            ans[1] = findstartindex(nums,target,false);
        }

        return ans;
    }
    static int findstartindex(int [] nums , int target , boolean startindex){
        int ans = -1;
        int start = 0;
        int end =  nums.length - 1;

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
                ans = mid;
                if(startindex ){
                    end = mid -1;
                }
                else {
                    start = mid +1;
                }
            }

    }
        return ans;
}
}
