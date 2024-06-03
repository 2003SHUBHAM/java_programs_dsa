package binarysearch;

public class peakindexinmountainarray {
    public static void main(String[] args) {
        int [] nums = {2,4,6,8,6,5,4,3};
        int ans = peakelement(nums );
        System.out.println(ans);

    }
    static int peakelement(int [] nums){
        int start = 0;
        int end =  nums.length - 1;

        while(start <end) {

            // find the middle element
//            int mid = (start + end) / 2; // might be possible that (start + end) exceeds the range of int in java
            int mid = start + (end - start) / 2;
            if(nums[mid] <nums[mid+1]) {
               start = mid +1;
            }

           else  {
                end = mid;
            }

        }
        return start;
    }
    }

