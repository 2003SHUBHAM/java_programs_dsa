//these codes are written  wrong. do it correct
public class Solution {
    public static void main(String[] args) {
        int [] nums = {0,2,1,5,3,4};
        int [] ans = {0,0,0,0,0,0};
        for (int i = 0; i <nums.length -1; i++) {
            nums[i+1]=  nums[i] + nums[i +1];

        }
        for (int element: nums
             ) {
            System.out.print(element + " ");

        }

        int [] num1 = { 1,2,1};
        int ans1 [] = {0,0,0,0,0,0};
        int n = num1.length;
        for (int i = 0; i < n; i++) {
            ans1[i]= num1[i];
            ans1[i+n] = num1[i];

        }
        System.out.println(" ");
        for (int element: ans1
             ) {
            System.out.print(element + " ");

        }
        int [][] accounts = {{1,2,3},{3,2,1}};
        int sum = 0;
        int sum1 = 0;
        int l = accounts.length;
        for (int i = 0; i <1 ; i++) {
            for(int j =0; j<=2;j++){
                sum += accounts[i][j];
//                sum1 +=  accounts[1][j];
            }

        }
        System.out.println(sum);
        System.out.println(sum1);
        if(sum>sum1){
            System.out.println("person first has more money");
        }
        else{
            System.out.println("person second has more money");
        }
    }
}