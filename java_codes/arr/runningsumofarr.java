package arr;

import java.util.Arrays;

public class runningsumofarr {
    public static void main(String[] args) {
        int [] nums = {1,1,1,1,1,1};
        System.out.println(Arrays.toString(buildArray (nums)));
    }
    public static int[] buildArray(int[] nums) {

//        int [] ans= new int [nums.length];
        for (int i = 1; i < nums.length; i++) {
            nums[i] =nums[i] + nums[i-1];

        }
        return nums;
    }
}
