public class findevendigit {
    public static void main(String[] args) {
        int [] nums = {44, 678, 12,4,7890};
        int ans = findNumbers(nums);
        System.out.println(ans);
    }
    static int findNumbers(int[] nums) {
            int result = 0;
            for (int i = 0; i < nums.length; i++) {
                if ((int)((Math.log10(nums[i])) + 1) % 2 == 0)
                    result++;
            }
            return result;
        }
}
