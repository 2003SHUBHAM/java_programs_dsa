public class maximumwealth {
    public static void main(String[] args) {
       int [][] accounts = {{4,7,9},{4,2,1,5},{3,6,8,9,0}};
       int max = maximumwealth(accounts);
        System.out.println(max);

    }
    static int maximumwealth(int [][] accounts ){
        int ans = Integer.MIN_VALUE;
        for (int [] acc:accounts
             ) {
            int sum = 0;
            for (int element : acc
                 ) {
                sum += element;
            }
            if(sum > ans){
                ans = sum;
            }
        }
        return ans;

    }
}
