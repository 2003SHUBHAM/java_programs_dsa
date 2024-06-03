package arr;

import java.util.Arrays;

public class concatenationofarr {
    public static void main(String[] args) {
        int [] nums = {5,0,1,2,3,4};
        System.out.println(Arrays.toString(buildArray (nums)));
    }
    public static int[] buildArray(int[] nums) {

        int [] ans = new int [2*nums.length];
        for (int i = 0; i < nums.length; i++) {
            ans[i]=nums[i];
            ans[i + nums.length] = nums[i];


        }
        return ans;
    }
}
